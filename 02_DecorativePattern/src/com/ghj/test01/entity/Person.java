package com.ghj.test01.entity;

public class Person {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void wearPlaidShirt(){
        System.out.print("格子衫 ");
    }

    public void wearLongJohns(){
        System.out.print("秋裤 ");
    }

    public void wearNike(){
        System.out.print("耐克 ");
    }

    public void hairStyle(){
        System.out.print("锡纸烫 ");
    }

    public void wearGlasses(){
        System.out.print("戴眼镜 ");
    }

    public void wearAutumnShoes(){
        System.out.print("秋鞋 ");
    }

    public void show(){
        System.out.println("装扮的"+name);
    }
}
