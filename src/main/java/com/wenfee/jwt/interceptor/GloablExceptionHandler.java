package com.wenfee.jwt.interceptor;

import com.wenfee.jwt.utils.R;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 22:19
 **/
@ControllerAdvice
public class GloablExceptionHandler {

    @ResponseBody
    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        String msg = e.getMessage();
        if (msg == null || msg.equals("")) {
            msg = "服务器出错";
        }
        return R.error(msg);
    }
}