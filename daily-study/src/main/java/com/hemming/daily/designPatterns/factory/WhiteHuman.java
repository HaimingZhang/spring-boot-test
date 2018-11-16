package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class WhiteHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("我是白种人");
    }

    @Override
    public void talk() {
        System.out.println("哈哈，白种人在说话。");
    }
}
