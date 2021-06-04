package com.ghj.test01;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 前台秘书类
 * @author: 小江
 * @create: 2021-06-04 15:36
 **/

public class Secretary {
    private List<StockObserver> observers = new ArrayList<StockObserver>();
    private String action;

    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    public void announce() {
        for (StockObserver obj : observers) {
            obj.update();
        }
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
