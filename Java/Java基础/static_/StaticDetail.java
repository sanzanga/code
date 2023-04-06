package com.static_;

/**
 * 1. 当我们需要让某个类的所有对象都共享一个对象变量时，就可以考虑使用类变量
 * 2. 类变量是类所有对象所共有的，而实例变量是每个对象独享的
 * 3. 访问方法：推荐：类名.类变量名
 * 4. 实例对象不能通过类名.类变量名来访问
 * 5. 类变量在加载的时候就初始化了，也就是说，即使没有创建对象，只要加载了类，就可以使用类变量
 * 6. 类变量的生命周期是随类的加载开始，随类的消亡而结束
 */

public class StaticDetail {
    public static void main(String[] args) {
        // 类变量是类所有对象所共有的，而实例变量是每个对象独享的
        int num1 = B.n2;
        // int num2 = B.n1;//error
        System.out.println(num1);

        // 类变量在加载的时候就初始化了，也就是说，即使没有创建对象，只要加载了类，就可以使用类变量
        System.out.println(C.name);
    }
}

class B {
    public int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String name = "jack";
}
