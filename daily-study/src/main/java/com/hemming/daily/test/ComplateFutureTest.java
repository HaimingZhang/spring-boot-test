package com.hemming.daily.test;

import java.util.concurrent.CompletableFuture;

/**
 * @author zhm176353@alibaba-inc.com 2019-05-14 11:05
 */
public class ComplateFutureTest {

    public static void main(String[] args) {

        ComplateFutureTest cf = new ComplateFutureTest();

        cf.doMethod();
    }

    private void doMethod() {
        //Stopwatch stopwatch = new Stopwatch();

        CompletableFuture<Void> f1 = CompletableFuture.runAsync(() -> {
            System.out.println("执行a");
            sleep(1L);

            System.out.println("执行b");
        });

        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行c");

            sleep(2L);

            System.out.println("执行d");
            return 1;
        });

        CompletableFuture<Integer> f3 = f1.thenCombine(f2, (__, b) -> {
            System.out.println(b);
            return b;
        });

        f3.join();

        Thread t = new Thread() {

        };

        System.out.println("完成");
    }

    private void sleep(long miSecond) {
        try {
            Thread.sleep(miSecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
