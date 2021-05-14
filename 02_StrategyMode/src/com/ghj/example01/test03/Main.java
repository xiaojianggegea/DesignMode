package com.ghj.example01.test03;

import com.ghj.example01.test03.connector.CashSuper;
import com.ghj.example01.test03.factory.CashFactory;

/**
 * @program: 02_StrategyMode
 * @description: 实现类
 * @author: 小江
 * @create: 2021-05-12 20:02
 **/

public class Main {

    private static double total = 0;

    public static void main(String[] args) {
        consume("正常收费", 1, 1000);
        consume("满300返100", 1, 1000);
        consume("打8折", 1, 1000);
        System.out.println("总计:" + total);
    }

    public static void consume(String type, int num, double price) {
        CashSuper csuper = CashFactory.createCash(type);
        double totalPrices = 0;
        totalPrices = csuper.acceptCash(num * price);
        total += totalPrices;
        System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
    }
}
