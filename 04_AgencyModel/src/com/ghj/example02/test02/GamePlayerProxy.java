package com.ghj.example02.test02;

/**
 * @program: 04_AgencyModel
 * @description: 游戏代练
 * @author: 小江
 * @create: 2021-05-14 19:33
 **/

public class GamePlayerProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer _gamePlayer) {
        this.gamePlayer = _gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        //代练登录
        this.gamePlayer.login("小江哥哥","123456");
    }

    @Override
    public void killBoss() {
        //代练杀怪
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        //代练升级
        this.gamePlayer.upgrade();
    }
}
