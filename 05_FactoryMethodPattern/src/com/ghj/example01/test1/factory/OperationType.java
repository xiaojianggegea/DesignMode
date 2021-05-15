package com.ghj.example01.test1.factory;

import com.ghj.example01.test1.entity.Calculate;
import com.ghj.example01.test1.method.Addition;
import com.ghj.example01.test1.method.Division;
import com.ghj.example01.test1.method.Multiplication;
import com.ghj.example01.test1.method.Subtraction;

/**
 * @program: 01_SimpleFactoryPattern
 * @description: 运算工厂类
 * @author: 小江
 * @create: 2021-05-11 22:13
 **/

public class OperationType {
    public static Calculate createOperation(String operate)
    {
        Calculate calculate = null;
        if ("+".equals(operate))
            calculate = new Addition();
        else if ("-".equals(operate))
            calculate = new Subtraction();
        else if ("*".equals(operate))
            calculate = new Multiplication();
        else if ("/".equals(operate))
            calculate = new Division();
        return calculate;
    }
}
