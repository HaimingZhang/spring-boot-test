package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class YellowHuman implements IHuman {
    @Override
    public void getColor() {
        System.out.println("时间正好，我是黄种人");
    }

    @Override
    public void talk() {
        System.out.println("黄种人在说话了");
    }
}
