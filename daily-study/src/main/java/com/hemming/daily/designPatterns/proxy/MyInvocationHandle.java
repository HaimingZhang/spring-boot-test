package com.hemming.daily.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by hmzhang on 2018/10/16.
 */
public class MyInvocationHandle implements InvocationHandler {
    Object target = null;

    public MyInvocationHandle(Object _obj) {
        this.target = _obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(target, args);
    }
}
