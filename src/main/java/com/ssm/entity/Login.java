package com.ssm.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/20
 * @Time: 7:48 PM
 */

public class Login implements Serializable {

    private Integer id;

    private String loginName;

    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Login() {
    }

    public Login(Integer id, String loginName, String password) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
