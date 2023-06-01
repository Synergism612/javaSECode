package com.atguigu08.constructor;

public class ConstructorTest {
    public static void main(String[] args) {
        Person person1 = new Person("张三", 24);
        System.out.println(person1);
        Person person2 = new Person();
        System.out.println(person2);
    }
}

class Person {
    private String name;
    private int age;

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}