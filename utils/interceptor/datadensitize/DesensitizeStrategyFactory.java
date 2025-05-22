package com.sceen.utils.interceptor.datadensitize;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:44
 * @version:1.0
 */
@Component
public class DesensitizeStrategyFactory {

    private final Map<SensitiveTypeEnum, DesensitizeStrategy> strategyMap = new EnumMap<>(SensitiveTypeEnum.class);

    @Resource
    private List<DesensitizeStrategy> strategies;

    @PostConstruct
    public void init() {
        for (DesensitizeStrategy strategy : strategies) {
            strategyMap.put(strategy.getType(), strategy);
        }
    }

    public DesensitizeStrategy getStrategy(SensitiveTypeEnum type) {
        return strategyMap.get(type);
    }
}