package com.hemming.daily.designPatterns.proxy;

/**
 * Created by hmzhang on 2018/10/3.
 */
public class GamePlayer implements IGamePlayer {
    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String _name) {
        this.name = _name;
    }

    @Override
    public void login(String userName, String psw) {
        if (this.isProxy()) {
            System.out.println(this.name + "在登录");
        } else {
            System.out.println("请使用指定的代理");
        }
    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪升级");
        } else {
            System.out.println("请使用指定的代理");
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + "升级中");
        } else {
            System.out.println("请使用合适的代理");
        }
    }

    @Override
    public IGamePlayer getPlayer() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }
}
