package com.hemming.daily.练习.d26;

import java.util.Iterator;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-18 23:29
 */
public class Stack<Item> implements Iterable<Item> {

    int N = 0;

    Node first;

    private class Node {
        Item item;
        Node next;
    }

    public void push(Item item) {
        Node oldFirst = first;

        first = new Node();

        first.item = item;

        first.next = oldFirst;

        N++;
    }

    public Item pop() {
        Item item = first.item;

        first = first.next;

        N--;

        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return null;
    }
}
