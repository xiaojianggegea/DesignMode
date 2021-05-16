package com.ghj.example01.test02.entity;
/**
 * @program: 02_DecorativePattern
 * @description: Person类
 * @author: 小江
 * @create: 2021-05-12 13:35
 **/
public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
}
