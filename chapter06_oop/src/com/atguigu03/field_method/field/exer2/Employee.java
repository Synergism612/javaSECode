package com.atguigu03.field_method.field.exer2;

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
    MyDate birthday; //生日

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday.toString() +
                '}';
    }
}
