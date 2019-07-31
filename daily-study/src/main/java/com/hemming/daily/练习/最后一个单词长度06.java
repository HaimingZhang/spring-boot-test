package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-25 22:29
 */
public class 最后一个单词长度06 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }

    public static int lengthOfLastWord(String s) {
        String[] s1 = s.split(" ");
        if (s1.length > 1) {
            return s1[s1.length-1].length();
        } else if (s1.length == 1) {
            return s1[0].length();
        } else {
            return 0;
        }
    }
}
