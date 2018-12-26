package com.ssm.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:36 PM
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Student implements Serializable {

    private long id;

    private String studentId;

    private String name;

    private String sex;

    private String major;

    private ClassName className;

    private Course course;

    private Teacher teacher;


}
