package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-22 20:46
 */
public class 合并链表day3 {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(2);
        l2.next.next = new ListNode(4);

        System.out.println(mergeTwoLists(l1, l2));
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = new ListNode(-1);

        ListNode temp = head;

        while (null != l1 && null != l2) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        if (null != l1) {
            temp.next = l1;
        }

        if (null != l2) {
            temp.next = l2;
        }

        return head.next;
    }
}
