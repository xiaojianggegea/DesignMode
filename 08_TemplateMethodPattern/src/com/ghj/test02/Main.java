package com.ghj.test02;

/**
 * @program: 08_TemplateMethodPattern
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-02 16:24
 **/

public class Main {
    public static void main(String[] args) {
        System.out.println("学生甲抄的试卷：");
        TestPaperA studentA = new TestPaperA();
        studentA.testQuestion1();
        studentA.testQuestion2();
        studentA.testQuestion3();
        System.out.println("------------");
        System.out.println("学生乙抄的试卷：");
        TestPaperA studentB = new TestPaperA();
        studentB.testQuestion1();
        studentB.testQuestion2();
        studentB.testQuestion3();
    }
}
