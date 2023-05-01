package com.atguigu1.one.exer2;

import java.util.Scanner;

/**
 * 案例
 * 键盘输入1-7，输出星期几
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        String[] week = new String[]{"Monday", "Tuesday ", "Wednesday ", "Thursday ", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入1-7的数字");
        int day = scanner.nextInt();

        if (day < 1 || day > 7) {
            System.out.println("输入有误！");
        }
        System.out.println(week[day - 1]);

        scanner.close();
        System.out.println("结束");
    }
}
