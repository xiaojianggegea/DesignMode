package com.ghj.example01.test2.factory.port;

import com.ghj.example01.test2.entity.Calculate;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 工厂接口
 * @author: 小江
 * @create: 2021-05-15 19:47
 **/
public interface Factory {
    Calculate createCalculate();
}
