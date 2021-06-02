package com.ghj.example01.test01;

import com.ghj.example01.test01.method.*;

/**
 * @program: 07_AppearanceMode
 * @description: 客户端
 * @author: 小江
 * @create: 2021-05-28 14:56
 **/

public class Main {
    public static void main(String[] args) {
        Stock1 gu1 = new Stock1();
        Stock2 gu2 = new Stock2();
        Stock3 gu3 = new Stock3();
        NationalDebt1 nd1 = new NationalDebt1();
        Realty1 rt1 = new Realty1();

        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();

        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();

    }
}
