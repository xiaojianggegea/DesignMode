package com.ghj.example01.test02;

/**
 * @program: 02_StrategyMode
 * @description: 收费处理
 * @author: 小江
 * @create: 2021-05-12 19:45
 **/

public class Cash {
    private double total = 0;
    private int selectedIndex = 0;

    public void selectFormLoad() {
        String[] selectForm = {"正常收费", "打8折", "打7折", "打5折"};
        selectedIndex = 0;
    }

    public void submit(int num, double price) {
        double totalPrice = 0;
        switch (selectedIndex) {
            case 0:
                totalPrice = num * price;
                break;
            case 1:
                totalPrice = num * price * 0.8;
                break;
            case 2:
                totalPrice = num * price * 0.7;
                break;
            case 3:
                totalPrice = num * price * 0.5;
                break;
        }
        total += totalPrice;
        System.out.println("单价:" + price + "数量:" + num + "合计:" + totalPrice);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getSelectedIndex() {
        return selectedIndex;
    }

    public void setSelectedIndex(int selectedIndex) {
        this.selectedIndex = selectedIndex;
    }
}
