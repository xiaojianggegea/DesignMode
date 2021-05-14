package com.ghj.example01.test033.method;

import com.ghj.example01.test033.abstractInterface.TravelStrategy;

/**
 * @program: 02_StrategyMode
 * @description: 乘坐高铁策略
 * @author: 小江
 * @create: 2021-05-12 16:08
 **/

public class HighSpeedRailStrategy implements TravelStrategy {
    @Override
    public void travelStyle() {
        System.out.println("乘坐高铁......");
    }
}
