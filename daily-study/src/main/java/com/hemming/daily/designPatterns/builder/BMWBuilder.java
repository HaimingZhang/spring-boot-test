package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
