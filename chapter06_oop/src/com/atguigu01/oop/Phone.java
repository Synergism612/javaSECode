package com.atguigu01.oop;

/**
 * 手机类
 *
 * @author Synergism
 */
public class Phone {

    String name; //品牌
    double price; //价格

    /**
     * @apiNote 打电话
     */
    public void call() {
        System.out.println("拨打电话");
    }

    /**
     * @apiNote 发短信
     */
    public void senMessage() {
        System.out.println("发短信");
    }

    /**
     * @apiNote 娱乐
     */
    public void play() {
        System.out.println("娱乐");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
