package com.ghj.example01.test04.context;

import com.ghj.example01.test04.connector.Strategy;

/**
 * @program: 02_StrategyMode
 * @description: 对Strategy对象的引用
 * @author: 小江
 * @create: 2021-05-12 20:44
 **/

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void contextInterface(){
        strategy.algorithmInterface();
    }
}
