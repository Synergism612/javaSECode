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
        Employee p1 = new Employee();
        p1.id = 1001;
        p1.name = "Tome";
        p1.age = 24;
        p1.salary = 7800;
        p1.eat();
        p1.sleep(8);
        p1.interests("编程");
        p1.show();
    }
}
