package com.wenfee.jwt.config;

import com.wenfee.jwt.interceptor.AuthenticationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 22:42
 **/
@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

    @Bean
    public AuthenticationInterceptor authenticationInterceptor() {
        return new AuthenticationInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求，通过 对应 **Token注解 决定是否需要登录
        registry.addInterceptor(authenticationInterceptor()).addPathPatterns("/**");
    }
}