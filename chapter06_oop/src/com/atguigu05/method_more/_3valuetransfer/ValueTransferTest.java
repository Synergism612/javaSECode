package com.atguigu05.method_more._3valuetransfer;

import java.util.Arrays;

public class ValueTransferTest {
    public static void main(String[] args) {
        //赋值
        //基本数据类型 值传递
        int m = 10;
        int n = m;
        System.out.println(m + "---" + n);
        m++;
        System.out.println(n);

        //引用数据类型 址传递
        int[] arr1 = new int[]{1, 2, 3, 4, 5, 6};
        int[] arr2 = arr1;
        arr2[0] = 10;
        System.out.println(Arrays.toString(arr1));

        Order order1 = new Order();
        order1.id = 1;
        Order order2 = order1;
        order2.id = 2;
        System.out.println(order1.id);

        //函数参数传递
        //基本数据类型 值传递
        int x = 10;
        method1(x);
        System.out.println(x);

        //引用数据类型 址传递
        Order order3 = new Order();
        order3.id = 3;
        method2(order3);
        System.out.println(order3.id);
    }

    public static void method1(int m) {
        m++;
    }

    public static void method2(Order order) {
        order.id = 10;
    }
}

class Order {
    int id;
}
