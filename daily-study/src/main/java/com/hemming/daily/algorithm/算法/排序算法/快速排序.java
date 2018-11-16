package com.hemming.daily.algorithm.算法.排序算法;

/**
 * Created by hmzhang on 2018/8/14.
 */
public class 快速排序 {
    private static void sort(int _left, int _right, int[] arr) {
        int left = _left;
        int right = _right;
        int temp = 0;
        if (left <= right) {
            temp = arr[left];
            while (left != right) {
                while (right > left && arr[right] >= temp)
                    right --;
                arr[left] = arr[right];

                while (left < right && arr[left] <= temp)
                    left++;
                arr[right] = arr[left];
            }
            arr[right] = temp;
            sort(_left,left-1, arr);
            sort(right+1, _right,arr);
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,4,3,1,6};
        sort(0, a.length-1,a);
        for (int i : a) {
            System.out.println(i);
        }
    }

}
