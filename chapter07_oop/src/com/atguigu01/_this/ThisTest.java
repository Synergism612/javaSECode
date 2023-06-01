package com.atguigu01._this;

public class ThisTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(10);
        System.out.println(person);

        Person person1 = new Person("tom", 23);
        System.out.println(person1);
    }
}

class Person {
    String name;
    int age;

    public Person() {
        System.out.println("构造！！");
    }

    public Person(String name) {
        this();
        this.name = name;
    }

    public Person(String name, int age) {
        this(name);
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println("吃");
        sleep();
    }

    public void sleep() {
        System.out.println("睡");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
