package com.ssm.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 6:48 PM
 */
@Data
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class StudentClassCourseTeacher {

    private Integer id;

    private String studentId;

    private String classId;

    private String courseId;

    private String teacherId;


}
