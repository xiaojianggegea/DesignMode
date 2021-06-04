package com.ghj.example01.test01;

/**
 * @program: 04_AgencyModel
 * @description: 儿子类
 * @author: 小江
 * @create: 2021-05-14 15:21
 **/

public class Pursuit {
    Mama mm;

    public Pursuit(Mama mm) {
        this.mm = mm;
    }

    public void giveClothes() {
        System.out.println(mm.name + " 送你衣服");
    }

    public void giveFlowers() {
        System.out.println(mm.name + " 送你鲜花");
    }

    public void giveBag() {
        System.out.println(mm.name + " 送你包包");
    }
}
