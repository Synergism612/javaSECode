package com.atguigu04.objarr.exer1;

/**
 * 学生类
 *
 * @author Synergism
 */
public class Student {
    int number; //学号
    int state; //年纪
    int score; //成绩

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
