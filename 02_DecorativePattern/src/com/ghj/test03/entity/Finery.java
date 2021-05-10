package com.ghj.test03.entity;

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
