# 面向对象重点

## 一、包目录

* `com.atguigu01.oop`类与对象基本学习
* `com.atguigu02.memory`类与对象内存解析
* `com.atguigu03.field_method`类与对象的变量与方法

## 二、类与对象

### 1、类

* 构成
    * 成员变量 Field
    * 成员方法 Method
* 构造对象(类的实例化)  
  new会调用类的构造函数去构造一个对象  
  `Class object = new Class();`

### 2、对象

* 构成
    * 行为 behavior
    * 状态 state
    * 标识 identity
* 调用  
  `identity.behavior()`  
  `identity.state`

### 3、内存解析

* 对象作为方法变量，会存放到`栈`中
* 对象被new实例化后，对象的实体存放在`堆`中
* 类的模板信息则存放在`方法区`中