package com.hemming.daily.algorithm.算法.数组;

public class 加1 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                if (i == 0) {
                    int[] temp = new int[digits.length + 1];
                    for (int j = 0; j < temp.length; j++) {
                        if (j == 0) {
                            temp[j] = 1;
                        } else {
                            temp[j] = 0;
                        }
                    }
                    return temp;
                }
                continue;
            } else {
                digits[i] = digits[i] + 1;
                for (int m = i+1; m < digits.length; m++) {
                    digits[m] = 0;
                }
                return digits;
            }
        }
        return digits;

    }

    public static void main(String[] args) {
        加1 j = new 加1();
        int[] ints = j.plusOne(new int[]{1,2,9});
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
