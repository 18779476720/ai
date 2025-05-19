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
public class MobilePhoneDesensitize implements DesensitizeStrategy {
    @Override
    public String desensitize(String phone) {
        if (phone == null || phone.length() < 11) return "*******";
        return phone.replaceAll("(\\d{3})\\d{4}(\\d{4})", "$1****$2");
    }

    @Override
    public SensitiveTypeEnum getType() {
        return SensitiveTypeEnum.MOBILE_PHONE;
    }
}
