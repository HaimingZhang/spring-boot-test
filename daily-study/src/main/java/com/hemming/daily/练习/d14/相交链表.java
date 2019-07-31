package com.hemming.daily.练习.d14;

import com.hemming.daily.练习.ListNode;

import java.util.Objects;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-03 22:26
 */
public class 相交链表 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (null == headA || null == headB) {
            return null;
        }

        ListNode pA = headA, pB = headB;

        while (!Objects.equals(pA, pB)) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }

        return pA;
    }

}
