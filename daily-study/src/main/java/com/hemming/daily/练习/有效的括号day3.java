package com.hemming.daily.练习;

import java.util.Stack;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-21 18:34
 */
public class 有效的括号day3 {
    public static void main(String[] args) {
        System.out.println(validateStr("{{}}}"));
    }

    public static boolean validateStr(String str) {
        Stack<Character> characters = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            if (!isRight(str.charAt(i))) {
                characters.push(str.charAt(i));
            } else {
                if (characters.empty()) {
                    return false;
                } else {
                    Character peek = characters.pop();
                    if (!isMatch(peek, str.charAt(i))) {
                        return false;
                    }
                }
            }
        }

        return characters.empty();
    }

    private static boolean isRight(char c) {
        return '}' == c || ')' == c || ']' == c;
    }

    private static boolean isMatch(char left, char right) {
        if ('{' == left && '}' == right) {
            return true;
        }

        if ('[' == left && ']' == right) {
            return true;
        }

        if ('(' == left && ')' == right) {
            return true;
        }

        return false;
    }

}
