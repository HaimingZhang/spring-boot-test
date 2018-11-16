package com.hemming.daily.test;

import java.util.*;

/**
 * Created by hmzhang on 2018/9/30.
 */
public class TestNullCollection {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");


//        ListIterator<String> iterator = strings.listIterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            if ("a".equals(next)) {
//                iterator.remove();
//                iterator.add("d");
//            }
//
//        }
        for (int i = 0; i < strings.size(); i++) {
            if ("b".equals(strings.get(i))) {
                strings.remove(i);
                strings.add(i, "d");
                strings.add(i, "m");
            }
        }



        System.out.println(strings);
    }
}
