package com.atguigu03.field_method.method.exer1;

/**
 * 案例
 * 员工信息显示
 * 使用show()方法调用来显示
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id = 1001;
        emp1.name = "Tome";
        emp1.age = 24;
        emp1.salary = 7800;
        emp1.show();
    }
}
