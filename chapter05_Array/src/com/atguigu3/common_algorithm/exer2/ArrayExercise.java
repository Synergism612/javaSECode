package com.atguigu3.common_algorithm.exer2;

/**
 * 案例
 * 打分机制
 * 去除最高最低分取平均值
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            //0-10分
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + "\t");
        }

        int sum = arr[0];
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        double avg = (sum - max - min) * 1.0 / (arr.length - 2);
        System.out.println("\n去除最高最低分取平均值为" + avg);
    }
}
