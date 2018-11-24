package com.ssm.service.impl;

import com.ssm.dao.IUserDao;
import com.ssm.entity.User;
import com.ssm.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * @email: dong980514280@gmail.com
 * @author: Dong
 * @date: 2018/11/18
 * @time: 22:43
 * Ps: UserServiceImpl类
 */
@Service("userService")
@Transactional(readOnly = true)
public class UserServiceImpl implements IUserService {

    @Resource
    private IUserDao userDao;

    public User selectUser(long userId) {
        return this.userDao.selectUser(userId);
    }

    @Transactional(readOnly = false)
    public Integer addUser(User user){
        return this.userDao.addUser(user);
    }

    @Transactional(readOnly = false)
    public Integer updateUser(User user){
        return this.userDao.updateUser(user);
    }

    @Transactional(readOnly = false)
    public Integer deleteUser(long id){
        return this.userDao.deleteUser(id);
    }

}