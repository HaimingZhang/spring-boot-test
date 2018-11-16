package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Client {
    public static void main(String[] args) {
//        CarModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("start");
        sequence.add("engine");
        sequence.add("alarm");
        sequence.add("stop");
//        benzModel.setSequence(sequence);
//        benzModel.run();

        BenzBuilder benzBuilder = new BenzBuilder();
        benzBuilder.setSequence(sequence);
        benzBuilder.getCarModel().run();
    }
}
