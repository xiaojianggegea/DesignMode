package com.ghj.example02;

import com.ghj.example02.implement.BackDoor;
import com.ghj.example02.implement.BlockEnemy;
import com.ghj.example02.implement.GivenGreenLight;

/**
 * @program: 02_StrategyMode
 * @description: 使用计谋
 * @author: 小江
 * @create: 2021-05-14 20:42
 **/

public class Main {
    public static void main(String[] args) {
        Context context;
        System.out.println("---刘备刚刚到吴国时拆开第一个");
        //拿到妙计
        context = new Context(new BackDoor());
        //拆开执行
        context.operate();
        //刘备乐不思蜀了
        System.out.println("刘备乐不思蜀了，拆开第二个");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("孙权的小兵追来了，咋办？拆开了第三个");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("这孙权是赔了夫人有折兵啊!");
    }
}
