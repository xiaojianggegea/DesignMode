package com.ghj.example01.test03;

/**
 * @program: 04_AgencyModel
 * @description: 代理类
 * @author: 小江
 * @create: 2021-05-14 16:35
 **/

public class ProxyImpl implements GiveGift {
    PursuitImpl gg;
    public ProxyImpl(Mama mm)
    {
        gg = new PursuitImpl(mm);
    }

    @Override
    public void giveClothes() {
        gg.giveClothes();
    }

    @Override
    public void giveFlowers() {
        gg.giveFlowers();
    }

    @Override
    public void giveBag() {
        gg.giveBag();
    }
}
