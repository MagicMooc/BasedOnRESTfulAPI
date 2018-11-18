package com.ssm.model;

/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/16
 * @time: 19:47
 */
public class Account {

    private Integer id;
    private String name;
    private String registerTime;

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

    public String getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(String registerTime) {
        this.registerTime = registerTime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registerTime='" + registerTime + '\'' +
                '}';
    }
}
