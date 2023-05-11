# 数组重点记录

## 一、包目录

* `com.atguigu1.one` 一维数组
    * `com.atguigu1.one.exer1` 破解房东电话
    * `com.atguigu1.one.exer2` 输入数字输出星期几
    * `com.atguigu1.one.exer1` 最高分与分数挡位
* `com.atguigu2.two` 二维数组
    * `com.atguigu2.two.exer1` 二维数组求和
    * `com.atguigu2.two.exer2` 替换输出
* `com.atguigu3.common_algorithm` 数组常用操作
    * `com.atguigu3.common_algorithm.exer1` 最值、均值、求和
    * `com.atguigu3.common_algorithm.exer2` 评委打分
    * `com.atguigu3.common_algorithm.exer3` 杨辉三角
    * `com.atguigu3.common_algorithm.exer4` 螺旋数组
    * `com.atguigu3.common_algorithm.exer5` 数组反转
* `com.atguigu4.search_sort` 数组基础算法
    * `com.atguigu4.search_sort.exer1` 数组元素添加(扩容)与删除
    * `com.atguigu4.search_sort.exer2` 数组元素查找
    * `com.atguigu4.search_sort.exer3` 数组元素排序(冒泡和快速排序)

## 二、数组元素类型

* 基本数据类型
    * `byte\short\int\long`
    * `float\double`
    * `char\boolean`
* 引用数据类型
    * 类
    * 数组
    * 接口
    * 枚举 `jdk5`
    * 注解 `jdk5`
    * 记录 `jdk14`

## 三、数组特点

* 数组的元素在内存中是一次紧密排序的，有序的  
  意味着元素的`虚拟指针`是连续的
* 数组一旦初始化完成，长度就不可更改了  
  因为数组的创建会在内存中开辟一整块`连续的空间`

## 四、数组初始化值

|  类型  |   默认值    | 
|:----:|:--------:|
|  整型  |    0     |   
| 浮点型  |   0.0    |   
| 字符型  | '\u0000' |   
| 布尔型  |  false   |   
| 引用类型 |   null   |

## 五、内存中的数组

* 数组作为变量，会存放到`虚拟机栈`中
* 数组初始化后，作为一个new创建的对象，数组的元素存放到`堆内存`中

## 六、多维数组

* java底层机制上看，其实不存在多维数组  
  本质上是一维数组，只不过他的元素还是 数组

## 七、常用操作

### 1、特征值计算

* 平均值
* 最大值
* 最小值
* 总和

### 2、数组复制

### 3、数组反转

## 八、数组常用算法

### 1、数组元素

* 添加(扩容)
* 删除

### 2、数组元素查找

* 顺序查找
* 二分法查找

### 3、数组排序

* 冒泡排序
* 快速排序

## 九、工具类

数组工具类  
`java.util.Arrays`  
官网介绍  
`This class contains various methods for manipulating arrays (such as sorting and searching). This class also contains a static factory that allows arrays to be viewed as lists.`  