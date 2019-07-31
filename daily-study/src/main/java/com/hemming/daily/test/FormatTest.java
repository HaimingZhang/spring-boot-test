package com.hemming.daily.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author zhm176353@alibaba-inc.com 2019-06-12 18:03
 */
public class FormatTest {
    public static void main(String[] args) {
        DecimalFormat df   = new DecimalFormat("######0.000");

        double d1 = 10103.23516;
        double d2 = 0.0;
        double d3 = 2.0;
        String s1 = df.format(d1);
        String s2 = df.format(d2);
        String s3 = df.format(d3);


        BigDecimal b   =   new   BigDecimal(d1);
        double   f1   =   b.setScale(3,   BigDecimal.ROUND_FLOOR).doubleValue();

        System.out.println(f1);



    }
}
