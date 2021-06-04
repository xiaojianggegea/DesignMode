package com.ghj.test03;

import java.awt.*;

/**
 * @program: 09_BuilderMode
 * @description: 画人抽象类
 * @author: 小江
 * @create: 2021-06-04 14:57
 **/

public abstract class PersonBuilder {
    protected Graphics g;

    public PersonBuilder(Graphics g)
    {
        this.g = g;
    }

    public abstract void buildHead();

    public abstract void buildBody();

    public abstract void buildArmLeft();

    public abstract void buildArmRight();

    public abstract void buildLegLeft();

    public abstract void buildLegRight();

}
