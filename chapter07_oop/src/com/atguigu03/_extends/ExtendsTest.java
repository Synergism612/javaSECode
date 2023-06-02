package com.atguigu03._extends;

public class ExtendsTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("tonny");
        person.eat();
        System.out.println(person);

        Student student = new Student();
        student.setName("tom");
        student.school = "****学校";
        student.eat();
        System.out.println(student);

        //获取父类
        System.out.println(person.getClass().getSuperclass());
    }
}
