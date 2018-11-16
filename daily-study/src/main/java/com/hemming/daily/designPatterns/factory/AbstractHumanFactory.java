package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends IHuman> T createHuman(Class<T> type);
}
