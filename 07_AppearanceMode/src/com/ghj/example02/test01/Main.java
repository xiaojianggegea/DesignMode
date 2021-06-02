package com.ghj.example02.test01;

/**
 * @program: 07_AppearanceMode
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-02 14:35
 **/

public class Main {
    public static void main(String[] args) {
        ILetterProcess iLetterProcess = new ILetterProcessImpl();
        //开始写信
        iLetterProcess.writeContext("亲爱的小江你好!......");
        //写信封
        iLetterProcess.fillEnvelope("甘肃武威凉州区");
        //把信放到信封中
        iLetterProcess.letterInotoEnvelope();
        //投递
        iLetterProcess.sendLetter();
    }
}
