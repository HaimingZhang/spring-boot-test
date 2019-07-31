package com.hemming.daily.练习.d20;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-09 21:33
 */
public class 字符串相加 {

    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) { carry += num1.charAt(i--) - '0'; }
            if (j >= 0) { carry += num2.charAt(j--) - '0'; }
            sb.append(carry % 10);
            carry = carry / 10;
        }

        return sb.reverse().toString();
    }

}
