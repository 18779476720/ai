package com.sceen.user.domain.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sceen.utils.interceptor.datadensitize.Sensitive;
import com.sceen.utils.interceptor.datadensitize.SensitiveTypeEnum;

/**
 * (User)实体类
 *
 * @author lu.cheng@purpleori.com
 * @since 2025-05-22 14:24:58
 */


@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class User {
    private static final long serialVersionUID = 114673964317969972L;

    public static final String FIELD_ID = "id";
    public static final String FIELD_CODE = "code";
    public static final String FIELD_NAME = "name";
    public static final String FIELD_PHONE = "phone";
    public static final String FIELD_SEX = "sex";
    public static final String FIELD_EMAIL = "email";
    public static final String FIELD_ROLE = "role";
    public static final String FIELD_CREATE_DATE = "createDate";
    public static final String FIELD_CREATE_BY = "createBy";
    public static final String FIELD_LAST_UPDATE_BY = "lastUpdateBy";


    private Long id;

    private String code;

    private String name;

    @Sensitive(type = SensitiveTypeEnum.MOBILE_PHONE)
    private String phone;

    private String sex;

    @Sensitive(type = SensitiveTypeEnum.EMAIL)
    private String email;

    private String role;

    private Date createDate;

    private Long createBy;

    private Long lastUpdateBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getLastUpdateBy() {
        return lastUpdateBy;
    }

    public void setLastUpdateBy(Long lastUpdateBy) {
        this.lastUpdateBy = lastUpdateBy;
    }
}

