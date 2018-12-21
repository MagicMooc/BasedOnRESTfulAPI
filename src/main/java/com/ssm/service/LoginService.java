package com.ssm.service;

import com.ssm.dao.LoginDao;
import com.ssm.entity.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @Email: m15602498163@163.com
 * @Author: yoonada
 * @Date: 2018/12/20
 * @Time: 9:25 PM
 */
@Service
public class LoginService {

    private LoginDao loginDao;

    @Autowired
    public LoginService(LoginDao loginDao) {
        this.loginDao = loginDao;
    }

    public Login add(Login login) {
        String passwordHash =  passwordToHash(login.getPassword());
        login.setPassword(passwordHash);
        loginDao.register(login);
        return findById(login.getId());
    }

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

    public Login findById(int id) {
        Login login = new Login();
        login.setId(id);
        return loginDao.findUser(login);
    }

    public Login findByLoginName(String loginName) {
        Login param = new Login();
        param.setLoginName(loginName);
        return loginDao.findUser(param);
    }

    public boolean comparePassword(Login login, Login userInDataBase) {
        return passwordToHash(login.getPassword())      // 将用户提交的密码转换为 hash
                .equals(userInDataBase.getPassword()); // 数据库中的 password 已经是 hash，不用转换
    }
}
