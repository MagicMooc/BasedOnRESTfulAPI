package com.ssm.controller;

import com.ssm.common.bean.BaseController;
import com.ssm.common.bean.VResponse;
import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/1
 * @Time: 4:36 PM
 * 传Json
 */

@Controller
@RequestMapping("/student")
public class StudentController{

    @Resource
    private StudentService studentService;

    /**
     * 测试用，返回jsp页面
     * @param id
     * @return
     */
    @GetMapping(value = "/getStudentJsp")
    public ModelAndView getStudentJsp(@RequestParam("id") long id){
        Student student =this.studentService.selectStudentById(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student");
        mv.addObject("student", student);
        return mv;
    }

    /**
     * 使用ResponseBody返回Json格式数据
     * @param id
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/findStudentById")
    public Student findStudentById(@RequestParam("id") long id){
        Student student = this.studentService.selectStudentById(id);
        return student;
    }


    /**
     * 查询所有返回为一个List
     * @param page
     * @param size
     * @return
     */
    @ResponseBody
    @GetMapping(value = "/findStudentList")
    public VResponse<List<Student>> findStudentList(@RequestParam(value = "page",defaultValue = "1") Integer page,
                                                @RequestParam(value = "size",defaultValue = "20") Integer size){
        List<Student> list = studentService.findStudentList(page,size);
        Integer amount =studentService.findStudentListCount();
        return VResponse.result(amount,list);
    }

    /**
     * 增加用户
     * @param student
     * @return
     */
    @ResponseBody
    @PutMapping(value = "/insertStudent")
    public VResponse<Object> insertStudent(@RequestBody Student student) {
        this.studentService.insertStudent(student);
        return VResponse.success("添加成功");
    }

    /**
     * 修改用户
     * @param student
     * @return
     */
    @ResponseBody
    @PutMapping(value = "/updateStudent")
    public VResponse<Object> updateStudent(@RequestBody Student student) {
        this.studentService.updateStudent(student);
        return VResponse.success("修改成功");
    }

    /**
     *  删除用户
     * @param id
     * @return
     * 传参数id删除
     */
    @ResponseBody
    @DeleteMapping(value = "/deleteStudent")
    public VResponse<Object> deleteStudent(@RequestParam("id") long id) {
        this.studentService.deleteStudent(id);
        return VResponse.success("删除成功");
    }


}
