package com.ghj.test03;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @program: 09_BuilderMode
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-04 15:05
 **/

public class Main extends Frame {
    public void paint(Graphics g) {
        Color c = g.getColor();
        g.setColor(Color.BLACK);
        PersonThinBuilder ptb = new PersonThinBuilder(g);
        PersonDirector pdThin = new PersonDirector(ptb);
        pdThin.createPerson();

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

    public static void main(String[] args) {
        Main drawPerson = new Main();
        drawPerson.lauchFrame();
    }
}

