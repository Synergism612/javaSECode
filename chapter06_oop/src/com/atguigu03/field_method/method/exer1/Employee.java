package com.atguigu03.field_method.method.exer1;

/**
 * 员工类
 *
 * @author Synergism
 */
public class Employee {
    int id; //编号
    String name; //姓名
    int age; //年龄
    double salary; //薪资

    public void show() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
