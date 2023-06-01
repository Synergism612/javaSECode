package com.atguigu01._this.exer;

import java.util.Arrays;

/**
 * 银行类
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        this.customers = new Customer[10];
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        //扩容
        if (numberOfCustomer == customers.length) {
            Customer[] customers1 = new Customer[customers.length + 10];
            System.arraycopy(customers, 0, customers1, 0, customers.length);
            customers = customers1;
        }
        customers[numberOfCustomer++] = customer;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= numberOfCustomer) return null;
        return customers[index];
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
