package com.atguigu01._this.exer;

/**
 * 账户类
 */
public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("存入" + amt);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("取出" + amt);
        } else
            System.out.println("余额不足");
    }

    @Override
    public String toString() {
        return String.valueOf(balance);
    }
}
