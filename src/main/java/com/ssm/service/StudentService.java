package com.ssm.service;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:37 PM
 */
public interface StudentService {


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
     * @param id
     * @return
     */
    public Student selectStudentById(String studentId);

    /**
     * 添加学生
     * @param student
     * @return
     */
    public Integer insertStudent(Student student);

    /**
     * 更新学生信息
     * @param student
     * @return
     */
    public Integer updateStudent(Student student);

    /**
     * 根据id删除
     * @param id
     * @return
     */

    Integer deleteStudent(String studentId);

}
