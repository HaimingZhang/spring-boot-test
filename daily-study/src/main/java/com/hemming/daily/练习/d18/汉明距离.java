package com.hemming.daily.练习.d18;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-07 20:45
 */
public class 汉明距离 {

    public static void main(String[] args) {
        汉明距离 test = new 汉明距离();

        test.hammingDistance(1, 2);
    }

    public int hammingDistance(int x, int y) {
        char[] charX = Integer.toBinaryString(x).toCharArray();
        char[] charY = Integer.toBinaryString(y).toCharArray();
        return getFromArr(charX, charY);
    }

    public int getFromArr(char[] charX, char[] charY) {
        int lenX = charX.length, lenY = charY.length, indexX = lenX - 1, indexY = lenY - 1;

        int sum = 0;

        while (indexX >= 0 && indexY >= 0) {
            int temp = (charX[indexX] - '0') ^ (charY[indexY] - '0');
            indexX--;
            indexY--;
            sum += temp;
        }

        while (indexX >= 0) {
            int temp = charX[indexX] - '0';
            indexX--;
            sum += temp;
        }

        while (indexY >= 0) {
            int temp = charY[indexY] - '0';
            indexY--;
            sum += temp;
        }

        return sum;
    }

}
