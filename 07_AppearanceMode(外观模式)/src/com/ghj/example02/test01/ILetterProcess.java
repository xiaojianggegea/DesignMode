package com.ghj.example02.test01;

/**
 * @program: 07_AppearanceMode
 * @description: 写信过程接口
 * @author: 小江
 * @create: 2021-05-28 15:16
 **/
public interface ILetterProcess {
    //写内容
    public void writeContext(String context);
    //写信封
    public void fillEnvelope(String address);
    //把信放到信封里
    public void letterInotoEnvelope();
    //然后邮递
    public void sendLetter();
}
