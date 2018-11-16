package com.hemming.daily.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hmzhang on 2018/10/16.
 */
public class GamePlayerIH implements InvocationHandler {
    Class aClass = null;

    Object object = null;

    public GamePlayerIH(Object _obj) {
        this.object = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object res = method.invoke(object, args);
        if (method.getName().equals("login")) {
            System.out.println("有人登陆我的账号");
        }
        return res;
    }
}
