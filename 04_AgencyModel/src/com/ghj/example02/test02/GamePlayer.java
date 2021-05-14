package com.ghj.example02.test02;

/**
 * @program: 04_AgencyModel
 * @description: 游戏者类
 * @author: 小江
 * @create: 2021-05-14 19:13
 **/

public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println(this.name+"在打怪！");
    }

    @Override
    public void killBoss() {
        System.out.println("登录名为"+name+"的用户登录成功！");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"又升级了！");
    }
}
