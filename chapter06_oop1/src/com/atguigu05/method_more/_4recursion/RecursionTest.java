package com.atguigu05.method_more._4recursion;

public class RecursionTest {
    public static void main(String[] args) {
        //递归求和
        System.out.println(getSum(100));
        //斐波那契数列
        System.out.println(f(4));
    }

    public static int getSum(int number) {
        if (number == 1) return 1;
        else return getSum(number - 1) + number;
    }

    public static int f(int n) {
        if (n == 1) return 1;
        else if (n == 2) return 2;
        else return f(n - 1) + f(n - 2);
    }

}
