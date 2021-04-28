package com.wenfee.jwt.annotation;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 22:16
 **/
public @interface PassToken {
    boolean required() default true;
}