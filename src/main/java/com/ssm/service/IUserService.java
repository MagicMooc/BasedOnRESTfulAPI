package com.ssm.service;

import com.ssm.entity.User;

/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/18
 * @time: 22:43
 * Ps: UserService接口类
 */
public interface IUserService {

    public User selectUser(long userId);

}