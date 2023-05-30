package com.atguigu04.objarr.exer2;

/**
 * 实例：
 * 定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩score(int)。
 * 创建20个学生对象学号为1到20，年级和成绩都由随机数确定。
 * 问题一:打印出3年级(state值为3）的学生信息
 * 问题二:使用冒泡排序按学生成绩排序，并遍历所有学生信息
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Student[] students = new Student[20];
        StudentUtil util = new StudentUtil();
        util.fill(students);
        System.out.println("三年级的学生有：");
        util.printStudentsByState(students, 3);
        System.out.println("按成绩排序：");
        util.sortStudents(students);
        util.printStudents(students);
    }
}
