package com.hemming.daily.commonUtil.serviceCallUtil;


public class ServiceUtil {

    /**
     * 重试带返回值
     *
     * @param producer
     * @param retryTimes
     * @param <R>
     * @return
     * @throws ServiceException
     */
    public static <R> R doRetry(Producer<R> producer, int retryTimes) throws ServiceException {
        int remainRetryTimes = retryTimes;
        do {
            try {
                return producer.producer();
            } catch (Exception e) {
                remainRetryTimes--;
                int between = retryTimes - remainRetryTimes;
                try {
                    Thread.sleep(10 * between);
                } catch (Exception ex) {

                }
                if (remainRetryTimes > 0) {
                    continue;
                }
                throw e;
            }
        } while (true);
    }

    /**
     * 重试不带返回
     *
     * @param producerNull
     * @param retryTimes
     * @throws ServiceException
     */
    public static void doRetryWithoutReturn(ProducerNull producerNull, int retryTimes) throws Exception {
        int remainRetryTimes = retryTimes;
        do {
            try {
                producerNull.producer();
                return;
            } catch (Exception e) {
                remainRetryTimes--;
                int between = retryTimes - remainRetryTimes;
                Thread.sleep(10 * between);
                if (remainRetryTimes > 0) {
                    continue;
                }
                throw e;
            }
        } while (true);
    }

}
