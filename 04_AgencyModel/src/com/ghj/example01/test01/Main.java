package com.ghj.example01.test01;

/**
 * @program: 04_AgencyModel
 * @description: 客户端类
 * @author: 小江
 * @create: 2021-05-14 15:21
 **/

public class Main {
    public static void main(String[] args) {
        Mama schoolGirl = new Mama();
        schoolGirl.setName("妈妈");
        Pursuit pursuit = new Pursuit(schoolGirl);
        pursuit.giveClothes();
        pursuit.giveFlowers();
        pursuit.giveBag();
    }
}
