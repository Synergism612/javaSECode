package com.atguigu3.common_algorithm.exer5;

import java.util.Arrays;

/**
 * 案例
 * 数组反转
 * 扩展应用
 * 判断数组是否对称
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
