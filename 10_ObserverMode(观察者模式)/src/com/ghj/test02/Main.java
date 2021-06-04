package com.ghj.test02;

/**
 * @program: 10_ObserverMode(观察者模式)
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-04 15:39
 **/

public class Main {
    public static void main(String[] args) {
        // 前台小组王麻子
        Secretary wangmazi= new Secretary();


        // 看股票的同事
        StockObserver tongshi1 = new StockObserver("张三",  wangmazi);
        StockObserver tongshi2 = new StockObserver("李四",  wangmazi);

        // 看NBA的同事
        NBAObserver tongshi3 = new NBAObserver("小明", wangmazi);
        NBAObserver tongshi4 = new NBAObserver("小红", wangmazi);

        //前台记下了两位同事
        wangmazi.attach(tongshi1);
        wangmazi.attach(tongshi2);
        wangmazi.attach(tongshi3);
        wangmazi.attach(tongshi4);

        //发现老板回来
        wangmazi.setAction("老板回来了!");

        //通知两个同事
        wangmazi.announce();
    }

}
