package com.atguigu01._this.exer;

public class Test {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("权", "孙");
        bank.addCustomer("操", "曹");

        Customer customer = bank.getCustomer(1);
        customer.setAccount(new Account(2000));
        bank.getCustomer(1).getAccount().withdraw(50);

        System.out.println(customer);

    }
}
