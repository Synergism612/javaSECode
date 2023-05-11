package com.atguigu3.common_algorithm.exer3;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 案例
 * 杨辉三角
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入杨辉三角的长度");
        int length = scanner.nextInt();
        int[][] triangle = new int[length][];
        for (int i = 0; i < triangle.length; i++) {
            triangle[i] = new int[i + 1];
            //赋予第一层或最左最右的值
            triangle[i][0] = triangle[i][i] = 1;
            for (int j = 1; j < triangle[i].length - 1; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
            System.out.println(Arrays.toString(triangle[i]));
        }
    }
}
