package com.ghj.example02.test02;

/**
 * @program: 03_DecorativePattern
 * @description: 老爸查看成绩单
 * @author: 小江
 * @create: 2021-05-16 19:52
 **/

public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport = new ModifiedTranscript();
        schoolReport.report();
        System.out.println("看到成绩单后老爸说:还凑活");
        System.out.println("......老爸就签字了");
        schoolReport.sign("小江爸爸");

    }
}
