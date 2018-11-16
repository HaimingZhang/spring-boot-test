package com.hemming.daily.algorithm.算法.排序算法;

/**
 * Created by hmzhang on 2018/6/12.
 */
public class 快速合并两个有序数组 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int b[] = {2, 4, 6, 8};
        int c[] = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            c[k++] = a[i] <= b[j] ? a[i++] : b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        for (int l = 0; l < c.length; l++) {
            System.out.println(c[l]);
        }
    }
}
