package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 5:46 PM
 */
@Mapper
public interface StudentClassCourseTeacherDao {

    List<Student> findStudentClassCourseTeacherList();


    List<Student> findStudentClassCourseTeacherListByStudentId(@Param("studentId") String studentId);
}
