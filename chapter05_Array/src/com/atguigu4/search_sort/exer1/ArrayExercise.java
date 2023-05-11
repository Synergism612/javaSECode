package com.atguigu4.search_sort.exer1;

import java.util.Arrays;

/**
 * 案例
 * 数组元素添加与删除
 * 扩容一倍，并写入10、20、30
 * 删除索引为4的元素
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        arr = add(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(deleteOne(arr)));
        System.out.println(Arrays.toString(deleteTwo(arr)));

    }

    /**
     * @param arr 数组
     * @return 结果数组
     * @apiNote 扩容一倍，并写入10、20、30
     */
    public static int[] add(int[] arr) {
        //左移一位相当于乘2
        int[] newArr = new int[arr.length << 1];
        /*
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        */
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        return newArr;
    }

    /**
     * @param arr 目标数组
     * @apiNote 删除索引为4的元素，不改变数组长度
     */
    public static int[] deleteOne(int[] arr) {
        int deleteIndex = 4;
        for (int i = deleteIndex; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = 0;
        return arr;
    }

    /**
     * @param arr 目标数组
     * @return 结果数组
     * @apiNote 删除索引为4的元素，改变数组长度
     */
    public static int[] deleteTwo(int[] arr) {
        int deleteIndex = 4;
        int[] newArr = new int[arr.length - 1];
        for (int m = 0, n = 0; m < newArr.length; n++, m++) {
            if (n == deleteIndex) {
                n++;
            }
            newArr[m] = arr[n];
        }
        return newArr;
    }
}
