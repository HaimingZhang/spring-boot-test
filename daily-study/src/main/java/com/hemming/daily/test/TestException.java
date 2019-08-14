package com.hemming.daily.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hmzhang on 2018/11/30.
 */
public class TestException {
    public static void main(String[] args) {
//        try {
//            System.out.printf("1");
//            throw new RuntimeException();
//        } catch (Exception e) {
//            System.out.printf("expt");
//            throw new RuntimeException();
//        } finally {
//            System.out.printf("final");
//        }

        //List<String> stringList = new ArrayList<>();
        //        //stringList.add("1");
        //        //stringList.add("2");
        //        //stringList.add("3");
        //        //String join = String.join(";", stringList);
        //        //System.out.println(join);

        Map<String, String> map = new HashMap<>();
        String h = map.get(null);
        System.out.println(h+"---");
    }
}
