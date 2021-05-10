package com.ghj.test03.apparel;

import com.ghj.test03.entity.Finery;

public class hairStyle extends Finery {
    @Override
    public void show() {
        super.show();
        System.out.print("锡纸烫 ");
    }
}
