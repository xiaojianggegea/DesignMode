package com.ghj.test01;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 看股票同事类
 * @author: 小江
 * @create: 2021-06-04 15:38
 **/

public class StockObserver {
    private String name;
    private Secretary sub;

    public StockObserver(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public void update() {
        System.out.println(sub.getAction() + "	" + name + "关闭股票行情，继续工作！");
    }

}
