package com.ghj.example02.factory;

import com.ghj.example02.connector.Human;

/**
 * @program: 05_FactoryMethodPattern
 * @description: 人类创建工厂类
 * @author: 小江
 * @create: 2021-05-16 15:49
 **/

public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            System.out.println("人种生成错误！");
        } catch (IllegalAccessException e) {
            System.out.println("人种生成错误！");
        } catch (ClassNotFoundException e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
