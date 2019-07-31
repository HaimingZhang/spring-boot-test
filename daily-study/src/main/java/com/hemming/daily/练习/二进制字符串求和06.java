package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-25 22:40
 */
public class 二进制字符串求和06 {

    public static void main(String[] args) {
        String str = addBinary("101", "10");

        System.out.println(str);
    }

    public static String addBinary(String a, String b) {

        if (a.length() > b.length()) {
            return addStr(a, b);
        } else {
            return addStr(b, a);
        }
    }

    public static String addStr(String a, String b) {
        char[] chars = new char[a.length() + 1];

        for (int i = 0; i < chars.length; i++) {
            chars[i] = '0';
        }

        a = new StringBuilder(a).reverse().toString();

        b = new StringBuilder(b).reverse().toString();

        for (int i = 0; i < a.length(); i++) {
            if (i >= b.length()) {
                if (chars[i] == '1') {
                    if ('1' == a.charAt(i)) {
                        chars[i] = '0';
                        chars[i + 1] = '1';
                    }
                } else {
                    if ('1' == a.charAt(i)) {
                        chars[i] = '1';
                    }
                }
            } else {
                if (a.charAt(i) == '0' && b.charAt(i) == '0') {

                } else if ((a.charAt(i) == '1' && b.charAt(i) == '0')
                    || (a.charAt(i) == '0' && b.charAt(i) == '1')) {
                    if (chars[i] == '1') {
                        chars[i] = '0';
                        chars[i + 1] = '1';
                    } else {
                        chars[i] = '1';
                    }
                } else {
                    chars[i + 1] = '1';
                }
            }
        }

        String res = new StringBuilder(new String(chars)).reverse().toString();
        if (res.charAt(0) == '0') {
            res = res.substring(1);
        }

        return res;
    }
}
