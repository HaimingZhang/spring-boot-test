package com.hemming.daily.designPatterns.abstractFactory.human;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class FemaleBlackHuman extends AbstractBlackHuman {
    @Override
    public void getSex() {
        System.out.println("我是女黑人。。");
    }
}
