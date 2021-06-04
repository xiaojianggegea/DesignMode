package com.ghj.example01.test03;

/**
 * @program: 04_AgencyModel
 * @description: 儿子类
 * @author: 小江
 * @create: 2021-05-14 16:20
 **/

public class PursuitImpl implements GiveGift {
    Mama mm;
    public PursuitImpl(Mama mm)
    {
        this.mm = mm;
    }

    @Override
    public void giveClothes() {
        System.out.println(mm.name + " 送你衣服");
    }

    @Override
    public void giveFlowers() {
        System.out.println(mm.name + " 送你鲜花");
    }

    @Override
    public void giveBag() {
        System.out.println(mm.name + " 送你包包");
    }
}
