package com.ssm.dao;

import com.ssm.entity.User;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/21
 * @Time: 4:58 PM
 */
public interface UserDao {

    int add(User user);

    User findOne(User user);
}
