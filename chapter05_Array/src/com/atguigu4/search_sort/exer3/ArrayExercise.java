package com.atguigu4.search_sort.exer3;

import java.util.Arrays;

/**
 * 案例
 * 数组元素排序
 * 一般的，排序的目的是快速查找
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
//        bubbleSort(arr);
//        System.out.println(Arrays.toString(arr));
        quicksort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * @param arr 数组
     * @apiNote 冒泡排序
     * O(n<sup>2</sup>)
     */
    public static void bubbleSort(int[] arr) {
        System.out.println("冒泡排序");
        System.out.println(Arrays.toString(arr));
        int temp; //交换中间值
        boolean flag = true; //没有交换过吗？
        for (int i = 0; i < arr.length - 1; i++) {
            //一轮找出本轮最大值，并排位到本轮最后
            //故而每轮都可以排除上一轮的最大值也就是arr.length - 1 - j
            for (int j = 0; j < arr.length - 1 - j; j++) {
                if (arr[j] > arr[j + 1]) {
                    //交换
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false; //交换过
                }
            }
            //节省多余的循环
            if (flag) break;
        }
    }

    /**
     * @param data  数组
     * @param start 开始位置
     * @param end   结束位置
     * @apiNote 快速排序
     * O(nlog<sub>2</sub> N)
     */
    public static void quicksort(int[] data, int start, int end) {
        if (start < end) {
            int base = data[start];
            int low = start;
            int high = end + 1;
            while (true) {
                while (low < end && data[++low] - base <= 0) ;
                while (low < end && data[--high] - base >= 0) ;
                if (low < high) {
                    //交换data第low与high位
                    swap(data, low, high);
                } else {
                    break;
                }
            }
            //交换data第start与high位
            swap(data, start, high);
            //递归调用
            quicksort(data, start, high - 1);
            quicksort(data, high + 1, end);
        }
    }

    /**
     * @param data 数组
     * @param i    a位置
     * @param j    b位置
     * @apiNote 交换位置
     */
    private static void swap(int[] data, int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

}
