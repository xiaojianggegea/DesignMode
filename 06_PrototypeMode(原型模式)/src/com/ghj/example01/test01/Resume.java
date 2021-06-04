package com.ghj.example01.test01;

/**
 * @program: 06_PrototypeMode
 * @description: 简历类
 * @author: 小江
 * @create: 2021-05-21 15:03
 **/

public class Resume {
    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public void setPersonalInfo(String sex, String age)
    {
        this.sex = sex;
        this.age = age;
    }


    public void setWorkExperience(String timeArea, String company)
    {
        this.timeArea = timeArea;
        this.company = company;
    }

    public Resume(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getTimeArea() {
        return timeArea;
    }

    public void setTimeArea(String timeArea) {
        this.timeArea = timeArea;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void display() {
        System.out.println(name + "		" + sex + "		" + age);
        System.out.println("工作经历：" + timeArea + "	" + company);
    }

}
