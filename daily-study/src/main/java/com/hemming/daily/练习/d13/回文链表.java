package com.hemming.daily.练习.d13;

import com.hemming.daily.练习.ListNode;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-02 23:02
 */
public class 回文链表 {

    public static void main(String[] args) {
        回文链表 test = new 回文链表();

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(5);
        l1.next.next = new ListNode(1);

        test.isPalindrome(l1);
    }

    public boolean isPalindrome(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode reverse = reverse(slow);

        while (reverse != null) {

            if (head.val != reverse.val) {
                return false;
            }

            head = head.next;

            reverse = reverse.next;
        }

        return true;

    }

    public ListNode reverse(ListNode node) {
        ListNode current = node, prev = null;

        while (current != null) {
            ListNode tempNext = current.next;

            current.next = prev;

            prev = current;

            current = tempNext;
        }

        return prev;
    }

}
