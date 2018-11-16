package com.hemming.daily.designPatterns.singleton;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Singleton_version2 {
    private static Singleton_version2 singleton_version2 = null;

    private Singleton_version2() {
    }

    public static Singleton_version2 getInstance() {
        if (singleton_version2 == null) {
            synchronized (Singleton_version2.class) {
                singleton_version2 = new Singleton_version2();
            }
        }
        return singleton_version2;
    }
}
