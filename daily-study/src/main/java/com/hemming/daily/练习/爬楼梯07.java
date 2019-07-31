package com.hemming.daily.练习;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-26 23:58
 */
public class 爬楼梯07 {

    public static void main(String[] args) {
        System.out.println(climbStairs(10));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        int first = 1;

        int second = 2;

        int res = 0;


        for (int i = 3; i <= n; i++) {
            res = first + second;
            first = second;
            second = res;
        }

        return res;
    }

}
