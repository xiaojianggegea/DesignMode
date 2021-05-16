package com.ghj.example02.connector.connectorimpl;

import com.ghj.example02.connector.Human;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 黑色人种类
 * @author: 小江
 * @create: 2021-05-16 15:39
 **/

public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑人会说话，一般人听不懂。");
    }
}
