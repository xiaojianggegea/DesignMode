package com.ghj.test02.ApparelImpl;

import com.ghj.test02.port.Apparel;

public class hairStyleImpl implements Apparel {
    @Override
    public void show() {
        System.out.print("锡纸烫 ");
    }
}
