package com.hemming.daily.designPatterns.factory;

/**
 * Created by hmzhang on 2018/9/28.
 */
public class NovaClient {
    public static void main(String[] args) {
        AbstractHumanFactory YinYangGLu = new HumanFactory();
        System.out.println("--火力不足造白种人");
        WhiteHuman whiteHuman = YinYangGLu.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();


        System.out.println("--烧的太久造黑人");
        BlackHuman blackHuman = YinYangGLu.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("--正好，做黄人");
        YellowHuman yellowHuman = YinYangGLu.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }


}
