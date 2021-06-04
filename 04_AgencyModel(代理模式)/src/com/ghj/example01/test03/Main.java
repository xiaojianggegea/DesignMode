package com.ghj.example01.test03;

/**
 * @program: 04_AgencyModel
 * @description: 客户端类
 * @author: 小江
 * @create: 2021-05-14 15:35
 **/

public class Main {
    public static void main(String[] args) {
        Mama mama = new Mama();
        mama.setName("妈妈");
        ProxyImpl proxy = new ProxyImpl(mama);
        proxy.giveClothes();
        proxy.giveFlowers();
        proxy.giveBag();

    }
}
