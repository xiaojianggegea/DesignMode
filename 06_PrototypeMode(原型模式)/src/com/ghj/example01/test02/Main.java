package com.ghj.example01.test02;

/**
 * @program: 06_PrototypeMode
 * @description: 客户端类
 * @author: 小江
 * @create: 2021-05-21 15:38
 **/

public class Main {
    public static void main(String[] args) {
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "XX公司");
        Resume b = a.clone();
        b.setWorkExperience("1998-2006", "YY企业");
        Resume c = a.clone();
        c.setWorkExperience("1998-2003", "ZZ企业");
        a.display();
        b.display();
        c.display();
    }
}
