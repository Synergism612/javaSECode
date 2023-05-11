package com.atguigu4.search_sort.exer2;

import java.util.Arrays;

/**
 * 案例
 * 数组元素查找
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int target = 76;
        linearQuery(arr, target);
        //注意，二分法只能对有序数组使用，已经是有序数组就不需要排序了
        Arrays.sort(arr);
        binaryQuery(arr, target);
    }

    /**
     * @param arr    数组
     * @param target 目标
     * @apiNote 线性查找
     */
    public static void linearQuery(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("找到了" + target + "索引为" + i);
                break;
            }
            if (i == arr.length - 1) {
                System.out.println("未找到" + target);
            }
        }
    }

    /**
     * @param arr    数组
     * @param target 目标
     * @apiNote 二分法查找
     */
    public static void binaryQuery(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length - 1;
        while (true) {
            int middle = (left + right) / 2;
            if (arr[middle] == target) {
                System.out.println("找到了" + target + "索引为" + middle);
                break;
            }
            if (arr[middle] > target) {
                right = middle - 1;
            }
            if (arr[middle] < target) {
                left = middle + 1;
            }
            if (left > right) {
                System.out.println("未找到" + target);
                break;
            }
        }
    }
}
