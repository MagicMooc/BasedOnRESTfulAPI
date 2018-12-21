package com.ssm.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.ssm.entity.Login;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;

@Service
public class AuthenticationService {
    public String getToken(Login login) {
        String token = "";
        try {
            token = JWT.create()
                    .withAudience(token.toString())          // 将 user id 保存到 token 里面
                    .sign(Algorithm.HMAC256(login.getPassword()));   // 以 password 作为 token 的密钥
        } catch (UnsupportedEncodingException ignore) {
        }
        return token;
    }
}
