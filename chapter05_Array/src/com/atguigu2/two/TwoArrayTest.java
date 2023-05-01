package com.atguigu2.two;

import java.util.Arrays;

/**
 * 二维数组
 *
 * @author Synergism
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        System.out.println("\n1、数组的声明与初始化");
        int[] arr1 = new int[]{1, 2, 3};
        //方式1:静态初始化:数组变量的赋值和数组元素的赋值同时进行
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        //方式2:动态初始化:数组变量的赋值和数组元素的赋值分开进行
        String[][] arr3 = new String[3][4];
        double[][] arr4 = new double[2][];
        //其它正确写法
        int arr5[][] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[] arr6[] = new int[][]{{1, 2, 33}, {4, 5}, {6, 7, 8, 9}};
        int arr7[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 91}}; //类型推断

        System.out.println("\n2、数组元素调用");
        System.out.println("arr2[0]输出的是元素类型与元素地址=>" + arr2[0]);
        arr3[0][1] = "Tom";
        System.out.println("arr3[0][1]=" + arr3[0][1]);
        System.out.println("arr3[0]=>" + arr3[0]);
        System.out.println("arr4初始化时只给了一维长度所以输出是null,因为数组也是类型,默认值是null");
        System.out.println("arr4[0]=>" + arr4[0]);

        System.out.println("\n3、数组元素默认值");
        System.out.println("在2中已经可以说明一些东西了");
        System.out.println("外层指向内层地址,内层与一维数组默认值一致");
        System.out.println("arr3[0]=>" + arr3[0]);
        System.out.println("arr3[0][0]=" + arr3[0][0]);
        System.out.println("外层默认值为null");
        System.out.println("arr4[0]=>" + arr4[0]);
        try {
            System.out.println("arr4[0][0]=" + arr4[0][0]);
        } catch (NullPointerException e) {
            System.out.println("空指针异常,arr4[0]是null,null[0]必定报空指针异常");
        }
    }
}