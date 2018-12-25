package com.ssm.service.impl;

import com.ssm.dao.StudentDao;
import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:36 PM
 */

@Service("StudentService")
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    @Autowired

    private StudentDao studentDao;


    public List<Student> findStudentList(Integer page, Integer size) {
        Integer pages =(page -1)*size;
        return studentDao.findStudentList(pages,size);
    }

    public Integer findStudentListCount() {
        return studentDao.findStudentListCount();
    }

    public Student selectStudentById(String studentId) {
        return studentDao.selectStudentById(studentId);
    }

    @Transactional(readOnly = false)
    public Integer insertStudent(Student student) {
        return studentDao.insertStudent(student);
    }

    @Transactional(readOnly = false)
    public Integer updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    @Transactional(readOnly = false)

    public Integer deleteStudent(String studentId) {
        return this.studentDao.deleteStudent(studentId);
    }

}
