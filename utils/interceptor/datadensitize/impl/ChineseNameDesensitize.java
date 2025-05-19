package com.sceen.utils.interceptor.datadensitize.impl;

import com.sceen.utils.interceptor.datadensitize.DesensitizeStrategy;
import com.sceen.utils.interceptor.datadensitize.SensitiveTypeEnum;
import org.springframework.stereotype.Component;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:43
 * @version:1.0
 */
@Component
public class ChineseNameDesensitize implements DesensitizeStrategy {
    @Override
    public String desensitize(String name) {
        if (name == null || name.length() < 2) return "*";
        return name.charAt(0) + "*".repeat(name.length() - 1);
    }

    @Override
    public SensitiveTypeEnum getType() {
        return SensitiveTypeEnum.CHINESE_NAME;
    }
}
