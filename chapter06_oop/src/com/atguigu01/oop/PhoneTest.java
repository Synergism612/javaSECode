package com.atguigu01.oop;

/**
 * 手机测试类
 *
 * @author Synergism
 */
public class PhoneTest {
    public static void main(String[] args) {
        //使用new创建对象
        Phone phone = new Phone();
        //使用.调用对象行为或状态
        phone.name = "我的手机";
        phone.price = 6999;
        System.out.println(phone);
        phone.call();
        phone.senMessage();
        phone.play();
    }
}
