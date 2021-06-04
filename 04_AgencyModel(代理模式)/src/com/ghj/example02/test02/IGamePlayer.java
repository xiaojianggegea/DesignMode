package com.ghj.example02.test02;

/**
 * @program: 04_AgencyModel
 * @description: 游戏者接口
 * @author: 小江
 * @create: 2021-05-14 19:08
 **/

public interface IGamePlayer {
    //登录游戏
    public void login(String user, String password);
    //杀怪
    public void killBoss();
    //升级
    public void upgrade();
}
