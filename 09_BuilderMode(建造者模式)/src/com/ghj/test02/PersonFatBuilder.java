package com.ghj.test02;

import java.awt.*;

/**
 * @program: 09_BuilderMode
 * @description: 画胖子的类
 * @author: 小江
 * @create: 2021-06-04 14:53
 **/

public class PersonFatBuilder {
    private Graphics g;

    public PersonFatBuilder(Graphics g)
    {
        this.g = g;
    }

    public void build()
    {
        Color c = g.getColor();
        g.setColor(Color.BLACK);

        g.fillOval(50, 50, 30, 30);// 头
        g.fillRect(60, 80, 10, 50);// 身体
        g.drawLine(60, 80, 40, 130);// 左手
        g.drawLine(70, 80, 90, 130);// 左手
        g.drawLine(60, 130, 45, 180);// 左腿
        g.drawLine(70, 130, 85, 180);// 右腿

        g.setColor(c);
    }

}
