package com.hemming.daily.designPatterns.builder;

import java.util.ArrayList;

/**
 * Created by hmzhang on 2018/10/1.
 */
public abstract class CarModel {
    public ArrayList<String> sequence = new ArrayList<>();

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engine();

    final public void run() {
        for (int i = 0; i < sequence.size(); i++) {
            String actionName = this.sequence.get(i);
            if ("start".equals(actionName)) {
                this.start();
            } else if ("stop".equals(actionName)) {
                this.stop();
            } else if ("alarm".equals(actionName)) {
                this.alarm();
            } else if ("engine".equals(actionName)) {
                this.engine();
            }
        }
    }

    final public void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
