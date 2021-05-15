package com.ghj.test3.method;

import com.ghj.test3.entity.Calculate;
/**
 * @program: 01_SimpleFactoryPattern
 * @description: 除法运算类
 * @author: 小江
 * @create: 2021-05-11 21:50
 **/
public class Division extends Calculate {
    @Override
    public double getResult() throws Exception {
        double result = 0;
        if (!"0".equals(getNumberB())) {
            result = getNumberA() / getNumberB();
        }else {
            System.out.println("除数不能为零！");
        }

        return result;
    }
}
