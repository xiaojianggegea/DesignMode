package com.ghj.test01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @program: 09_BuilderMode
 * @description: 胖小人类
 * @author: 小江
 * @create: 2021-06-04 14:48
 **/

public class DrawPerson01 extends Frame {
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.BLACK);

        g.fillOval(50, 50, 30, 30);//头
        g.fillOval(45, 80, 40, 50);//身体
        g.drawLine(60, 80, 40, 130);//左手
        g.drawLine(70, 80, 90, 130);//左手
        g.drawLine(60, 130, 45, 180);//左腿
        g.drawLine(70, 130, 85, 180);//右腿

        g.setColor(c);

    }

    public void lauchFrame() {
        this.setLocation(400, 300);
        this.setSize(800, 600);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        this.setBackground(Color.WHITE);
        setVisible(true);
    }
}
