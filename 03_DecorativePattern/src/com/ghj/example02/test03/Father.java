package com.ghj.example02.test03;

import com.ghj.example02.test03.modify.HighScoreDecorator;
import com.ghj.example02.test03.modify.SortDecorator;

/**
 * @program: 03_DecorativePattern
 * @description: 老爸查看成绩单
 * @author: 小江
 * @create: 2021-05-16 19:52
 **/

public class Father {
    public static void main(String[] args) {
        SchoolReport schoolReport;
        //原来成绩单
        schoolReport = new Transcript();
        //加最高分修饰
        schoolReport = new HighScoreDecorator(schoolReport);
        //加排名说明
        schoolReport = new SortDecorator(schoolReport);
        //修饰完在让老爸看
        schoolReport.report();
        //签名
        System.out.println("看到成绩单后老爸开心的说:考的不错！");
        System.out.println("......老爸就签字了");
        schoolReport.sign("小江爸爸");

    }
}
