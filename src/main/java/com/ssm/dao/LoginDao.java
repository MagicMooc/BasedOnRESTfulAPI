package com.ssm.dao;

import com.ssm.entity.Login;
import org.springframework.stereotype.Repository;


/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/20
 * @Time: 8:01 PM
 */
@Repository
public interface LoginDao{
    int register(Login login);

    Login findUser(Login login);
}
