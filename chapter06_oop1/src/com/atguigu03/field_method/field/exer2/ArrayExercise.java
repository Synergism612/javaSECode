package com.atguigu03.field_method.field.exer2;

/**
 * 案例
 * 员工信息显示
 * 加入生日时间类
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1001;
        emp1.name = "杰克";
        emp1.age = 24;
        emp1.salary = 8900;
        MyDate birthday = new MyDate();
        birthday.year = 1998;
        birthday.month = 2;
        birthday.day = 28;
        emp1.birthday = birthday;
        System.out.println(emp1);
    }
}
