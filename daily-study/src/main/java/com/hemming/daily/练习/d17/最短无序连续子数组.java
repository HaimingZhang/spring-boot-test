package com.hemming.daily.练习.d17;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-06 16:26
 */
public class 最短无序连续子数组 {
    public static void main(String[] args) {
        最短无序连续子数组 test = new 最短无序连续子数组();

        int[] arr = {2, 6, 4, 8, 10, 9, 15};

        System.out.println(test.findUnsortedSubarray(arr));
    }

    public int findUnsortedSubarray(int[] nums) {
        if (nums == null) {
            return 0;
        }

        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }

        int len = nums.length;

        int m = nums[0], n = nums[len - 1], l = -1, r = -2;

        for (int i = 0; i < len; i++) {
            m = Math.max(m, nums[i]);

            n = Math.min(n, nums[len - 1 - i]);

            if (m != nums[i]) {
                l = i;
            }

            if (n != nums[len - 1 - i]) {
                r = len - 1 - i;
            }

            if (l > 0 && r > 0) {
                break;
            }
        }

        if (l > 0 && r > 0) {
            return r - l + 3;
        } else {
            return 0;
        }

    }

}
