package com.ghj.example02.test02;

/**
 * @program: 07_AppearanceMode
 * @description: 现代化邮局（门面类）
 * @author: 小江
 * @create: 2021-06-02 14:40
 **/

public class ModenPostOffice {
    private ILetterProcess letterProcess = new ILetterProcessImpl();
    private Police police = new Police();
    public void sendLetter(String context, String address){
        //帮忙写信
        letterProcess.writeContext(context);
        //写好信封
        letterProcess.fillEnvelope(address);
        //信封过安检
        police.checkLetter(letterProcess);
        //把信放入信封中
        letterProcess.letterInotoEnvelope();
        //邮递信封
        letterProcess.sendLetter();
    }
}
