package com.hemming.daily.algorithm.linked;

/**
 * Created by hmzhang on 2018/10/23.
 */
public class MyList {
    Node head = null;

    class Node {
        Node next = null;
        int value;

        Node(int _v) {
            this.value = _v;
        }
    }

    public void addNode(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }



    public void printAllValue() {
        if (head == null) return;
        Node temp = head;
        System.out.println(head.value);
        while (temp.next != null) {
            System.out.println(temp.next.value);
            temp = temp.next;
        }
    }

}
