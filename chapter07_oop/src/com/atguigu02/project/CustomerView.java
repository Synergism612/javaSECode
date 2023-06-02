package com.atguigu02.project;

public class CustomerView {
    CustomerList customerList = new CustomerList(10);

    /**
     * @apiNote 进入主界面方法
     */
    public void enterMainMenu() {
        boolean flag = true;
        while (flag) {
            System.out.println("----------拼电商客户管理系统----------");
            System.out.println("1、添加客户");
            System.out.println("2、修改客户");
            System.out.println("3、删除客户");
            System.out.println("4、客户列表");
            System.out.println("5、退出");
            System.out.println("请选择(1-5)");
            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1' -> addNewCustomer();
                case '2' -> modifyCustomer();
                case '3' -> deleteCustomer();
                case '4' -> listAllCustomer();
                case '5' -> {
                    System.out.println("确定退出吗？(Y/N)");
                    if (CMUtility.readConfirmSelect() == 'Y')
                        flag = false;
                }
            }

        }
    }

    public void addNewCustomer() {
        System.out.println("姓名");
        String name = CMUtility.scanner().next();
        System.out.println("性别");
        char gender = CMUtility.scanner().next().charAt(0);
        System.out.println("年龄");
        int age = CMUtility.scanner().nextInt();
        System.out.println("电话");
        String phone = CMUtility.scanner().next();
        System.out.println("邮箱");
        String email = CMUtility.scanner().next();
        Customer customer = new Customer(name, gender, age, phone, email);
        if (customerList.addCustomer(customer))
            System.out.println("成功！");
        else
            System.out.println("失败");
    }

    public void modifyCustomer() {
        int index;
        Customer customer;
        while (true) {
            System.out.println("请选择编号(-1退出)");
            index = CMUtility.scanner().nextInt();
            if (index-- == -1) return;
            customer = customerList.getCustomer(index);
            if (customer == null)
                System.out.println("无法找到指定客户");
            else
                break;
        }
        System.out.println("姓名(" + customer.getName() + ")");
        String name = CMUtility.scanner().next();
        System.out.println("性别(" + customer.getGender() + ")");
        char gender = CMUtility.scanner().next().charAt(0);
        System.out.println("年龄(" + customer.getAge() + ")");
        int age = CMUtility.scanner().nextInt();
        System.out.println("电话(" + customer.getPhone() + ")");
        String phone = CMUtility.scanner().next();
        System.out.println("邮箱(" + customer.getEmail() + ")");
        String email = CMUtility.scanner().next();
        customer = new Customer(name, gender, age, phone, email);
        if (customerList.replaceCustomer(index, customer))
            System.out.println("成功！");
        else
            System.out.println("失败");
    }

    public void deleteCustomer() {
        int index;
        Customer customer;
        while (true) {
            System.out.println("请选择编号(-1退出)");
            index = CMUtility.scanner().nextInt();
            if (index-- == -1) return;
            customer = customerList.getCustomer(index);
            if (customer == null)
                System.out.println("无法找到指定客户");
            else
                break;
        }
        System.out.println("确定删除吗？(Y/N)");
        if (CMUtility.readConfirmSelect() == 'N') return;
        if (customerList.deleteCustomer(index))
            System.out.println("成功！");
        else
            System.out.println("失败");
    }

    public void listAllCustomer() {
        System.out.println("客户列表");
        Customer[] customers = customerList.getAllCustomers();
        if (customers.length == 0)
            System.out.println("没有客户");
        else
            for (Customer customer : customers) {
                System.out.println(customer);
            }
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }
}
