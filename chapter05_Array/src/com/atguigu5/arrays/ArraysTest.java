package com.atguigu5.arrays;

import java.util.Arrays;

/**
 * 数组工具类
 *
 * @author Synergism
 */
public class ArraysTest {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {1, 2, 3, 5, 4};
        int index;

        System.out.println("\n1、equals() 比较数组依次相等");
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("依次相等");
        } else {
            System.out.println("不依次相等");
        }
        if (Arrays.equals(arr1, arr3)) {
            System.out.println("依次相等");
        } else {
            System.out.println("不依次相等");
        }

        System.out.println("\n2、toString() 函数");
        System.out.println(Arrays.toString(arr1));

        System.out.println("\n3、fill() 填充函数");
        Arrays.fill(arr3, 10);
        System.out.println(Arrays.toString(arr3));

        System.out.println("\n4、sort() 排序函数");
        int[] sortArr = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        System.out.println("排序前" + Arrays.toString(sortArr));
        Arrays.sort(sortArr);
        System.out.println("排序后" + Arrays.toString(sortArr));

        System.out.println("\n5、binarySearch() 有序！有序！有序数组二分查找函数");
        index = Arrays.binarySearch(arr2, 5);
        //该函数会返回-n 总之负数就是没找到
        if (index > 0)
            System.out.println("位置为" + index);
        else
            System.out.println("没找到");

    }
}
