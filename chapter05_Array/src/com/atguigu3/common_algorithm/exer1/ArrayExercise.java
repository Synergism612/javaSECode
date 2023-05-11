package com.atguigu3.common_algorithm.exer1;

import java.util.Arrays;

/**
 * 案例
 * 数组常用计算
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //10到100
            arr[i] = (int) (Math.random() * 90) + 10;
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println("最大值为" + max(arr));
        System.out.println("最小值为" + min(arr));
        System.out.println("总和为" + sum(arr));
        System.out.println("平均值为" + avgValue(arr));
    }

    /**
     * @param arr 数组
     * @return 最大值
     * @apiNote 求最大值
     */
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }

    /**
     * @param arr 数组
     * @return 最小值
     * @apiNote 求最小值
     */
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) min = i;
        }
        return min;
    }

    /**
     * @param arr 数组
     * @return 总和
     * @apiNote 求和
     */
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    /**
     * @param arr 数组
     * @return 平均值
     * @apiNote 求平均值
     */
    public static double avgValue(int[] arr) {
        return sum(arr) * 1.0 / arr.length;
    }


}
