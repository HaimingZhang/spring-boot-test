package com.hemming.daily.algorithm.算法.链表;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-04 07:54
 */
public class DeleteListTest {
    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);

        ListNode node = new ListNode(5);

        deleteNode(head, 3);

        System.out.println(head);
    }

    public static ListNode deleteNode(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            } else {
                prev = prev.next;
            }
        }

        return head;

    }
}
