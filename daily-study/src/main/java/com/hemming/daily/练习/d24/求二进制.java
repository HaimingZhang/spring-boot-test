package com.hemming.daily.练习.d24;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-14 21:46
 */
public class 求二进制 {

    public static void main(String[] args) {
        System.out.println(getIntBinaryString(8));
    }

    public static String getIntBinaryString(int N) {
        String s = "";

        for (int i = N; i > 0; i /= 2) {
            s = (i % 2) + s;
        }
        return s;

    }
}
