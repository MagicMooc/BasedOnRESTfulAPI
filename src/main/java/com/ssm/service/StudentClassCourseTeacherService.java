package com.ssm.service;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 7:33 PM
 */
public interface StudentClassCourseTeacherService {

    List<Student> findStudentClassCourseTeacherList();

    List<Student> findStudentClassCourseTeacherListByStudentId(@Param("studentId") String studentId);
}
