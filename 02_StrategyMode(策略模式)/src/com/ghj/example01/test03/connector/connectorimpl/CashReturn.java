package com.ghj.example01.test03.connector.connectorimpl;

import com.ghj.example01.test03.connector.CashSuper;

/**
 * @program: 02_StrategyMode
 * @description: 返利收费子类
 * @author: 小江
 * @create: 2021-05-12 20:10
 **/

public class CashReturn implements CashSuper {
    private double moneyCondititon = 0;
    private double moneyReturn = 0;

    public CashReturn(double moneyCondititon, double moneyReturn) {
        this.moneyCondititon = moneyCondititon;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondititon) {
            result = money - money / moneyCondititon * moneyReturn;
        }
        return result;
    }
}
