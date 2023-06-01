package com.atguigu01._this.exer;

/**
 * 用户类
 */
public class Customer {
    private final String firstName;
    private final String lostName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lostName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLostName() {
        return lostName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lostName='" + lostName + '\'' +
                ", account=" + account +
                '}';
    }
}
