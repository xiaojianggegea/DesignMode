package com.ghj.example01.test033.abstractInterface;

/**
 * @program: 02_StrategyMode
 * @description: 策略接口实现
 * @author: 小江
 * @create: 2021-05-12 16:27
 **/

public class Traveler {
    TravelStrategy travelStrategy;

    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public void travelStyle(){
        travelStrategy.travelStyle();
    }
}
