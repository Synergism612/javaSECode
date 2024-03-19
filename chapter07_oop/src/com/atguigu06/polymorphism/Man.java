package com.atguigu06.polymorphism;

public class Man extends Person {

    int id = 1002;

    boolean isSmoking;

    @Override
    public void eat() {
        System.out.println("男人吃肉长肌肉");
    }

    @Override
    public void walk() {
        System.out.println("男人走路");
    }

    public void earnMoney() {
        System.out.println("男人赚钱");
    }
}
