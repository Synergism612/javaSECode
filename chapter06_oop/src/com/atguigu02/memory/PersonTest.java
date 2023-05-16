package com.atguigu02.memory;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.name = "杰克";
        p1.age = 24;
        p1.gender = '男';
        System.out.println(p1);


        Person p2 = new Person();

        p2.name = "露丝";
        p2.age = 18;
        p2.gender = '女';
        System.out.println(p2);

        Person p3 = p1;
        p3.age = 28;
        System.out.println(p1);
        System.out.println(p3);
    }
}
