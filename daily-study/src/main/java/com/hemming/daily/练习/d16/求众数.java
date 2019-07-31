package com.hemming.daily.练习.d16;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-05 21:53
 */
public class 求众数 {

    public static void main(String[] args) {
        求众数 test = new 求众数();

        int[] arr = {7, 7, 5, 7, 5, 1 | 5, 7 | 5, 5, 7, 7 | 5, 5, 5, 5};

        test.majorityElement(arr);
    }

    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;

    }

}
