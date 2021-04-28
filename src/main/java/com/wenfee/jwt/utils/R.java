package com.wenfee.jwt.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: springboot-jwt
 * @author: Mr.Wenfee
 * @create: 2021-04-27 20:43
 **/
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    public R() {
        put("code", 0);
        put("msg", "success");
    }

    public static R error() {
        return error(500, "未知异常，请联系管理员");
    }

    public static R error(String msg) {
        return error(500, msg);
    }

    public static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok() {
        R r = new R();
        r.put("code", 200);
        r.put("msg", "success");
        return r;
    }

    public static R ok(String msg) {
        R r = new R();
        r.put("code", 200);
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R r = new R();
        r.putAll(map);
        return r;
    }

    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}