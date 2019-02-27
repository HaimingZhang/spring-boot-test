package com.hemming.daily.test;

import com.google.common.base.Joiner;

public class IdJoiner {
    private static Joiner joiner = Joiner.on(",");

    public static String join(Iterable iterable){
        return joiner.join(iterable);
    }
}