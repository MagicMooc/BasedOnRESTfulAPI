package com.ssm.controller;

import com.alibaba.fastjson.JSONObject;
import com.ssm.entity.Login;
import com.ssm.service.AuthenticationService;
import com.ssm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthenticationController {
    private AuthenticationService authenticationService;
    private LoginService loginService;

    @Autowired
    public AuthenticationController(AuthenticationService authenticationService, LoginService loginService) {
        this.authenticationService = authenticationService;
        this.loginService = loginService;
    }

    @PostMapping("/authentication")
    public Object login(@RequestBody Login login) {
        Login userInDataBase = loginService.findByLoginName(login.getLoginName());
        JSONObject jsonObject = new JSONObject();
        if (userInDataBase == null) {
            jsonObject.put("error", "用户不存在");
        } else if (!loginService.comparePassword(login, userInDataBase)) {
            jsonObject.put("error", "密码不正确");
        } else {
            String token = authenticationService.getToken(userInDataBase);
            jsonObject.put("token", token);
            jsonObject.put("login", userInDataBase);
        }
        return jsonObject;
    }
}
