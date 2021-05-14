package com.ghj.example01.test03.factory;

import com.ghj.example01.test03.connector.CashSuper;
import com.ghj.example01.test03.connector.connectorimpl.CashNormal;
import com.ghj.example01.test03.connector.connectorimpl.CashRebate;
import com.ghj.example01.test03.connector.connectorimpl.CashReturn;

/**
 * @program: 02_StrategyMode
 * @description: 现金收费工厂类
 * @author: 小江
 * @create: 2021-05-12 20:15
 **/

public class CashFactory {
    public static CashSuper createCash(String type) {
        CashSuper cs = null;
        if ("正常收费".equals(type)) {
            cs = new CashNormal();
        } else if ("满300返100".equals(type)) {
            cs = new CashReturn(300, 100);
        } else if ("打8折".equals(type)) {
            cs = new CashRebate(0.8);
        }
        return cs;
    }
}
