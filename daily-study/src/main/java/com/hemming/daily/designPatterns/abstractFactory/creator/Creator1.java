package com.hemming.daily.designPatterns.abstractFactory.creator;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Creator1 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }
}
