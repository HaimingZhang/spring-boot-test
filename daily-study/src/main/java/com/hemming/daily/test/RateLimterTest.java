package com.hemming.daily.test;

import com.google.common.base.Preconditions;

/**
 * Created by hmzhang on 2018/9/16.
 */
public class RateLimterTest {
    public void preditionCheck(Long itemId) {
        Preconditions.checkArgument(itemId != null, "Item 不能为空");
    }

    public static void main(String[] args) {
        RateLimterTest r = new RateLimterTest();
        r.preditionCheck(null);
    }
}
