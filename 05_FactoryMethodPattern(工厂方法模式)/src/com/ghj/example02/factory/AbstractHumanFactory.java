package com.ghj.example02.factory;

import com.ghj.example02.connector.Human;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 抽象人类创建工厂
 * @author: 小江
 * @create: 2021-05-16 15:46
 **/

public abstract class AbstractHumanFactory {
    //通过泛型对createHuman的输入参数产生限制
    public abstract <T extends Human> T createHuman(Class<T> c);
}
