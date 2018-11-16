package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public abstract class CarBuilder {
    public abstract void setSequence(ArrayList<String> sequence);

    public abstract CarModel getCarModel();
}
