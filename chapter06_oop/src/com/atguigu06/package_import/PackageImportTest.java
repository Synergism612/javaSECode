package com.atguigu06.package_import;

import static java.lang.Math.PI;
import static java.lang.System.out;

public class PackageImportTest {
    public static void main(String[] args) {
        out.println("包名通常是公司域名的倒置");
        out.println("包名不要以java.**开头");

        out.println("import static 可以调用类中的静态字段");
        out.println(PI);
    }
}
