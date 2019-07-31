package com.hemming.daily.algorithm.算法.链表;

import java.util.List;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-05 20:11
 */
public class ListReverseTest {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = new ListNode(-1);
        prev.next = head;

        ListNode current = head;

        ListNode next = head.next;

        while (next.next != null) {

        }

        return head;

    }
}
