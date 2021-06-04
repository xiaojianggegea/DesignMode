package com.ghj.example01.test03.connector.connectorimpl;

import com.ghj.example01.test03.connector.CashSuper;

/**
 * @program: 02_StrategyMode
 * @description: 打折收费子类
 * @author: 小江
 * @create: 2021-05-12 20:08
 **/

public class CashRebate implements CashSuper {
    private double moneyRebate = 1;

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }

    @Override
    public double acceptCash(double money) {
        return money*moneyRebate;
    }
}
