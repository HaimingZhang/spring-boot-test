package com.hemming.daily.练习.d22;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-11 23:18
 */
public class 二分查找 {

    public static void main(String[] args) {
        二分查找 test = new 二分查找();

        int[] nums = {1, 3, 5, 7, 8};

        System.out.println(test.binarySearch(nums, 5));
    }

    public int binarySearch(int[] nums, int key) {
        int fromIndex = 0, endIndex = nums.length - 1;
        while (endIndex >= fromIndex) {
            int mid = fromIndex + (endIndex - fromIndex) >> 1;
            if (key > nums[mid]) {
                fromIndex = mid + 1;
            } else if (key < nums[mid]) {
                endIndex = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
