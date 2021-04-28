package com.wenfee.jwt.service.impl;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.wenfee.jwt.entity.User;
import com.wenfee.jwt.service.TokenService;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 21:55
 **/
@Service
public class TokenServiceImpl implements TokenService {
    @Override
    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(user.getId())// 将 user id 保存到 token 里面
                .sign(Algorithm.HMAC256(user.getPassword()));// 以 password 作为 token 的密钥
        return token;
    }
}