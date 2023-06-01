package com.atguigu05.method_more._3valuetransfer.exer;

public class ArrayExercise {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a, b);
        //需要在该方法执行后仅打印a=100,b=100
        System.out.println("a=" + a);
        System.out.println("b=" + b);
    }
    //无法改变a和b的值，所以我们只能用别的方法

    //打印后直接退出程序
    public static void method(int a, int b) {
        System.out.println("a=" + a * 10);
        System.out.println("b=" + b * 10);
        System.exit(0);
    }

    //也可以重写println函数，比这个麻烦
}
