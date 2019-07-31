package com.hemming.daily.练习.d23;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-12 22:14
 */
public class 最长回文子串 {

    public String longestPalindrome(String s) {
        int lastIndex = s.length() - 1;

        int startIndex = 0;

        String maxStr = "";

        while (lastIndex >= startIndex) {
            if (s.charAt(startIndex) != s.charAt(lastIndex)) {
                lastIndex--;
            } else {
                startIndex++;
                lastIndex--;
            }
        }
        return "";
    }
}
