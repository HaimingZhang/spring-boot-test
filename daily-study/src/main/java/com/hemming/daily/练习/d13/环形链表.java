package com.hemming.daily.练习.d13;

import com.hemming.daily.练习.ListNode;

import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-02 22:50
 */
public class 环形链表 {

    public boolean hasCycle(ListNode head) {

        ListNode fast = head, slow = head;

        while (fast != null && slow != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (Objects.equals(fast, slow)) {
                return true;
            }
        }

        return false;
    }

}
