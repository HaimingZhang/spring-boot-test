package com.hemming.daily.test;

import java.util.ArrayList;
import java.util.List;

public class TestArrays {
    public static void main(String[] args) {
        Long a = 1L;
        List<Long> arr = new ArrayList<>();
        arr.add(a);
        arr.add(null);
        String join = IdJoiner.join(arr);
        System.out.println(join);
    }
}
