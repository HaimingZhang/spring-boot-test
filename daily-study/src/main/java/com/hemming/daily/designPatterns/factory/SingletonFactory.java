package com.hemming.daily.designPatterns.factory;

import java.lang.reflect.Constructor;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class clazz = Class.forName(Singleton.class.getName());
            Constructor declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);
            singleton = (Singleton) declaredConstructor.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
