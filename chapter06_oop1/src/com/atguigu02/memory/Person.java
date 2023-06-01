package com.atguigu02.memory;

public class Person {
    String name; //姓名
    int age; //年龄
    char gender; //性别

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep(int hour) {
        System.out.println("睡" + hour + "个小时");
    }

    public void interests(String hobby) {
        System.out.println("我的爱好是：" + hobby);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
