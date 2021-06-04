package com.ghj.example01.test03.connector.connectorimpl;

import com.ghj.example01.test03.connector.CashSuper;

/**
 * @program: 02_StrategyMode
 * @description: 正常收费子类
 * @author: 小江
 * @create: 2021-05-12 20:06
 **/

public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
