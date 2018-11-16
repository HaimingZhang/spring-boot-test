package com.hemming.daily.designPatterns.proxy;

/**
 * Created by hmzhang on 2018/10/2.
 */
public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String userName, String psw) {
        this.gamePlayer.login(userName, psw);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    @Override
    public IGamePlayer getPlayer() {
        return this;
    }
}
