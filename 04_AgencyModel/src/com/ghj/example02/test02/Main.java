package com.ghj.example02.test02;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: 04_AgencyModel
 * @description: 场景类
 * @author: 小江
 * @create: 2021-05-14 19:38
 **/

public class Main {
    public static void main(String[] args) {
        IGamePlayer iGamePlayer = new GamePlayer("小江");
        IGamePlayer proxy = new GamePlayerProxy(iGamePlayer);
        //开始打游戏时间
        Date date = new Date();
        SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        System.out.println(dateFormat.format(date)+"开始游戏");
        proxy.login("小江哥哥", "123456");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("游戏结束,在线时长3小时！");
    }
}
