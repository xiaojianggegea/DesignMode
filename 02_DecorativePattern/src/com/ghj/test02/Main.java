package com.ghj.test02;

import com.ghj.test02.ApparelImpl.*;
import com.ghj.test02.entity.Person;
import com.ghj.test02.port.Apparel;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小江");
        System.out.println("装扮:");
        Apparel wps = new wearPlaidShirtImpl();
        Apparel wlj = new wearLongJohnsImpl();
        Apparel wn = new wearNikeImpl();
        wps.show();
        wlj.show();
        wn.show();
        person.show();

        System.out.println("长啥样:");
        Apparel hs = new hairStyleImpl();
        Apparel wg = new wearGlassesImpl();
        Apparel was = new wearAutumnShoesImpl();
        hs.show();
        wg.show();
        was.show();
    }
}
