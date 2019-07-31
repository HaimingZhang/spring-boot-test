package com.hemming.daily.java8;

import com.hemming.daily.commonUtil.serviceCallUtil.ProducerNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zhm176353@alibaba-inc.com 2019-05-21 20:53
 */
public class FunctionTest1 {

    public static void main(String[] args) {
        FunctionTest1 f1 = new FunctionTest1();
        System.out.println(f1.compute(5, v -> v + 4, v -> v * v));

        List<Long> list = new ArrayList<>(1);
        list.stream().sorted((a, b) -> (int)(b - a));

        list.stream().filter(a -> {
            System.out.println(a);
            return a > 2;
        });

        ArrayList<A> longs = new ArrayList<>();

        longs.add(new FunctionTest1.A(1, Arrays.asList(1L, 2L)));

        //List<Long> longs1 = longs
        //    .stream()
        //    .map(String::valueOf)
        //    //.flatMap()
        //    .collect(Collectors.toList());

        ThreadLocal<Integer> integerThreadLocal = ThreadLocal.withInitial(() -> get(1));
        ThreadLocal<Integer> aa = new ThreadLocal<>();

    }

    public static Integer get(Integer a) {
        return a;
    }

    public Integer compute(Integer a, Function<Integer, Integer> f1, Function<Integer, Integer> f2) {
        Integer apply = f2.andThen(f1).apply(a);
        return apply;
    }

    static class A {
        long a;

        List<Long> listA;

        public A(long a, List<Long> listA) {
            this.a = a;
            this.listA = listA;
        }

        public long getA() {
            return a;
        }

        public void setA(long a) {
            this.a = a;
        }

        public List<Long> getListA() {
            return listA;
        }

        public void setListA(List<Long> listA) {
            this.listA = listA;
        }
    }

    static class B {
        long a;

        long b;

        public B(long a, long b) {
            this.a = a;
            this.b = b;
        }

        public long getA() {
            return a;
        }

        public void setA(long a) {
            this.a = a;
        }

        public long getB() {
            return b;
        }

        public void setB(long b) {
            this.b = b;
        }
    }

}
