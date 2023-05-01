package com.atguigu1.one;

/**
 * 一维数组
 *
 * @author Synergism
 */
public class OneArrayTest {
    public static void main(String[] args) {
        System.out.println("\n1、数组初始化");
        // 声明
        double[] prices;
        String[] foods;
        // 静态初始化 数组变量的赋值与数组元素的赋值同时进行
        prices = new double[]{10.32, 43.22, 30.21};
        // 动态初始化 数组变量赋值，数组元素赋值之后进行
        foods = new String[4];
        //省略写法，类型推断
        int[] arr1 = {1, 2, 3, 4}; //不能用在声明和初始化分开的情况
        //错误1 多此一举
        //int[] arr2 = new int[2]{1,2};
        //错误2 类型不是构造函数
        //int[2] arr3 = new int[];

        System.out.println("\n2、数组调用");
        //索引从0开始，到数组长度-1结束
        System.out.println(prices[0]);
        //数组元素赋值
        foods[0] = "拌海蜇";
        foods[1] = "炒黄瓜";
        foods[2] = "玉兰片";
        //数组越界
        try {
            System.out.println(prices[3]);
            foods[4] = "酱茄子";
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("数组索引越界");
        }

        System.out.println("\n3、数组长度获取");
        System.out.println(foods.length);
        System.out.println(prices.length);

        System.out.println("\n4、遍历数组");
        // for i 循环
        for (int i = 0; i < foods.length; i++) {
            System.out.println(foods[i]);
        }
        // for each 循环
        for (String food : foods) {
            System.out.println(food);
        }

        System.out.println("\n5、数组默认的初始值");
        int[] ints = new int[1];
        System.out.println("整型数组默认值为" + ints[0]);
        double[] doubles = new double[1];
        System.out.println("浮点型数组默认值为" + doubles[0]);
        boolean[] booleans = new boolean[1];
        System.out.println("布尔型数组默认值为" + booleans[0]);
        char[] chars = new char[1];
        //字符型的默认值为ASK码0=>'\u0000'
        System.out.println("字符型数组默认值为" + chars[0]);
        Object[] objects = new Object[1];
        System.out.println("引用类型数组默认值为" + objects[0]);
    }
}
