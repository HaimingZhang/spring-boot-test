package com.hemming.daily.designPatterns.template;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass1();
        abstractClass.templateMethod();

    }
}
