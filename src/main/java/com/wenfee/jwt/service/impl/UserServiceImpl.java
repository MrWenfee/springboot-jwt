package com.wenfee.jwt.service.impl;

import com.wenfee.jwt.entity.User;
import com.wenfee.jwt.mapper.UserMapper;
import com.wenfee.jwt.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 21:59
 **/
@Service
@Slf4j
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public User findUserById(String userId) {
        log.info("findUserById ==> {}", userId);
        return userMapper.findUserById(userId);
    }

    @Override
    public User findByUsername(User user) {
        log.info("findByUsername ==> {}", user.getUsername());
        return userMapper.findByUsername(user.getUsername());
    }
}