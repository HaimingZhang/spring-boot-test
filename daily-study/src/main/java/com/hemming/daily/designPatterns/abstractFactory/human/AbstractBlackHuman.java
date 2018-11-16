package com.hemming.daily.designPatterns.abstractFactory.human;

public abstract class AbstractBlackHuman implements Human {

    @Override
    public void gerColor() {
        System.out.println("我是黑人。。。");
    }

    @Override
    public void talk() {
        System.out.println("黑人巴拉巴拉巴");
    }
}
