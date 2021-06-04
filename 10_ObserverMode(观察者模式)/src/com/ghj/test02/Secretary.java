package com.ghj.test02;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 前台秘书类
 * @author: 小江
 * @create: 2021-06-04 15:45
 **/

public class Secretary {
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void announce() {
        for (Observer obj : observers) {
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
