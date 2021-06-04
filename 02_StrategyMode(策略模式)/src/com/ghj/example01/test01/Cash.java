package com.ghj.example01.test01;

/**
 * @program: 02_StrategyMode
 * @description: 收费处理
 * @author: 小江
 * @create: 2021-05-12 19:36
 **/

public class Cash {
    private double total = 0;

    public void submit(int num, double price) {
        double totalPrice = num * price;
        total += totalPrice;
        System.out.println("单价:" + price + "数量:" + num + "合计:" + totalPrice);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
