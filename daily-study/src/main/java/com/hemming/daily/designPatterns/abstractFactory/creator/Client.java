package com.hemming.daily.designPatterns.abstractFactory.creator;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();

        AbstractProductA productA1 = creator1.createProductA();

        productA1.doSomething();

        AbstractCreator creator2 = new Creator2();

        AbstractProductA productA2 = creator2.createProductA();

        productA2.doSomething();

    }
}
