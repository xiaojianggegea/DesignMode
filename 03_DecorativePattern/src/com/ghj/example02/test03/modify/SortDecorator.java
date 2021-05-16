package com.ghj.example02.test03.modify;

import com.ghj.example02.test03.SchoolReport;

/**
 * @program: 03_DecorativePattern
 * @description: 排名情况修饰类
 * @author: 小江
 * @create: 2021-05-16 20:21
 **/

public class SortDecorator extends Decorator {
    public SortDecorator(SchoolReport schoolReport) {
        super(schoolReport);
    }
    private void reportSort(){
        System.out.println("我在学校排名38名......");
    }
    @Override
    public void report(){
        super.report();
        this.reportSort();
    }
}
