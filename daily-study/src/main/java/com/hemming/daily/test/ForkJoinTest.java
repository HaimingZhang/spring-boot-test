package com.hemming.daily.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ForkJoinTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        ForkJoinTest forkJoinTest = new ForkJoinTest();

        Long time1 = System.currentTimeMillis();

        //List<Integer> integers = forkJoinTest.get(list);

        Long time2 = System.currentTimeMillis() - time1;

        System.out.println("当前时间01 : " + time2);

        Long time3 = System.currentTimeMillis();

        List<Integer> results = new ArrayList<>(list.size());

        for (Integer i : list) {
            results.add(forkJoinTest.getById(i));
        }

        Long time4 = System.currentTimeMillis() - time3;

        System.out.println("02 : " + time4);


    }

    //public List<Integer> get(List<Integer> list) {
    //    //list.stream().map(i -> CompletableFuture.supplyAsync(() -> getById(i)).exceptionally(throwable -> new RuntimeException("1")))
    //    //List<Integer> collect1 = collect.stream().filter(Objects::nonNull).map(CompletableFuture::join).collect(Collectors.toList());
    //    //return collect1;
    //}

    public int getById(int i) {
        Random random = new Random(i);
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i << 2;
    }
}
