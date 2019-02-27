package com.hemming.daily.algorithm.算法.排序算法;

/**
 * Created by hmzhang on 2018/6/12.
 */
public class 快排算法 {
    public static void main(String[] args) {
        int[] a = {6, 4, 5, 8};
        int start = 0;
        int end = a.length - 1;
        sort(a, start, end);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    private static void sort(int a[], int low, int high) {
        if (low > high) {
            return;
        }
        int start = low;
        int end = high;
        int baseKey = a[start];
        while (start < end) {
            while (start < end && a[end] >= baseKey) {
                end--;
            }
            if (start < end) {
                a[start++] = a[end];
            }
            while (start < end && a[start] <= baseKey) {
                start++;
            }
            if (start < end) {
                a[end--] = a[start];
            }
            a[start] = baseKey;
            sort(a, low, start - 1);
            sort(a, start + 1, high);
        }
    }
}
