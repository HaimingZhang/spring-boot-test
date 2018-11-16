package com.hemming.daily.jdkStudy;

/**
 * Created by hmzhang on 2018/3/21.
 */
public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigsize = new byte[2 * _1MB];


    /**
     * 从侧面看来并不是利用计数算法来判断对象是否存活的
     */
    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();
        objA.instance = objB;
        objB.instance = objA;

        objA = null;
        objB = null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }


}
