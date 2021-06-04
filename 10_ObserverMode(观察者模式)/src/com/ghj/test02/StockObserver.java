package com.ghj.test02;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 第一个观察者类
 * @author: 小江
 * @create: 2021-06-04 15:43
 **/

public class StockObserver extends Observer {
    public StockObserver(String name, Secretary sub) {
        super(name, sub);
    }

    public void update() {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
    }
}
