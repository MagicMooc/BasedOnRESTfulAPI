package com.ssm.controller;

import com.ssm.entity.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/18
 * @time: 22:43
 * Ps: UserController
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private IUserService userService;

    //  返回jsp页面
    @RequestMapping("/getUserJSP")
    public ModelAndView getUserJSP(@RequestParam("id") long id) {
        User user = this.userService.selectUser(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("user");
        mv.addObject("user", user);
        return mv;
    }

    //  用ResponseBody返回json格式内容
    @ResponseBody
    @RequestMapping("/getUserResponseBody")
    public User getUserResponseBody(@RequestParam("id") long id) {
        User user = this.userService.selectUser(id);
        return user;
    }

    @ResponseBody
    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user) {
        this.userService.addUser(user);
        return "{\"code\": 1, \"msg\": \"添加成功\"}";
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public String updateUser(@RequestBody User user) {
        this.userService.updateUser(user);
        return "{\"code\": 1, \"msg\": \"修改成功\"}";
    }

    @ResponseBody
    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") long id) {
        this.userService.deleteUser(id);
        return "{\"code\": 1, \"msg\": \"删除成功\"}";
    }
}