package com.hemming.daily.commonUtil.serviceCallUtil;


@FunctionalInterface
public interface Producer<R> {

    R producer() throws ServiceException;

}
