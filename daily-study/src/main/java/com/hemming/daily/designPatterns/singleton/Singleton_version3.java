package com.hemming.daily.designPatterns.singleton;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Singleton_version3 {
    private static Singleton_version3 singleton_version3 = null;

    private Singleton_version3() {

    }

    public static Singleton_version3 getInstance() {
        if (singleton_version3 == null) {
            synchronized (Singleton_version3.class) {
                if (singleton_version3 == null) {
                    singleton_version3 = new Singleton_version3();
                }
            }
        }
        return singleton_version3;
    }
}
