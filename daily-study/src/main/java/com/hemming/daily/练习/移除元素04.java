package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-23 20:59
 */
public class 移除元素04 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};

        System.out.println(removeElement(nums, 3));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int sum = 0;

        int size = nums.length;

        for (int i = 0; i < size; i++) {
            if (nums[i] != val) {
                nums[sum] = nums[i];
                sum += 1;
            }
        }
        return sum;
    }
}
