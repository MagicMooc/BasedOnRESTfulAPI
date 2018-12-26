package com.ssm.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 5:51 PM
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class Course {

    private Integer id;

    private String courseId;

    private String courseName;
}
