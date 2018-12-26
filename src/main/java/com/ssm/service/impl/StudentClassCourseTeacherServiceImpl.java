package com.ssm.service.impl;

import com.ssm.dao.StudentClassCourseTeacherDao;
import com.ssm.entity.Student;
import com.ssm.service.StudentClassCourseTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/25
 * @Time: 7:33 PM
 */
@Service
@Transactional(readOnly = true)
public class StudentClassCourseTeacherServiceImpl implements StudentClassCourseTeacherService {


    @Autowired
    private StudentClassCourseTeacherDao studentClassCourseTeacherDao;

    @Override
    public List<Student> findStudentClassCourseTeacherList() {
        return studentClassCourseTeacherDao.findStudentClassCourseTeacherList();
    }

    @Override
    public List<Student> findStudentClassCourseTeacherListByStudentId(String studentId) {
        return studentClassCourseTeacherDao.findStudentClassCourseTeacherListByStudentId(studentId);
    }
}
