package com.ghj.example02;

import com.ghj.example02.connector.connectorimpl.BlackHuman;
import com.ghj.example02.connector.connectorimpl.WhiteHuman;
import com.ghj.example02.connector.connectorimpl.YellowHuman;
import com.ghj.example02.factory.AbstractHumanFactory;
import com.ghj.example02.factory.HumanFactory;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 女娲造人类
 * @author: 小江
 * @create: 2021-05-16 15:53
 **/

public class NvWaMain {
    public static void main(String[] args) {
        //工厂声明
        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
        System.out.println("女娲第一次造人，火候不足");
        System.out.println("--造出第一批人是白种人--");
        WhiteHuman whiteHuman = abstractHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();

        System.out.println("女娲第二次造人，火候过足");
        System.out.println("--造出第二批人是黑种人--");
        BlackHuman blackHuman = abstractHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();

        System.out.println("女娲第三次造人，火候刚刚好");
        System.out.println("--造出第三批人是黄种人--");
        YellowHuman yellowHuman = abstractHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
