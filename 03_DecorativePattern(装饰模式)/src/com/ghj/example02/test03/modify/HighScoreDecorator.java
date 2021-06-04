package com.ghj.example02.test03.modify;

import com.ghj.example02.test03.SchoolReport;

/**
 * @program: 03_DecorativePattern
 * @description: 最高成绩修饰类
 * @author: 小江
 * @create: 2021-05-16 20:18
 **/

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    public void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //先让老爸看最高成绩
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}
