package com.hemming.daily.designPatterns.proxy;

/**
 * Created by hmzhang on 2018/10/16.
 */
public class MySubject implements ISubject {
    @Override
    public void doSomething() {
        System.out.println("我在做事情");
    }
}
