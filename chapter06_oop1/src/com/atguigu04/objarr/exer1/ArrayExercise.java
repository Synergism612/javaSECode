package com.atguigu04.objarr.exer1;

import java.util.Arrays;

/**
 * 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象学号为1到20，年级和成绩都由随机数确定。
 * 问题一:打印出3年级(state值为3）的学生信息
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6) + 1;
            students[i].score = (int) (Math.random() * 101);
        }
        System.out.println("三年级的学生有：");
        for (Student student : students) {
            if (student.state == 3) System.out.println(student);
        }
        System.out.println("按成绩排序：");
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = 0; j < students.length - 1; j++) {
                if (students[j].score < students[j + 1].score) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
