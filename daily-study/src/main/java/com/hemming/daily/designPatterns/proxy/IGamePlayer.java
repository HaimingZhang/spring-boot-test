package com.hemming.daily.designPatterns.proxy;

/**
 * Created by hmzhang on 2018/10/2.
 */
public interface IGamePlayer {
    public void login(String userName, String psw);

    public void killBoss();

    public void upgrade();

    public IGamePlayer getPlayer();

}
