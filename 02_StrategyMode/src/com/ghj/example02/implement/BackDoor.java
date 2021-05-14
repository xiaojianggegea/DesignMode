package com.ghj.example02.implement;

import com.ghj.example02.IStrategy;

/**
 * @program: 02_StrategyMode
 * @description: 乔国老开后门
 * @author: 小江
 * @create: 2021-05-14 20:33
 **/

public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("锦囊中写道:找乔国老帮忙，让吴国太给孙权施加压力");
    }
}
