package com.object_;

/*
 * 提高具有哈希结构的容器效率
 * 两个引用，如果指向的是同一个对象，则哈希值肯定是一样的
 * 两个引用，如果指向的是不同对象，则哈希值是不一样的
 * 哈希值主要根据地址号来的。但是不能完全将哈希值等价于地址
 * 后面在集合中hashCode 如果需要的话，也会重写
 */

public class HashCode_ {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();
        A a3 = a;

        System.out.println("a.hasnCode()=" + a.hashCode());
        System.out.println("a2.hasnCode()=" + a2.hashCode());
        System.out.println("a3.hasnCode()=" + a3.hashCode());
    }
}

class A {

}
