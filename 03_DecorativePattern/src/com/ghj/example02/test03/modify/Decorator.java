package com.ghj.example02.test03.modify;

import com.ghj.example02.test03.SchoolReport;

/**
 * @program: 03_DecorativePattern
 * @description: 修饰抽象类
 * @author: 小江
 * @create: 2021-05-16 20:13
 **/

public abstract class Decorator extends SchoolReport {
    private SchoolReport schoolReport;

    public Decorator(SchoolReport schoolReport) {
        this.schoolReport = schoolReport;
    }
    //看成绩单
    public void report(){
        this.schoolReport.report();
    }
    //看完签字
    public void sign(String name){
        this.schoolReport.sign(name);
    }
}
