package com.ghj.test01;

/**
 * @program: 09_BuilderMode
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-04 14:45
 **/

public class Main {
    public static void main(String[] args) {
        DrawPerson person = new DrawPerson();
        DrawPerson01 person01  = new DrawPerson01();
        person.lauchFrame();
        person01.lauchFrame();
    }
}
