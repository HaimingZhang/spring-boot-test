package com.hemming.daily.designPatterns.proxy;

/**
 * Created by hmzhang on 2018/10/16.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("我在前置任务");
    }
}
