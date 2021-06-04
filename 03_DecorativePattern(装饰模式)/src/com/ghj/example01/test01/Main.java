package com.ghj.example01.test01;

import com.ghj.example01.test01.entity.Person;
/**
 * @program: 02_DecorativePattern
 * @description: 实现类
 * @author: 小江
 * @create: 2021-05-12 13:50
 **/
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小江");
        System.out.println("装扮：");
        person.wearPlaidShirt();
        person.wearLongJohns();
        person.wearNike();
        person.show();

        System.out.println("长啥样:");
        person.hairStyle();
        person.wearGlasses();
        person.wearAutumnShoes();
        person.show();
    }
}
