package com.ghj.example02.test02;

/**
 * @program: 03_DecorativePattern
 * @description: 修饰成绩单类
 * @author: 小江
 * @create: 2021-05-16 19:59
 **/

public class ModifiedTranscript extends Transcript {
    //先汇报最高成绩
    public void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }
    //最后汇报在学校排名
    public  void reportSort(){
        System.out.println("我在学校排名38名......");
    }
    //汇报内容发生变化，需要重写父类
    @Override
    public void report() {
        this.reportHighScore();
        super.report();
        this.reportSort();
    }
}
