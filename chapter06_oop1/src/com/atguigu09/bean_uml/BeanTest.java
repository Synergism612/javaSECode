package com.atguigu09.bean_uml;

public class BeanTest {

    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1);

        User u2 = new User(2);
        System.out.println(u2);
    }
}

class User {
    private int age = 10;

    User() {
    }

    public User(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                '}';
    }
}
