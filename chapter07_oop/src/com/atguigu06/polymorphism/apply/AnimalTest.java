package com.atguigu06.polymorphism.apply;

public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Animal());
        test.adopt(new Dog());
        test.adopt(new Cat());
    }
    public void adopt(Animal animal){
        animal.eat();
        animal.jump();
        System.out.println("------------------");
    }
}

class Animal{
    public void eat(){
        System.out.println("动物吃");
    }
    public void jump(){
        System.out.println("动物跳");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("狗吃");
    }
    @Override
    public void jump(){
        System.out.println("狗跳");
    }
    public void watchDoor(){
        System.out.println("狗看门");
    }

}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("猫吃");
    }
    @Override
    public void jump(){
        System.out.println("猫跳");
    }
    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}