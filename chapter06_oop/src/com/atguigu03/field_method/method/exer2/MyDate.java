package com.atguigu03.field_method.method.exer2;

public class MyDate {
    int year; //年
    int month; //月
    int day; //日

    @Override
    public String toString() {
        return year + "-" +
                month + "-" +
                day;
    }
}
