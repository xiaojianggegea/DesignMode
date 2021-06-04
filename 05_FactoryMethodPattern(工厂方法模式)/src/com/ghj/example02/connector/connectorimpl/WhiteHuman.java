package com.ghj.example02.connector.connectorimpl;

import com.ghj.example02.connector.Human;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 白色人种类
 * @author: 小江
 * @create: 2021-05-16 15:44
 **/

public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的！");
    }

    @Override
    public void talk() {
        System.out.println("白色人种会说话，一般说的都是单字节。");
    }
}
