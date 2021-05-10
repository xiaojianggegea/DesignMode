package com.ghj.test02.ApparelImpl;

import com.ghj.test02.port.Apparel;

public class wearPlaidShirtImpl implements Apparel {
        @Override
        public void show() {
            System.out.print("格子衫 ");
        }
}
