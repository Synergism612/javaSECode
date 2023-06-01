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


    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep(int hour) {
        System.out.println("睡" + hour + "个小时");
    }

    public String interests(String hobby) {
        String info = "我的爱好是：" + hobby;
        System.out.println(info);
        return info;
    }


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
