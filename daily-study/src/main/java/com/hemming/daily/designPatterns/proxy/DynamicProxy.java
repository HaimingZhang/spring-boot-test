package com.hemming.daily.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by hmzhang on 2018/10/16.
 */
public class DynamicProxy<T> {
    public static <T> T newProxy(ClassLoader classLoader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            new BeforeAdvice().exec();
        }
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}
