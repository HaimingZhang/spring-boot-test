package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-26 22:43
 */
public class 平方根07 {

    public static void main(String[] args) {
        System.out.println(mySqrt(1));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int right = x;
        int left = 0;

        int res = 0;

        while (left <= right) {
            int mid = (right + left) / 2;

            if (x / mid == mid) {
                return mid;
            } else if (x / mid < mid) {
                right = mid -1;
            } else {
                left = mid + 1;
                res = mid;
            }
        }

        return res;

    }
}
