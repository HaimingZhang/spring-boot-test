package com.hemming.daily.练习.d26;

import java.util.Iterator;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-18 22:44
 */
public class ResizingArrayStack<Item> implements Iterable<Item> {

    private Item[] a = (Item[])new Object[1];

    private int N = 0;

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    /**
     * 重新生成数组
     *
     * @param max
     */
    private void resize(int max) {
        Item[] newArr = (Item[])new Object[max];

        for (int i = 0; i < N; i++) {
            newArr[i] = a[i];
        }

        a = newArr;
    }

    public void push(Item item) {
        if (N == a.length) {
            resize(2 * a.length);
        }
        a[N++] = item;
    }

    public Item pop() {
        Item item = a[--N];
        a[N] = null;
        if (N > 0 && N == a.length / 4) { resize(a.length / 2); }
        return item;
    }

    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }

    private class ReverseArrayIterator implements Iterator<Item> {
        private int i = N;

        @Override
        public boolean hasNext() {
            return i > 0;
        }

        @Override
        public Item next() {
            return a[--i];
        }

        @Override
        public void remove() {

        }
    }
}
