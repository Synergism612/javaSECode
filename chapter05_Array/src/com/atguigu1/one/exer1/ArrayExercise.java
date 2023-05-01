package com.atguigu1.one.exer1;

/**
 * 案例
 * '破解'房东电话
 * 已知arr与index两个数组'破解'电话
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = new int[]{8, 2, 1, 0, 3};
        int[] index = new int[]{2, 0, 3, 2, 4, 0, 1, 3, 2, 3, 3};

        StringBuilder tel = new StringBuilder();

        for (int value : index) {
            tel.append(arr[value]);
        }

        System.out.println("联系方式：" + tel);
    }
}
