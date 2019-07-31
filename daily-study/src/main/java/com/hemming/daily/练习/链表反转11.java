package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-30 11:30
 */
public class 链表反转11 {
    public static void main(String[] args) {
        链表反转11 test = new 链表反转11();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        test.reverseList(l1);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode temp = head;

        ListNode prev = null;

        while (temp != null) {
            ListNode nextNode = temp.next;

            temp.next = prev;

            prev = temp;

            temp = nextNode;
        }

        return prev;

    }

}
