package com.atguigu05._super;

public class SuperTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        s1.show();
        s1.show1();
        s1.show2();
        Student s2 = new Student("tom", "school");
        System.out.println(s2);
        Student s3 = new Student("school");
        System.out.println(s3);
    }
}
