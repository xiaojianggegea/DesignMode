package com.ghj.example01.test03.entity;
/**
 * @program: 02_DecorativePattern
 * @description: 服饰类
 * @author: 小江
 * @create: 2021-05-12 13:46
 **/
public class Finery extends Person{
    protected Person person;
    public void decorate(Person person){
        this.person = person;
    }

    public void show() {
        if(null != person){
            person.show();
        }
    }
}
