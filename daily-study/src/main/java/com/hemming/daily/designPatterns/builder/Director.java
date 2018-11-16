package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class Director {
    private ArrayList<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();

    public BenzModel getABenzModel() {
        sequence.clear();
        sequence.add("start");
        sequence.add("end");
        benzBuilder.setSequence(sequence);
        benzBuilder.getCarModel().run();
        return (BenzModel) benzBuilder.getCarModel();
    }
}
