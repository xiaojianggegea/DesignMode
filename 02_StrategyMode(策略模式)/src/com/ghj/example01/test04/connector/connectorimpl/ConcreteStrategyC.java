package com.ghj.example01.test04.connector.connectorimpl;

import com.ghj.example01.test04.connector.Strategy;

/**
 * @program: 02_StrategyMode
 * @description: 算法C
 * @author: 小江
 * @create: 2021-05-12 20:31
 **/

public class ConcreteStrategyC implements Strategy {
    public void algorithmInterface()
    {
        System.out.println("算法C实现");
    }
}
