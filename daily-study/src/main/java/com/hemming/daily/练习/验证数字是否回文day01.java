package com.hemming.daily.练习;

import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-17 13:01
 */
public class 验证数字是否回文day01 {

    public static void main(String[] args) {
        int d = 1001;

        System.out.println(checkData(d));
    }

    public static boolean checkData(int d) {

        if (d < 0) {
            return false;
        }

        int mod = 1;

        while (d / mod >= 10) {
            mod *= 10;
        }

        while (d > 0) {
            int left = d / mod;

            int right = d % 10;

            if (left != right) {
                return false;
            }

            d = (d % mod) / 10;

            mod = mod / 100;

        }

        return true;

    }

    public static boolean checkData2(int d) {

        String str = String.valueOf(d);

        return Objects.equals(new StringBuilder(str).reverse().toString(), str);

    }
}
