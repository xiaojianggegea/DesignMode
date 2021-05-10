package com.ghj.test01;

import com.ghj.test01.entity.Person;

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
