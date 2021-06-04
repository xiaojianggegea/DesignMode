package com.ghj.example02;

/**
 * @program: 02_StrategyMode
 * @description: 锦囊
 * @author: 小江
 * @create: 2021-05-14 20:38
 **/

public class Context {
    private IStrategy strategy;
    //构造函数，使用那个计谋
    public Context(IStrategy _strategy) {
        this.strategy = _strategy;
    }
    //使用计谋，出招
    public void operate() {
        this.strategy.operate();
    }
}
