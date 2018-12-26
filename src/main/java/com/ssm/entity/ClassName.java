package com.ssm.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 5:49 PM
 * 班级
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class ClassName {

    private Integer id;

    private String classId;

    private String className;

}
