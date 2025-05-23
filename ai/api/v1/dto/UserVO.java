package com.sceen.ai.api.v1.dto;

/**
 * @author lu.cheng@seecen.com
 * @description
 * @date 2025/5/22 10:15
 * @version:1.0
 */
public class UserVO {
    private String username;
    private String password;
    private boolean loginFlag;
    private String token;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(boolean loginFlag) {
        this.loginFlag = loginFlag;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
