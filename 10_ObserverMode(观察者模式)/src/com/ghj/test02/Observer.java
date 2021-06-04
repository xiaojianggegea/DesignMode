package com.ghj.test02;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 抽象的观察者类
 * @author: 小江
 * @create: 2021-06-04 15:42
 **/

public abstract class Observer {
    protected String name;
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();

}
