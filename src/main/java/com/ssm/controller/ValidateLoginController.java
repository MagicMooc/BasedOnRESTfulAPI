package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.User;
import com.ssm.service.AuthenticationService;
import com.ssm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/21
 * @Time: 5:19 PM
 * 登录验证
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class ValidateLoginController {
    @Autowired
    private AuthenticationService authenticationService;
    @Autowired
    private UserService userService;

    /**
     * 根据姓名查找数据库是否存在该用户，如果没有，则返回用户不存在；
     * 如果存在用户，则匹配密码是否正确
     * 如果都正确，返回token，显示登录成功
     * @param user
     * @return
     */
    @PostMapping("/validateLogin")
    public Object login(@RequestBody User user) {
        User userInDataBase = userService.findByName(user.getName());
        JSONObject jsonObject = new JSONObject();
        if (userInDataBase == null) {
            jsonObject.put("code",0);
            jsonObject.put("error", "用户不存在");
        } else if (!userService.comparePassword(user, userInDataBase)) {
            jsonObject.put("code",1);
            jsonObject.put("error", "密码不正确");
        } else {
            String token = authenticationService.getToken(userInDataBase);
            jsonObject.put("code",2);
            jsonObject.put("msg","登录成功");
            jsonObject.put("token", token);
            jsonObject.put("login", userInDataBase);
        }
        return jsonObject;
    }
}