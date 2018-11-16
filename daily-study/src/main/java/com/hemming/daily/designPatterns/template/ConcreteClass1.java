package com.hemming.daily.designPatterns.template;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class ConcreteClass1 extends AbstractClass {
    @Override
    protected void doA() {
        System.out.println("我在做a");
    }

    @Override
    protected void doB() {
        System.out.println("我在做b");
    }

    @Override
    protected boolean needDoB() {
        return false;
    }
}
