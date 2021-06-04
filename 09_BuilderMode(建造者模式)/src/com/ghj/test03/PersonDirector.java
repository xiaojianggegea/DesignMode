package com.ghj.test03;

/**
 * @program: 09_BuilderMode
 * @description: 指挥者类(关键)
 * @author: 小江
 * @create: 2021-06-04 15:06
 **/

public class PersonDirector {
    private PersonBuilder pb;

    public PersonDirector(PersonBuilder pb) {
        this.pb = pb;
    }

    public void createPerson() {
        pb.buildHead();
        pb.buildBody();
        pb.buildArmLeft();
        pb.buildArmRight();
        pb.buildLegLeft();
        pb.buildLegRight();
    }

}
