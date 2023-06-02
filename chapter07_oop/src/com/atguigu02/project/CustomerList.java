package com.atguigu02.project;

public class CustomerList {
    private Customer[] customers;
    private int total;

    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * @param customer 客户对象
     * @return 成功返回true，数组已满返回false
     * @apiNote 添加客户对象
     */
    public boolean addCustomer(Customer customer) {
        if (total == customers.length) return false;
        customers[total++] = customer;
        return true;
    }

    /**
     * @param index    目标索引
     * @param customer 替换客户信息
     * @return 成功返回true，索引不合法返回false
     * @apiNote 替换指定索引的客户对象
     */
    public boolean replaceCustomer(int index, Customer customer) {
        if (index < 0 || index >= total) return false;
        customers[index] = customer;
        return true;
    }

    /**
     * @param index 目标索引
     * @return 成功返回true，索引不合法返回false
     * @apiNote 删除指定索引的客户对象
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) return false;
        customers[index] = null;
        while (index < total - 1) {
            customers[index] = customers[++index];
        }
        customers[--total] = null;
        return true;
    }

    /**
     * @return Customer[] 客户数组
     * @apiNote 返回记录的所有客户对象
     */
    public Customer[] getAllCustomers() {
        Customer[] copy = new Customer[total];
        System.arraycopy(customers, 0, copy, 0, copy.length);
        return copy;
    }

    /**
     * @param index 目标索引
     * @return 客户对象
     * @apiNote 获取指定的客户对象
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;
        return customers[index];
    }

    /**
     * @return total
     * @apiNote 获取客户总数
     */
    public int getTotal() {
        return total;
    }
}
