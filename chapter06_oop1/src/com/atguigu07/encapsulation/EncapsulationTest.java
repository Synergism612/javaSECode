package com.atguigu07.encapsulation;

public class EncapsulationTest {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "金蟾";
        animal.legs = -4;
        animal.eat();
        System.out.println(animal);

        Animal1 animal1 = new Animal1();
        animal1.name = "金蟾";
        animal1.setLegs(4);
        animal1.eat();
        System.out.println(animal1);
    }

}

class Animal {
    String name;
    int legs;

    public void eat() {
        System.out.println("吃");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}

class Animal1 {
    String name;
    private int legs;

    public void setLegs(int n) {
        if (n > 0 && n % 2 == 0) legs = n;
        else System.out.println("属性非法");
    }

    public void eat() {
        System.out.println("吃");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", legs=" + legs +
                '}';
    }
}
