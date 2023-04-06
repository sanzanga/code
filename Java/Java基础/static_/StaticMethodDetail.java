package com.static_;

/*
 * 1. 类方法和普通方法都是随着类的加载而加载，经结构信息存储到方法区：
 *        类方法中没有this的参数
 *        普通方法中隐含着this的参数
 * 2. 类方法可以通过类名和对象调用，但是普通方法只能通过对象来调用，不能用类名调用
 * 3. 类方法不允许使用和对象有关的关键字，比如super、this。普通方法可以使用
 * 4. 类方法中只能访问静态变量和静态方法
 * 5. 普通成员方法，既可以访问普通变量，也可以访问静态变量
 */

public class StaticMethodDetail {
    public static void main(String[] args) {
        // 类方法可以通过类名和对象调用，但是普通方法只能通过对象来调用，不能用类名调用
        D.hi();
        // 调用时，需要先创建对象
        // D.say();//error
        D d = new D();
        d.say();
    }
}

class D {
    private int n1 = 100;
    private static int n2 = 200;

    public void say() {

    }
    public static void hi() {
        // 类方法不允许使用和对象有关的关键字，比如super、this。普通方法可以使用
        // System.out.println(this.n1);//error
    }

    public static void hello() {
        // 类方法中只能访问静态变量和静态方法
        System.out.println(n2);
        System.out.println(D.n2);
        // System.out.println(n1);//error
        hi();//right
        // say();//error
    }

    public void ok() {
        // 普通成员方法，既可以访问普通变量，也可以访问静态变量
        System.out.println(n1);//ok
        System.out.println(n2);//ok
        say();//ok
        hello();//ok
    }

    // public D(int n1) {
    //     this.n1 = n1;
    // }
    public int getN1() {
        return n1;
    }
    public void setN1(int n1) {
        this.n1 = n1;
    }
    
}
