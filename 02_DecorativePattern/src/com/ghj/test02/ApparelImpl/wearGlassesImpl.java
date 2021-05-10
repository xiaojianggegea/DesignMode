package com.ghj.test02.ApparelImpl;

import com.ghj.test02.port.Apparel;

public class wearGlassesImpl implements Apparel {
    @Override
    public void show() {
        System.out.print("戴眼镜 ");
    }
}
