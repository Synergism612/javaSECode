package com.atguigu3.common_algorithm.exer4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 案例
 * 螺旋数组
 * 输入三，生成螺旋数组为
 * 1,2,3
 * 8,9,4
 * 7,6,5
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入螺旋数组的宽度");
        int N = scanner.nextInt();
        int[][] result = new int[N][N];
        int right = 1, down = 2, left = 3, up = 4;
        int d = right;
        int x = 0, y = 0;
        for (int step = 1; step <= N * N; step++) {
            result[x][y] = step;

            if (d == right) {
                if (y + 1 < N && result[x][y + 1] == 0) {
                    y++;
                } else {
                    x++;
                    d = down;
                    continue;
                }
            }

            if (d == down) {
                if (x + 1 < N && result[x + 1][y] == 0) x++;
                else {
                    y--;
                    d = left;
                    continue;
                }
            }

            if (d == left) {
                if (y - 1 >= 0 && result[x][y - 1] == 0) y--;
                else {
                    x--;
                    d = up;
                    continue;
                }
            }

            if (d == up) {
                if (x - 1 >= 0 && result[x - 1][y] == 0) x--;
                else {
                    y++;
                    d = right;
                    continue;
                }
            }
            System.out.println();
        }

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                String str = String.format("%2d ", result[i][j]);
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
