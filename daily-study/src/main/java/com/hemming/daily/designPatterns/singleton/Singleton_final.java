package com.hemming.daily.designPatterns.singleton;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Singleton_final {
    private static class SingletonHolder {
        private static final Singleton_final INSTANCE = new Singleton_final();
    }

    public static Singleton_final getSingleton() {
        return SingletonHolder.INSTANCE;
    }
}
