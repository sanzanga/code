package com.static_;

public class VisitStatic {
    public static void main(String[] args) {
        /*
         * 定义语法：1. 访问修饰符 static 数据类型 变量名 ---- 推荐使用
         *          2. static 访问修饰符 数据类型 变量名
         * 
         * 访问类变量：1. 类名.类变量名 ---- 推荐使用
         *            2. 对象名.类变量名
         * 
         * 其访问修饰符的访问权限是和普通属性一样的
         * 类变量是随着类的加载而创建的，所以即使没有创建对象实例也可以访问
         */
        System.out.println(A.name);

        A a = new A();
        System.out.println(a.name);
    }
}

class A {
    // 类变量
    public static String name = "jack";
}
