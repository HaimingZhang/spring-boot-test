package com.hemming.daily.jdkStudy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hmzhang on 2018/3/20.
 */
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) list.add(new OOMObject());
    }

}
