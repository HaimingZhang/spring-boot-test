package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-24 19:53
 */
public class CountAndSay05 {

    public static void main(String[] args) {
        getNext("111221");
    }

    public static String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            s = getNext(s);
        }

        return s;
    }

    public static String getNext(String s) {
        int count = 1;
        char current = '0';

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (current == '0') {
                current = s.charAt(i);
            } else {
                if (current == s.charAt(i)) {
                    count++;
                } else {
                    sb.append(count).append(current);
                    i--;
                    current = '0';
                    count = 1;
                }
            }
        }
        sb.append(count).append(current);
        return sb.toString();
    }
}
