package com.ghj.example01.test04;

import com.ghj.example01.test04.connector.connectorimpl.ConcreteStrategyA;
import com.ghj.example01.test04.connector.connectorimpl.ConcreteStrategyB;
import com.ghj.example01.test04.connector.connectorimpl.ConcreteStrategyC;
import com.ghj.example01.test04.context.Context;

/**
 * @program: 02_StrategyMode
 * @description: 实现类
 * @author: 小江
 * @create: 2021-05-12 20:32
 **/

public class Main {
    public static void main(String[] args) {
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.contextInterface();

        context = new Context(new ConcreteStrategyB());
        context.contextInterface();

        context = new Context(new ConcreteStrategyC());
        context.contextInterface();
    }
}
