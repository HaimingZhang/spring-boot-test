package com.hemming.daily.练习;

class Solution {
    public int reverse(int x) {
        if (x > 0) {
            String a = String.valueOf(x);
            Long reverseValue = Long.valueOf(reverseStr(a));
            if (reverseValue > Integer.MAX_VALUE) {
                return 0;
            } else {
                return reverseValue.intValue();
            }
        } else {
            if (x <= Integer.MIN_VALUE) {
                return 0;
            }
            int temp = Math.abs(x);
            String a = String.valueOf(temp);
            Long reverse = Long.valueOf(reverseStr(a));
            if (reverse > Integer.MAX_VALUE) {
                return 0;
            } else {
                return 0 - reverse.intValue();
            }

        }
    }

    private String reverseStr(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        char[] charArr = str.toCharArray();
        int start = 0;
        int end = charArr.length - 1;
        while (start < end) {
            char temp = charArr[start];
            charArr[start++] = charArr[end];
            charArr[end--] = temp;
        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        Solution sl = new Solution();
        sl.reverse(-2147483648);
    }
}