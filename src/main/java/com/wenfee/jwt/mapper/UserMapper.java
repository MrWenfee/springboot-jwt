package com.wenfee.jwt.mapper;

import com.wenfee.jwt.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 20:22
 **/
public interface UserMapper {
    User findByUsername(@Param("username") String username);
    User findUserById(@Param("id") String id);
}