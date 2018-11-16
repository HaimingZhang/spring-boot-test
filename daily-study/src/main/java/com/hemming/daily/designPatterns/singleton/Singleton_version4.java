package com.hemming.daily.designPatterns.singleton;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Singleton_version4 {

    //防止指令重排序
    private volatile static Singleton_version4 singleton_version4 = null;

    public Singleton_version4() {

    }

    public static Singleton_version4 getInstance() {
        if (singleton_version4 == null) {
            synchronized (Singleton_version4.class) {
                if (singleton_version4 == null) {
                    singleton_version4 = new Singleton_version4();
                }
            }
        }
        return singleton_version4;
    }

}
