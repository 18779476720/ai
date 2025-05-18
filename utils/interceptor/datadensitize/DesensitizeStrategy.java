package com.sceen.utils.interceptor.datadensitize;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/18 10:42
 * @version:1.0
 */
public interface DesensitizeStrategy {
    String desensitize(String data);
    SensitiveTypeEnum getType();
}
