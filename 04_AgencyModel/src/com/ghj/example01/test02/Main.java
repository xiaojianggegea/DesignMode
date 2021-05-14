package com.ghj.example01.test02;

/**
 * @program: 04_AgencyModel
 * @description: 客户端类
 * @author: 小江
 * @create: 2021-05-14 15:31
 **/

public class Main {
    public static void main(String[] args) {
        Mama schoolGirl = new Mama();
        schoolGirl.setName("鱼儿");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveClothes();
        proxy.giveFlowers();
        proxy.giveBag();
    }
}
