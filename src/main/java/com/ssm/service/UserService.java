package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    /**
     * 注册，新增用户
     * @param user
     * @return
     */
    public User register(User user) {
        String passwordHash =  passwordToHash(user.getPassword());
        user.setPassword(passwordHash);
        userDao.register(user);
        return findById(user.getId());
    }

    /**
     * 通过哈希加密密码
     * @param password
     * @return
     */
    private String passwordToHash(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            digest.update(password.getBytes());
            byte[] src = digest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            // 字节数组转16进制字符串
            // https://my.oschina.net/u/347386/blog/182717
            for (byte aSrc : src) {
                String s = Integer.toHexString(aSrc & 0xFF);
                if (s.length() < 2) {
                    stringBuilder.append('0');
                }
                stringBuilder.append(s);
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException ignore) {
        }
        return null;
    }

    /**
     * 根据id查找某个用户
     * @param id
     * @return
     */
    public User findById(int id) {
        User user = new User();
        user.setId(id);
        return userDao.findOne(user);
    }

    /**
     * 根据姓名查找某个用户信息
     * @param name
     * @return
     */
    public User findByName(String name) {
        User param = new User();
        param.setName(name);
        return userDao.findOne(param);
    }

    /**
     * 将前端键入的密码转换为hash，与数据库对应的密码进行匹配
     * @param user
     * @param userInDataBase
     * @return
     */
    public boolean comparePassword(User user, User userInDataBase) {
        // 将用户提交的密码转换为 hash
        return passwordToHash(user.getPassword())
                // 数据库中的 password 已经是 hash，不用转换
                .equals(userInDataBase.getPassword());
    }
}
