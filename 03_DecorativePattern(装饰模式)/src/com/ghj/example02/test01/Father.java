package com.ghj.example02.test01;

/**
 * @program: 03_DecorativePattern
 * @description: 老爸查看成绩单
 * @author: 小江
 * @create: 2021-05-16 19:52
 **/

public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new Transcript();
        schoolReport.report();
        System.out.println("看到成绩单后老爸说:就这成绩还想让我签字？");
        System.out.println("......老爸开始找扫帚了");
    }
}
