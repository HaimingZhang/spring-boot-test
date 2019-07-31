package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-20 21:19
 */
public class 最长公共前缀day2 {
    public static void main(String[] args) {
        String[] strs = {"babb","caa"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        if (null == strs || strs.length == 0) {
            return "";
        }
        String min = strs[0];

        while (min.length() > 0) {
            for (int i = 0; i < strs.length; i++) {
                if (!strs[i].startsWith(min)) {
                    min = min.substring(0, min.length() - 1);
                    break;
                } else {
                    if (i == strs.length -1) {
                        return min;
                    }
                }
            }
        }

        return "";

    }

}
