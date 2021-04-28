package com.wenfee.jwt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 21:04
 **/
@SpringBootApplication
@MapperScan("com.wenfee.jwt.mapper")
public class JwtApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class, args);
    }
}