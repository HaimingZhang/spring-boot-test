package com.hemming.daily.algorithm.算法.斐波那契;

public class HouseStep {

    public static int findStep(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        if (n >= 3) {
            return findStep(n - 1) + findStep(n - 2) + findStep(n - 3);
        }
        return 0;
    }

    public static void main(String[] args) {
        int step = HouseStep.findStep(5);
        System.out.println(step);
    }

}
