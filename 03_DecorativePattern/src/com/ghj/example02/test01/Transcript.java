package com.ghj.example02.test01;

import com.sun.corba.se.impl.orbutil.ObjectUtility;

/**
 * @program: 03_DecorativePattern
 * @description: 成绩单类
 * @author: 小江
 * @create: 2021-05-16 19:43
 **/

public  class Transcript extends SchoolReport {
    @Override
    public void report() {
        //成绩单格式
        System.out.println("尊敬的小江家长:");
        System.out.println("......");
        System.out.println("语文 62  数学 60 体育 80 自然 65");
        System.out.println("......");
        System.out.println("       家长签字:               ");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为:" +name);
    }
}
