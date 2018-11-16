package com.hemming.daily.algorithm.算法.排序算法;

/**
 * Created by hmzhang on 2018/6/10.
 */
public class 插入排序 {
    public static void main(String[] args) {
        int a[] = {8, 3, 2, 6, 7, 5, 4};
        for (int j = 1; j < a.length; j++) {
            int key = a[j];
            int i = j - 1;
            while (i >= 0 && a[i] > key) {
                a[i + 1] = a[i];
                i = i - 1;
            }
            a[i + 1] = key;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
