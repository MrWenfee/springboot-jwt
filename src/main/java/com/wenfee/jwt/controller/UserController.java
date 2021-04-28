package com.wenfee.jwt.controller;

import com.wenfee.jwt.annotation.UserLoginToken;
import com.wenfee.jwt.entity.User;
import com.wenfee.jwt.service.TokenService;
import com.wenfee.jwt.service.UserService;
import com.wenfee.jwt.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 20:17
 **/
@RestController
@RequestMapping("api")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    TokenService tokenService;

    @PostMapping("login")
    public R login(@RequestBody User user) {

        User userForBase = userService.findUserById(user.getId());

        if (userForBase == null) {
            return R.error("登录失败,用户不存在");
        } else {
            if (!userForBase.getPassword().equals(user.getPassword())) {
                return R.error("登录失败,密码错误");
            } else {
                String token = tokenService.getToken(userForBase);
                R r = R.ok().put("token", token).put("user", userForBase);
                return r;
            }
        }
    }

    @UserLoginToken
    @GetMapping("/getMessage")
    public String getMessage() {
        return "你已通过验证";
    }

}