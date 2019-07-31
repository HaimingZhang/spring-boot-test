package com.hemming.daily.练习.d12;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-01 21:33
 */
public class 买卖股票最佳时机 {

    public int findMax(int[] arr) {
        if (null == arr || arr.length == 0) {
            return 0;
        }
        int min = arr[0], sum = 0;
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            sum = Math.max(sum, arr[i] - min);
        }
        return sum;
    }
}
