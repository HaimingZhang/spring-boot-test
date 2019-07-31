package com.hemming.daily.练习;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-20 19:42
 */
public class 罗马数字day1 {
    public static void main(String[] args) {
        System.out.println(toint("LVIII"));
    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);

        map.put('V', 5);

        map.put('X', 10);

        map.put('L', 50);

        map.put('C', 100);

        map.put('D', 500);

        map.put('M', 1000);

        int sum = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1))) {
                sum += map.get(s.charAt(i));
            } else {
                sum -= map.get(s.charAt(i));
            }
        }

        return sum;
    }

    public static int toint(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        Map<String, Integer> map = new HashMap<>();

        map.put("I", 1);

        map.put("V", 5);

        map.put("X", 10);

        map.put("L", 50);

        map.put("C", 100);

        map.put("D", 500);

        map.put("M", 1000);

        map.put("A", 4);

        map.put("B", 9);

        map.put("E", 40);

        map.put("F", 90);

        map.put("G", 400);

        map.put("H", 900);

        s = s.replace("IV", "A")
            .replace("IX", "B")
            .replace("XL", "E")
            .replace("XC", "F")
            .replace("CD", "G")
            .replace("CM", "H");

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            sum += map.get(String.valueOf(s.charAt(i)));
        }

        return sum;
    }

}
