package com.atguigu07.object.toString;

import java.util.Date;
import java.util.Objects;

public class ToStringTest {

    public static void main(String[] args) {
        Object o = new Object();
        // 在println中String.valueOf(x)会调用toString()，故而是灰色
        // toString()默认返回getClass().getName() + "@" + Integer.toHexString(hashCode())
        System.out.println(o.toString());

        // 像Date这些类都重写了toString()
        Date date = new Date();
        System.out.println(date);

        User u = new User("张三",22);
        System.out.println(u);
    }
}
class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
