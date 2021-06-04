package com.ghj.example02.test01;

/**
 * @program: 03_DecorativePattern
 * @description: 抽象成绩单类
 * @author: 小江
 * @create: 2021-05-16 19:40
 **/

public abstract class SchoolReport  {
    //成绩单展示
    public abstract void report();
    //成绩单家长签字
    public abstract void sign(String name);
}
