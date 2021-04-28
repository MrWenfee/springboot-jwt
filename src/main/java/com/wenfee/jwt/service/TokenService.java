package com.wenfee.jwt.service;

import com.wenfee.jwt.entity.User;
import org.springframework.stereotype.Service;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 21:54
 **/
public interface TokenService {
    public String getToken(User user);
}
