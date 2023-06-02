package com.atguigu03._extends;

public class Student extends Person {

    String school;

    @Override
    public String toString() {
        return super.toString() + "Student{" +
                "school='" + school + '\'' +
                '}';
    }
}
