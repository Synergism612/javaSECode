package com.atguigu06.polymorphism;

public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        Man m1 = (Man) p1;

        m1.earnMoney();

        //对象地址一致
        System.out.println(p1 == m1);

        //向下转型会出现的问题
        Person p2 = new Woman();
        try {
            Man m2 = (Man) p2;
            m2.earnMoney();
        } catch (ClassCastException e) {
            System.out.println("类型转换异常");
        }

        //向下转型前先判断是否为该类的实例
        if (p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.earnMoney();
        }

        if (p2 instanceof Woman){
            Woman w1 = (Woman) p2;
            w1.goShopping();
        }
    }
}
