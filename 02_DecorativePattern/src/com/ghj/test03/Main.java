package com.ghj.test03;

import com.ghj.test03.apparel.*;
import com.ghj.test03.entity.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小江");

        System.out.print("装扮:");
        wearPlaidShirt wps = new wearPlaidShirt();
        wearLongJohns wlj = new wearLongJohns();
        wearNike wn = new wearNike();
        wps.decorate(person);
        wlj.decorate(wps);
        wn.decorate(wlj);
        wn.show();

        System.out.print("长啥样:");
        hairStyle hs = new hairStyle();
        wearGlasses wg = new wearGlasses();
        wearAutumnShoes was = new wearAutumnShoes();
        wg.decorate(hs);
        was.decorate(wg);
        was.show();
    }
}
