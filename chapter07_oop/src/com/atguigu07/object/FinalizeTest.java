package com.atguigu07.object;

public class FinalizeTest {
    public static void main(String[] args) {

        Person p = new Person("p1", 16);
        System.out.println(p);
        // 将引用置空，等待被回收，但不知道啥时候回收
        p = null;
        System.gc(); //强制回收，这也需要时间
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("线程被中止");
        }
    }

}


class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 该方法会在对象被回收时调用，遗言
    // 该方法在jdk9被弃用
    // 因为该函数可能导致内部循环引用，导致该对象无法被回收
    @Override
    protected void finalize() throws Throwable {
        System.out.println("被回收了" + this);
    }
}
