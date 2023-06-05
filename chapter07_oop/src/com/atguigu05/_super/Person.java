package com.atguigu05._super;

public class Person {
    private String name;

    int id = 100101;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("吃");
    }

    public void sleep() {
        System.out.println("睡");
    }

    public void doSport() {
        System.out.println("运动");
    }

    public Person() {
        System.out.println("构造person");
    }

    public Person(String name) {
        this.name = name;
    }
}
