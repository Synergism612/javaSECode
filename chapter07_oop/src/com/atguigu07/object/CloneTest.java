package com.atguigu07.object;

public class CloneTest {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.name = "111";
        System.out.println(a1.name);
        try {
            Animal a2 = (Animal) a1.clone();
            System.out.println(a2.name);
        } catch (CloneNotSupportedException e) {
            System.out.println("无权clone");
        }
    }
}

class Animal implements Cloneable {

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
