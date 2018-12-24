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

    @Autowired
    private UserService userService;

    /**
     * 注册一个新用户
     * @param user
     * @return
     */
    @PostMapping("/register")
    public Object register(@RequestBody User user) {
        if (userService.findByName(user.getName()) != null) {
            return VResponse.error(0,"注册失败");
        }
        userService.register(user);
        return VResponse.success("注册成功");
    }

}
