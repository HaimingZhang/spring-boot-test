package com.hemming.daily.algorithm.算法.链表;

public class MyList {
    Node head = null;

    class Node {
        private Node next;
        private int value;

        Node(int value) {
            this.value = value;
        }
    }

    public void addNode(int d) {
        Node node = new Node(d);
        if (head == null) {
            head = node;
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = node;
    }

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("");
        System.out.println(stringBuilder.length() == 0);
    }

}
