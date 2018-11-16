package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class BlackHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("时间久了，我成了黑色。");
    }

    @Override
    public void talk() {
        System.out.println("黑人开始说话了");
    }
}
