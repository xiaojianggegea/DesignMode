package com.ghj.example01.test033;

import com.ghj.example01.test033.abstractInterface.Traveler;
import com.ghj.example01.test033.method.AircraftStrategy;
import com.ghj.example01.test033.method.HighSpeedRailStrategy;
import com.ghj.example01.test033.method.TrainStrategy;

/**
 * @program: 02_StrategyMode
 * @description: 环境实现类
 * @author: 小江
 * @create: 2021-05-12 16:13
 **/

public class Main {
    public static void main(String[] args) {
        Traveler traveler = new Traveler();
        TrainStrategy trainStrategy = new TrainStrategy();
        HighSpeedRailStrategy highSpeedRailStrategy = new HighSpeedRailStrategy();
        AircraftStrategy aircraftStrategy = new AircraftStrategy();
        System.out.println("出行旅游方式有:");
        System.out.println("第一种:");
        traveler.setTravelStrategy(trainStrategy);
        traveler.travelStyle();
        System.out.println("第二种:");
        traveler.setTravelStrategy(highSpeedRailStrategy);
        traveler.travelStyle();
        System.out.println("第三种:");
        traveler.setTravelStrategy(aircraftStrategy);
        traveler.travelStyle();
    }
}
