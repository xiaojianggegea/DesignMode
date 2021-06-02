package com.ghj.test02;

/**
 * @program: 08_TemplateMethodPattern
 * @description: 学生甲的试卷类
 * @author: 小江
 * @create: 2021-06-02 16:22
 **/

public class TestPaperA extends TestPaper {
    public void testQuestion1() {
        super.testQuestion1();
        System.out.println("答案:b");
    }

    public void testQuestion2() {
        super.testQuestion2();
        System.out.println("答案:a");
    }

    public void testQuestion3() {
        super.testQuestion3();
        System.out.println("答案:c");
    }
}
