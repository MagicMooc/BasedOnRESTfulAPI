package com.ssm.dao;

import com.ssm.model.User;


/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/18
 * @time: 22:43
 * Ps: UserDao
 */
public interface IUserDao {

    User selectUser(long id);

}