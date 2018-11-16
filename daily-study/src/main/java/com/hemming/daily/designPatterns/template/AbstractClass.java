package com.hemming.daily.designPatterns.template;

/**
 * Created by hmzhang on 2018/10/1.
 */
public abstract class AbstractClass {
    protected abstract void doA();

    protected abstract void doB();

    /**
     * 钩子方法
     *
     * @return
     */
    protected abstract boolean needDoB();

    public void templateMethod() {
        this.doA();
        if (this.needDoB()) this.doB();
    }

}
