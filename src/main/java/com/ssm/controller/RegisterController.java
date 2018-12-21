package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.Login;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/20
 * @Time: 9:31 PM
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class RegisterController {


    private LoginService loginService;
    @Autowired
    public RegisterController(LoginService loginService){
        this.loginService = loginService;
    }

    @PostMapping("/register")
    public Object add(@RequestBody Login login) {
        if (loginService.findByLoginName(login.getLoginName()) != null) {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("error","用户名已被使用");
            return jsonObject;
        }
        return loginService.add(login);
    }


}
