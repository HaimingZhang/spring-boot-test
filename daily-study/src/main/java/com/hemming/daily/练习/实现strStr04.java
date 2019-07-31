package com.hemming.daily.练习;

import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-23 21:17
 */
public class 实现strStr04 {

    public static void main(String[] args) {

        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (Objects.equals("", needle)) {
            return 0;
        }

        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (Objects.equals(haystack.charAt(i), needle.charAt(0))) {
                boolean flag = true;

                if (i > haystack.length() - needle.length()) {
                    return -1;
                }

                for (int j = 0; j < needle.length(); j++) {
                    if (i + j > haystack.length() -1) {
                        return -1;
                    }


                    if (!Objects.equals(haystack.charAt(i + j), needle.charAt(j))) {
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    return i;
                }
            }

        }
        return -1;
    }
}
