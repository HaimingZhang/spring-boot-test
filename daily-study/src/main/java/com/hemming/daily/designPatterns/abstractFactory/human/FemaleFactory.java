package com.hemming.daily.designPatterns.abstractFactory.human;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class FemaleFactory implements HumanFactory {
    @Override
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
}
