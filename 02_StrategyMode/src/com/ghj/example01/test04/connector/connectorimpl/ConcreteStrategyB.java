package com.ghj.example01.test04.connector.connectorimpl;

import com.ghj.example01.test04.connector.Strategy;

/**
 * @program: 02_StrategyMode
 * @description: 算法B
 * @author: 小江
 * @create: 2021-05-12 20:31
 **/

public class ConcreteStrategyB implements Strategy {
    public void algorithmInterface()
    {
        System.out.println("算法B实现");
    }
}
