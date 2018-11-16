package com.hemming.daily.designPatterns.proxy;

import java.lang.reflect.InvocationHandler;

/**
 * Created by hmzhang on 2018/10/9.
 */
public class Client {
    public static void main(String[] args) {
//        Long a = 100000000000L;
//        Long b = 100000000000L;
//        System.out.println(a.equals(b));

        ISubject subject = new MySubject();
        InvocationHandler invocationHandler = new MyInvocationHandle(subject);
        ISubject proxy = DynamicProxy.newProxy(
                subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(),
                invocationHandler);
        proxy.doSomething();




    }
}
