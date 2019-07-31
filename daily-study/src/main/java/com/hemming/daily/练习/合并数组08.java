package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-27 22:41
 */
public class 合并数组08 {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 7, 8, 0, 0, 0};
        int[] nums2 = {2, 5, 6};

        merge(nums1, 5, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int index = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] <= nums2[n - 1]) {
                nums1[index] = nums2[n - 1];
                n--;
            } else {
                nums1[index] = nums1[m - 1];
                m--;
            }
            index--;
        }

        for (int i = 0; i < n; i++) {
            nums1[i] = nums2[i];
        }

    }
}
