package com.atguigu06.polymorphism;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Man m1 = new Man();

        //多态性：子类对象的多态性
        Person p2 = new Man();

        /*
        多态性的应用：虚拟方法调用
        编译时认为是父类
        执行时执行子类
        */
        p2.eat();
        p2.walk();

        //方法不满足多态性
        System.out.println(p2.id);
        /*
        堕胎的弊端
        内存中是否存在Man类中的id 1002 ?
        存在但是无法被调用到
         */
    }
}
