package com.ghj.example01.test2.factory;

import com.ghj.example01.test2.entity.Calculate;
import com.ghj.example01.test2.factory.port.Factory;
import com.ghj.example01.test2.method.Addition;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 加法工厂
 * @author: 小江
 * @create: 2021-05-15 19:54
 **/

public class AdditionImpl implements Factory {
    @Override
    public Calculate createCalculate() {
        return new Addition();
    }
}
