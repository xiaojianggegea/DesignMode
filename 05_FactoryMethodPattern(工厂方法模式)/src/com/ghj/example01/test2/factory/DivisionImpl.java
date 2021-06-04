package com.ghj.example01.test2.factory;

import com.ghj.example01.test2.entity.Calculate;
import com.ghj.example01.test2.factory.port.Factory;
import com.ghj.example01.test2.method.Division;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 除法工厂类
 * @author: 小江
 * @create: 2021-05-15 19:57
 **/

public class DivisionImpl implements Factory {
    @Override
    public Calculate createCalculate() {
        return new Division();
    }
}
