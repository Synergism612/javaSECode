package com.atguigu06.polymorphism.interview;

class Base {
    int count = 10;

    public void display() {
        System.out.println(this.count);
    }
}

class Sub extends Base{
    int count = 20;

    @Override
    public void display() {
        System.out.println(this.count);
    }
}

public class FieldMethodTest {
    public static void main(String[] args) {
        Sub s = new Sub();
        System.out.println(s.count);
        s.display();

        Base b = new Sub();
        System.out.println(b.count);
        b.display();

        Base b1 = new Base();
        System.out.println(b1.count);
        b1.display();
    }
}