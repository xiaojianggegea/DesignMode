package com.ghj.example01.test2.method;

import com.ghj.example01.test2.entity.Calculate;

/**
 * @program: 01_SimpleFactoryPattern
 * @description: 乘法运算类
 * @author: 小江
 * @create: 2021-05-11 21:51
 **/
public class Multiplication extends Calculate {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        result = getNumberA() * getNumberB();
        return result;
    }
}
