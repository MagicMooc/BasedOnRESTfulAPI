package com.ssm.controller;
import com.ssm.common.bean.VResponse;
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
            return VResponse.error(0,"注册失败");
        }
        userService.add(user);
        return VResponse.success("注册成功");
    }


}
