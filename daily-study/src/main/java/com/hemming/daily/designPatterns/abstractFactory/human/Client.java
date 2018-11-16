package com.hemming.daily.designPatterns.abstractFactory.human;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Client {
    public static void main(String[] args) {
        MaleFactory maleFactory = new MaleFactory();

        FemaleFactory femaleFactory = new FemaleFactory();

        Human blackHuman = maleFactory.createBlackHuman();
        blackHuman.getSex();

        Human blackHuman1 = femaleFactory.createBlackHuman();
        blackHuman1.getSex();
    }
}
