package com.ghj.example01.test1.entity;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 运算基类
 * @author: 小江
 * @create: 2021-05-11 21:45
 **/
public class Calculate {
    private double numberA = 0;
    private double numberB = 0;

    public double getResult() throws Exception{
        double result = 0;
        return result;
    }
    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
}
