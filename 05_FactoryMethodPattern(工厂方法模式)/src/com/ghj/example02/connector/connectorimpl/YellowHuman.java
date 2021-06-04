package com.ghj.example02.connector.connectorimpl;

import com.ghj.example02.connector.Human;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 黄色人种类
 * @author: 小江
 * @create: 2021-05-16 15:42
 **/

public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的！");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，一般说的都是双字节。");
    }
}
