package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-24 17:31
 */
public class 数组目标插入05 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 6};

        System.out.println(findAndInsert(nums, 7));
    }

    public static int findAndInsert(int[] arr, int target) {
        if (arr == null) {
            return 0;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= target) {
                return i;
            }

            if (i == arr.length - 1) {
                return i + 1;
            }
        }

        return -1;
    }
}
