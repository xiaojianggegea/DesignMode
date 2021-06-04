package com.ghj.test03;

/**
 * @program: 08_TemplateMethodPattern
 * @description: 学生乙的试卷类
 * @author: 小江
 * @create: 2021-06-02 16:32
 **/

public class TestPaperB extends TestPaper{
    protected String answer1()
    {
        return "a";
    }

    protected String answer2()
    {
        return "b";
    }

    protected String answer3()
    {
        return "c";
    }

}
