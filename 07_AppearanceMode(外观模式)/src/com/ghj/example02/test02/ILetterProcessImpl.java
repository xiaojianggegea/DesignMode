package com.ghj.example02.test02;

/**
 * @program: 07_AppearanceMode
 * @description: 写信过程实现
 * @author: 小江
 * @create: 2021-05-28 15:20
 **/

public class ILetterProcessImpl implements ILetterProcess {
    @Override
    public void writeContext(String context) {
        System.out.println("填写信的内容...." +context);
    }

    @Override
    public void fillEnvelope(String address) {
        System.out.println("填写收件人地址及联系方式......");
    }

    @Override
    public void letterInotoEnvelope() {
        System.out.println("把信放到信封中......");
    }

    @Override
    public void sendLetter() {
        System.out.println("邮递信件......");
    }
}
