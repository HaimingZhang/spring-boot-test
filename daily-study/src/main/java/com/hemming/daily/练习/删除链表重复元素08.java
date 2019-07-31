package com.hemming.daily.练习;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-27 22:41
 */
public class 删除链表重复元素08 {



    public static ListNode removeDumpNode(ListNode listNode) {
        if (null == listNode) {
            return null;
        }

        ListNode temp = listNode;

        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }
        return listNode;

    }
}
