package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends IHuman> T createHuman(Class<T> type) {
        IHuman human = null;
        try {
            human = (IHuman) Class.forName(type.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("创建人类失败");
        }
        return (T) human;
    }
}
