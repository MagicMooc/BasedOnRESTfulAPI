package com.ssm.entity;

import java.io.Serializable;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:36 PM
 */
public class Student implements Serializable {

    private long id;

    private String name;

    private String sex;

    private String major;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Student() {
    }

    public Student(long id, String name, String sex, String major) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
