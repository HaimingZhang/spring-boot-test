package com.hemming.daily.练习.d15;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-04 19:44
 */
public class 小偷偷钱a {

    public int getMax(int[] arr) {
        if (null == arr) {
            return 0;
        }

        if (arr.length == 0) {
            return 0;
        }

        if (arr.length == 1) {
            return arr[0];
        }

        int[] dp = new int[arr.length];

        dp[0] = arr[0];
        dp[1] = Math.max(dp[0], arr[1]);

        for (int i = 2; i < arr.length; i++) {
            dp[i] = Math.max(dp[i-1], dp[i-2] + arr[i]);
        }

        return dp[arr.length-1];
    }
}
