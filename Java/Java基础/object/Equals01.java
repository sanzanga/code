package com.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        //都指向同一块空间，地址相同，就为true
        System.out.println(a == c);//true
        System.out.println(b == c);//true

        //是Object类中的方法，只能判断引用类型
        // Object的equals 方法默认是比较两个对象地址是否相同
        // 也就是判断两个对象是不是同一个对象
        System.out.println(a.equals(b));//true

        // String类的equals方法：把Object的equals方法重写了
        // 变成比较两个字符串值是否相等
        // "hello".equals("abs");
        System.out.println("====================");
        String str1 = new String("hello");
        String string = new String("hello");
        System.out.println(str1 == string);
        System.out.println(str1.equals(string));
    }
}

class A {

}
