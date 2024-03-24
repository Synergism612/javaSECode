package com.atguigu07.object.equals;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Objects;

public class UserTest {

    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);

        System.out.println(u1.equals(u2));

        // String、File、Date和包装类等都重写了equals
        String s1 = "111";
        String s2 = "111";
        System.out.println(s1.equals(s2));

        // Object.equals()函数会直接对比地址
        int[] a1 = new int[]{1, 1, 1};
        int[] a2 = new int[]{1, 1, 1};
        System.out.println(a1.equals(a2));
        // Arrays中有对比函数
        System.out.println(Arrays.equals(a1, a2));
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

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        return obj instanceof User user
//                && this.name.equals(user.name)
//                && this.age == user.age;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
