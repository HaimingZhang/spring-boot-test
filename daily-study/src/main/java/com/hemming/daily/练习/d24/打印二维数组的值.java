package com.hemming.daily.练习.d24;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-14 21:54
 */
public class 打印二维数组的值 {

    public static void main(String[] args) {
        print2dArray();
    }

    public static void print2dArray() {
        char[][] charArr = {{'*', ' ', '*'}, {'*', ' ', ' '}};
        for (int i = 0; i < charArr.length; i++) {
            for (int j = 0; j < charArr[i].length; j++) {
                if (charArr[i][j] == '*') {
                    System.out.println("true");
                } else {
                    System.out.println("false");
                }
            }
        }
    }



}
