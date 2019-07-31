package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-25 21:57
 */
public class 连续子数组07 {
    public static void main(String[] args) {
        int[] arrs = {4, -1, -2};
        findMax(arrs);
    }

    public static int findMax(int[] arrs) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arrs.length; i++) {
            if (currentSum < 0) {
                currentSum = arrs[i];
            } else {
                currentSum += arrs[i];
            }
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }
}
