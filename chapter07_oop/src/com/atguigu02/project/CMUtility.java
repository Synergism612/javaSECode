package com.atguigu02.project;

import java.util.Scanner;

public class CMUtility {

    private static final Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection() {
        char c;
        while (true) {
            String str = scanner.next();
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4' && c != '5') {
                System.out.println("选择错误，请重新输入");
            } else break;
        }
        return c;
    }

    public static char readConfirmSelect() {
        char c;
        while (true) {
            String str = scanner.next();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N')
                break;
            else
                System.out.println("选择错误，请重新输入");
        }
        return c;
    }

    public static Scanner scanner() {
        return scanner;
    }
}
