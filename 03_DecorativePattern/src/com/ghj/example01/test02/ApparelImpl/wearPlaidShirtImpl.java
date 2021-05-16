package com.ghj.example01.test02.ApparelImpl;

import com.ghj.example01.test02.port.Apparel;
/**
 * @program: 02_DecorativePattern
 * @description: 具体服饰类
 * @author: 小江
 * @create: 2021-05-12 13:39
 **/
public class wearPlaidShirtImpl implements Apparel {
        @Override
        public void show() {
            System.out.print("格子衫 ");
        }
}
