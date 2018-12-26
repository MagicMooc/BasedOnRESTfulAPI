package com.ssm.controller;

import com.ssm.common.bean.VResponse;
import com.ssm.entity.Student;
import com.ssm.service.StudentClassCourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 5:42 PM
 * 一个学生对应的班级下对应的某个课程对应某个老师
 */
@CrossOrigin
@RestController
@RequestMapping("/stu")
public class StudentClassCourseTeacherController {

    @Autowired
    private StudentClassCourseTeacherService studentClassCourseTeacherService;

    @GetMapping(value = "/findStudentClassCourseTeacherList")
    public VResponse<List<Student>> findStudentClassCourseTeacherList(){
        List<Student> list = studentClassCourseTeacherService.findStudentClassCourseTeacherList();
        return VResponse.success(list);
    }


    @GetMapping(value = "/findStudentClassCourseTeacherListByStudentId")
    public VResponse<List<Student>> findStudentClassCourseTeacherListByStudentId(@RequestParam(value = "studentId") String studentId){
        List<Student> list = studentClassCourseTeacherService.findStudentClassCourseTeacherListByStudentId(studentId);
        return VResponse.success(list);
    }

}
