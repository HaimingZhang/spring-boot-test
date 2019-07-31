package com.hemming.daily.练习.d25;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;
import java.util.Objects;
import java.util.Stack;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-17 22:00
 */
public class 操作数栈 {

    public static void main(String[] args) {
        Stack<Double> vals = new Stack<>();

        Stack<String> ops = new Stack<>();

        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();

            if (Objects.equals(s, "(")) { ; } else if (Objects.equals(s, "+")) { ops.push("+"); } else if (Objects
                .equals(s, "-")) {
                ops.push("-");
            } else if (Objects.equals(s, "*")) {
                ops.push("*");
            } else if (Objects.equals(s, "/")) {
                ops.push("/");
            } else if (Objects.equals(s, "sqrt")) {
                ops.push("sprt");
            } else if (Objects.equals(s, ")")) {

                Double v = vals.pop();
                String op = ops.pop();

                if (Objects.equals(op, "+")) { v = vals.pop() + v; } else if (Objects.equals(s, "-")) {
                    v = vals.pop() - v;
                } else if (Objects.equals(s, "*")) {
                    v = vals.pop() * v;
                } else if (Objects.equals(s, "/")) {
                    v = vals.pop() / v;
                } else if (Objects.equals(s, "sqrt")) {
                    v = Math.sqrt(v);
                }

                vals.push(v);

            } else {
                vals.push(Double.valueOf(s));
            }

        }

        StdOut.print(vals.pop());

    }
}
