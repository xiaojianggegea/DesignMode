package com.ghj.example02.test02;

/**
 * @program: 07_AppearanceMode
 * @description: 客户端
 * @author: 小江
 * @create: 2021-06-02 14:39
 **/

public class Main {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String context = "亲爱的小江你好!......";
        String address = "甘肃武威凉州区";
        modenPostOffice.sendLetter(context,address);
    }
}
