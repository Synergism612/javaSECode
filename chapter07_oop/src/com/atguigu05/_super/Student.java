package com.atguigu05._super;

public class Student extends Person {

    String school;

    int id = 32;

    @Override
    public void eat() {
        System.out.println("学生吃饭---");
    }

    @Override
    public void sleep() {
        System.out.println("学生睡觉---");
    }

    public void show() {
        super.eat();
    }

    public void show1() {
        doSport();
        this.doSport();
        super.doSport();
    }

    public void show2() {
        System.out.println(id);
        System.out.println(super.id);
    }

    public Student() {
    }

    public Student(String name, String school) {
        super(name);
        this.school = school;
    }

    public Student(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                ", school='" + school + '\'' +
                ", id=" + id +
                ", id=" + id +
                '}';
    }
}
