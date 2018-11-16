package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class BenzBuilder extends CarBuilder {
    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzModel;
    }
}
