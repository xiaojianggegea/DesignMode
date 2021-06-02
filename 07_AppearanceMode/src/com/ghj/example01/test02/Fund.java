package com.ghj.example01.test02;

import com.ghj.example01.test01.method.*;

/**
 * @program: 07_AppearanceMode
 * @description: 基金类（外观类）
 * @author: 小江
 * @create: 2021-05-28 14:42
 **/

public class Fund {
    Stock1 gu1;
    Stock2 gu2;
    Stock3 gu3;
    NationalDebt1 nd1;
    Realty1 rt1;

    public Fund() {
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();
        nd1 = new NationalDebt1();
        rt1 = new Realty1();
    }

    public void buyFund() {
        gu1.buy();
        gu2.buy();
        gu3.buy();
        nd1.buy();
        rt1.buy();
    }

    public void sellFund() {
        gu1.sell();
        gu2.sell();
        gu3.sell();
        nd1.sell();
        rt1.sell();
    }

}
