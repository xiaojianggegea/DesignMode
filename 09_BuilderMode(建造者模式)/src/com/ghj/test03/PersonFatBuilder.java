package com.ghj.test03;

import java.awt.*;

/**
 * @program: 09_BuilderMode
 * @description: 胖子类
 * @author: 小江
 * @create: 2021-06-04 15:03
 **/

public class PersonFatBuilder extends PersonBuilder {
    public PersonFatBuilder(Graphics g) {
        super(g);
    }

    @Override
    public void buildHead() {
        g.fillOval(50, 50, 30, 30);// 头
    }

    @Override
    public void buildBody() {
        g.fillRect(60, 80, 10, 50);// 身体
    }

    @Override
    public void buildArmLeft() {
        g.drawLine(60, 80, 40, 130);// 左手
    }

    @Override
    public void buildArmRight() {
        g.drawLine(70, 80, 90, 130);// 右手
    }

    @Override
    public void buildLegLeft() {
        g.drawLine(60, 130, 45, 180);// 左腿
    }

    @Override
    public void buildLegRight() {
        g.drawLine(70, 130, 85, 180);// 右腿
    }
}
