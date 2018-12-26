package com.ssm.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/21
 * @Time: 4:57 PM
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class User {

    private Integer id; // 这里不用 int， 应为 int 自动初始化为0，mybatis mapper 文件 就不能使用 <if test="id!=null"> 了
    private String name;
    private String password;
}
