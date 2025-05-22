package com.sceen.utils.interceptor.datadensitize;

import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Field;
import java.util.Collection;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:45
 * @version:1.0
 */
@ControllerAdvice
public class SensitiveDataInterceptor implements ResponseBodyAdvice<Object> {

    private final DesensitizeStrategyFactory strategyFactory;

    public SensitiveDataInterceptor(DesensitizeStrategyFactory strategyFactory) {
        this.strategyFactory = strategyFactory;
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType,
                                  Class<? extends HttpMessageConverter<?>> selectedConverterType,
                                  ServerHttpRequest request, ServerHttpResponse response) {

        if (body == null) return body;

        processObject(body);

        return body;
    }

    private void processObject(Object obj) {
        if (obj instanceof Collection<?>) {
            ((Collection<?>) obj).forEach(this::processField);
        } else if (obj.getClass().isArray()) {
            for (Object item : (Object[]) obj) {
                processField(item);
            }
        } else {
            processField(obj);
        }
    }

    private void processField(Object obj) {
        if (obj == null) return;

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getDeclaringClass().getName().startsWith("java.util")) {
                return; // 跳过 JDK 内置类字段
            }
            field.setAccessible(true);
            if (field.isAnnotationPresent(Sensitive.class)) {
                try {
                    Sensitive sensitive = field.getAnnotation(Sensitive.class);
                    DesensitizeStrategy strategy = strategyFactory.getStrategy(sensitive.type());
                    if (strategy != null) {
                        Object value = field.get(obj);
                        if (value != null) {
                            field.set(obj, strategy.desensitize(value.toString()));
                        }
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}