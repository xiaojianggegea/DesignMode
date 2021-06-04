package com.ghj.test02;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 第二个观察者类
 * @author: 小江
 * @create: 2021-06-04 15:45
 **/

public class NBAObserver extends Observer {
    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    public void update() {
        System.out.println(sub.getAction() + "	" + name + "关闭NBA直播，继续工作！");
    }

}
