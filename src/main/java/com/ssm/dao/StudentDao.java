package com.ssm.dao;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:38 PM
 */
public interface StudentDao {

    /**
     * 查询出所有数据
     */
    List<Student> findStudentList(@Param("page") Integer pages, @Param("size") Integer size);

    /**
     * 统计
     */
    Integer findStudentListCount();

    /**
     * 通过id查询学生
     * @param
     * @return
     */
    Student selectStudentById(String studentId);

    /**
     * 添加学生
     * @param student
     * @return
     */
    Integer insertStudent(Student student);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    Integer updateStudent(Student student);


    Integer deleteStudent(String studentId);



}
