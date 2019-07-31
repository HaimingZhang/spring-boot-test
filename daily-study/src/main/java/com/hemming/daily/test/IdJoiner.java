package com.hemming.daily.test;

import com.google.common.base.Joiner;

import java.util.HashMap;
import java.util.Map;

public class IdJoiner {
    private static Joiner joiner = Joiner.on(",");

    public static String join(Iterable iterable){

        //return joiner.join(iterable);



        return "";
    }

    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        map.put(1, 1);

        map.put(1, 2);

        System.out.println(map);
    }
}