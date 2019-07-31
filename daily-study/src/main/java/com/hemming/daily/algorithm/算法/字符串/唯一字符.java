package com.hemming.daily.algorithm.算法.字符串;

public class 唯一字符 {

    public int firstUniqChar(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int index = 0;
        int i = 1;
        while (i < s.length()) {
            char temp = s.charAt(index);
            if (temp == s.charAt(i)) {
                index++;
                i = index + 1;
                continue;
            }
            i++;
        }
        if (index == (s.length() - 1)) {
            return -1;
        } else {
            return index;
        }
    }

    public static void main(String[] args) {
        唯一字符 w = new 唯一字符();
        int loveleetcode = w.firstUniqChar("aadadaad");
        System.out.println(loveleetcode);
    }
}
