package com.sceen.ai.domain.entity;

import com.sceen.utils.interceptor.datadensitize.Sensitive;
import com.sceen.utils.interceptor.datadensitize.SensitiveTypeEnum;

import java.io.Serializable;

/**
 * (Employees)实体类
 *
 * @author makejava
 * @since 2025-05-18 09:20:24
 */
public class Employees implements Serializable {
    private static final long serialVersionUID = -61166745547834842L;
    
    private Integer id;
    
    private String name;
    
    private Integer age;

    @Sensitive(type = SensitiveTypeEnum.MOBILE_PHONE)
    private String gender;
    
    private Integer departmentId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

}

