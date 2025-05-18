package com.sceen.utils.interceptor.datadensitize;

import java.lang.annotation.*;

/**
 * @author lu.cheng@seecen.com
 * @description:数据脱敏拦截器，如需扩展只需要添加枚举类型即可，实现添加的策略即可
 * @date 2025/5/18 10:44
 * @version:1.0
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Sensitive {
    SensitiveTypeEnum type();
}
