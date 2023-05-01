package com.atguigu1.one.exer3;

import java.util.Scanner;

/**
 * 案例
 * 键盘读入成绩，找出最高分
 * 每个分数与最高分比较得出等级
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入学生人数");
        int count = scanner.nextInt();
        double[] scores = new double[count];

        Double max = null;
        System.out.println("请分别输入成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scanner.nextDouble();
            if (max == null || scores[i] > max) max = scores[i];
        }
        System.out.println("最高分为：" + max);

        for (int i = 0; i < scores.length; i++) {
            char grade;
            if (scores[i] >= max - 10) {
                grade = 'A';
            } else if (scores[i] >= max - 20) {
                grade = 'B';
            } else if (scores[i] >= max - 30) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] +
                    " grade is " + grade);
        }

        scanner.close();
        System.out.println("结束");
    }
}
