package com.atguigu04.override;

public class Student extends Person {

    String school;

    @Override
    public void eat() {
        System.out.print("学生吃饭---");
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "school='" + school + '\'' +
                '}';
    }

    @Override
    public Student info1() {
        return null;
    }
}
