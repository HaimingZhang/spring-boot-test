package com.hemming.daily.designPatterns.builder;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车开起来了");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车停下来了");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车鸣笛了");
    }

    @Override
    protected void engine() {
        System.out.println("宝马嗖嗖的加油门");
    }
}
