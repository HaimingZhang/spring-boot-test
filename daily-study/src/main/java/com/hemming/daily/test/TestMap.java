package com.hemming.daily.test;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        //Map<Long, Long> groupMapping = new HashMap<>();
        //for (long i = 0L; i < 23L; i++) {
        //    groupMapping.put(i, i);
        //}
        //
        //Map<Long, Long> tempMap = new HashMap<>(16);
        //for (Long k : groupMapping.keySet()) {
        //    if (tempMap.size() == 10) {
        //        print(tempMap);
        //        tempMap.clear();
        //        tempMap.put(k, groupMapping.get(k));
        //    } else {
        //        tempMap.put(k, groupMapping.get(k));
        //    }
        //}
        //if (tempMap.size() > 0) {
        //    print(tempMap);
        //}

        System.out.println(checkData(1001));
    }


    private static void print(Map map) {
        System.out.println(map.toString());
    }

    public static boolean checkData(int d) {

        if (d < 0) {
            return false;
        }

        int mod = 1;

        while (d / mod >= 10) {
            mod *= 10;
        }

        while (d > 0) {
            int left = d / mod;

            int right = d % 10;

            if (left != right) {
                return false;
            }

            d = (d % mod) / 10;

            mod = mod / 100;

        }

        return true;

    }
}
