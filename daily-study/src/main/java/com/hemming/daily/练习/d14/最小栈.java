package com.hemming.daily.练习.d14;

import java.util.Stack;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-03 23:07
 */
public class 最小栈 {

    public static void main(String[] args) {

        最小栈 test = new 最小栈();

        test.push(-2);
        test.push(0);
        test.push(-3);

        System.out.println(test.getMin());

        System.out.println(test.top());

        test.pop();

        System.out.println(test.getMin());
    }

    private int min = Integer.MAX_VALUE;
    private Stack<Integer> stack;

    public 最小栈() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(min >= x){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if(stack.pop() == min){
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
