package com.atguigu2.two.exer2;

import java.util.HashMap;
import java.util.Map;

/**
 * 案例
 * 替换输出
 * 其中"10"代表普通职员，"11"代表程序员，"12"代表设计师，"13"代表架构师。
 *
 * @author Synergism
 */
public class ArrayExercise {
    public static void main(String[] args) {
        Map<String, String> type = new HashMap<>() {{
            put("10", "普通员工");
            put("11", "程序员");
            put("12", "设计师");
            put("13", "架构师");
        }};
        String[][] employees = {
                {"员工类型", "编号", "姓名", "年龄", "薪资", "奖金", "股票"},
                {"10", "1", "段誉", "22", "3000"},
                {"13", "2", "令狐冲", "32", "18000", "15000", "2000"},
                {"11", "3", "任我行", "23", "7000"},
                {"11", "4", "张三丰", "24", "7300"},
                {"12", "5", "周芷若", "28", "10000", "5000"},
                {"11", "6", "赵敏", "22", "6800"},
                {"12", "7", "张无忌", "29", "10800", "5200"},
                {"13", "8", "韦小宝", "30", "19800", "15000", "2500"},
                {"12", "9", "杨过", "26", "9800", "5500"},
                {"11", "10", "小龙女", "21", "6600"},
                {"11", "11", "郭靖", "25", "7100"},
                {"12", "12", "黄蓉", "27", "9600", "4800"}
        };
        for (String[] employee : employees) {
            for (int i = 0; i < employee.length; i++) {
                if (i == 0) {
                    System.out.print(type.containsKey(employee[i]) ? type.get(employee[i]) : employee[i]);
                    System.out.print("\t\t");
                    continue;
                } else if (employee[i].length() <= 2) {
                    System.out.print(employee[i] + "\t\t");
                    continue;
                }
                System.out.print(employee[i] + "\t");
            }
            System.out.println();
        }
    }
}
