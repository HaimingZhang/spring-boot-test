package com.hemming.daily.练习.d19;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author zhm176353@alibaba-inc.com 2019-07-08 23:03
 */
public class LRUCache {
    public static void main(String[] args) {
        LRUCache lruCache = new LRUCache(2);

        lruCache.get(2);

        lruCache.put(1, 1);

        lruCache.put(2, 2);

        lruCache.get(1);

        lruCache.put(3, 3);

        lruCache.get(2);

        lruCache.put(4, 4);

        lruCache.get(1);

        lruCache.get(3);

        lruCache.get(4);

        lruCache.get(2);
    }

    private LRU map;

    public LRUCache(int capacity) {
        map = new LRU(capacity);
    }

    public int get(int key) {
        return map.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    class LRU extends LinkedHashMap<Integer, Integer> {
        int capacity;

        public LRU(int capacity) {
            super(capacity, 0.75f, true);
            this.capacity = capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
            return this.size() > capacity;
        }
    }
}
