package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.User;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/20
 * @Time: 9:31 PM
 * 注册
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class RegisterController {


    private UserService userService;
    @Autowired
    public RegisterController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/register")
    public Object add(@RequestBody User user) {
        if (userService.findByName(user.getName()) != null) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("code",2);
            jsonObject.put("msg","注册失败");
            jsonObject.put("error","用户名已被使用");
            return jsonObject;
        }
        return userService.add(user);
    }


}
