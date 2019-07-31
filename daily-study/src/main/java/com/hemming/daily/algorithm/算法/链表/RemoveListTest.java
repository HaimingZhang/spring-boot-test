package com.hemming.daily.algorithm.算法.链表;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-04 21:41
 */
public class RemoveListTest {

    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);

        removeNthFromEnd(head, 2);

        System.out.println(head);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return head;
    }
}
