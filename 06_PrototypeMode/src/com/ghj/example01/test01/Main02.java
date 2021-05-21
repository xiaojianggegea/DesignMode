package com.ghj.example01.test01;

/**
 * @program: 06_PrototypeMode
 * @description: 客户端类02
 * @author: 小江
 * @create: 2021-05-21 15:12
 **/
public class Main02 {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");
        Resume b = a;
        Resume c = a;
        a.display();
        b.display();
        c.display();
    }
}
