package com.hemming.daily.cache;

public final class FalseSharingDemo {
    private final static int NUM_THREADS = 4;

    private final static int NUM_TEST_TIMES = 10;

    static class PlainHotVariable {
        public volatile long value = 0L;
    }

    static final class AlignHotVariable extends PlainHotVariable {
        public long p1, p2, p3, p4, p5, p6;
    }

    static final class CompetitorThread extends Thread {
        private final static long ITERATIONS = 500L * 1000L * 1000L;

        private PlainHotVariable plainHotVariable;

        public CompetitorThread(PlainHotVariable plainHotVariable) {
            this.plainHotVariable = plainHotVariable;
        }

        @Override
        public void run() {
            for (int i = 0; i < ITERATIONS; i++) {
                plainHotVariable.value = i;
            }
        }
    }

    public static long runOneTest(PlainHotVariable[] plainHotVariables) throws Exception {
        CompetitorThread[] competitorThreads = new CompetitorThread[plainHotVariables.length];

        for (int i = 0; i < plainHotVariables.length; i++) {
            competitorThreads[i] = new CompetitorThread(plainHotVariables[i]);
        }

        final long start = System.nanoTime();

        for (Thread t : competitorThreads) {
            t.start();
        }

        for (Thread t : competitorThreads) {
            t.join();
        }

        return System.nanoTime() - start;
    }

}
