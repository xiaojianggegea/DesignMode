package com.ghj.example01.test2.factory;

import com.ghj.example01.test2.entity.Calculate;
import com.ghj.example01.test2.factory.port.Factory;
import com.ghj.example01.test2.method.Subtraction;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 减法工厂类
 * @author: 小江
 * @create: 2021-05-15 19:55
 **/

public class SubtractionImpl implements Factory {
    @Override
    public Calculate createCalculate() {
        return new Subtraction();
    }
}
