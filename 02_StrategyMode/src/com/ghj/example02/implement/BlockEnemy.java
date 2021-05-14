package com.ghj.example02.implement;

import com.ghj.example02.IStrategy;

/**
 * @program: 02_StrategyMode
 * @description: 孙夫人断后
 * @author: 小江
 * @create: 2021-05-14 20:37
 **/

public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("锦囊中写道:孙夫人断后，挡住追兵");
    }
}
