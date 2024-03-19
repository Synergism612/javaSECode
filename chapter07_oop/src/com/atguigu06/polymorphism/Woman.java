package com.atguigu06.polymorphism;

public class Woman extends Person{

    boolean isBeauty;

    @Override
    public void eat() {
        System.out.println("女人少吃");
    }

    @Override
    public void walk() {
        System.out.println("女人走路");
    }

    public void goShopping() {
        System.out.println("女人购物");
    }
}
