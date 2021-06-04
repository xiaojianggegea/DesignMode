package com.ghj.test03;

/**
 * @program: 08_TemplateMethodPattern
 * @description: 学生甲的试卷类
 * @author: 小江
 * @create: 2021-06-02 16:31
 **/

public class TestPaperA extends TestPaper {
    protected String answer1() {
        return "b";
    }

    protected String answer2() {
        return "c";
    }

    protected String answer3() {
        return "a";
    }
}
