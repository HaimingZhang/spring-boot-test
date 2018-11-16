package com.hemming.daily.designPatterns.singleton;

public class Singleton_version1 {
    private static Singleton_version1 singleton1 = null;

    private Singleton_version1() {
    }

    /**
     * 1.0版本的单例，存在什么问题
     *
     * @return
     */
    public static Singleton_version1 getInstance() {
        if (singleton1 == null) {
            singleton1 = new Singleton_version1();
        }
        return singleton1;
    }
}
