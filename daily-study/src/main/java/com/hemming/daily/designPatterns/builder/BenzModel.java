package com.hemming.daily.designPatterns.builder;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("奔驰车跑起来了。。。");
    }

    @Override
    protected void stop() {
        System.out.println("奔驰车停下来了");
    }

    @Override
    protected void alarm() {
        System.out.println("奔驰滴滴滴。。。。");
    }

    @Override
    protected void engine() {
        System.out.println("给奔驰车加油门。");
    }
}
