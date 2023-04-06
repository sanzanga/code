package com.static_;

public class StaticMethod {
    public static void main(String[] args) {
        Student student = new Student("tom");
        /*
         * 静态方法两种调用形式：
         * 1. 类名.方法名
         * 2. 对象名.方法名
         */

         student.payFee(100);

        Student student2 = new Student("jack");
        student2.payFee(200);
        // 上面的两次交钱都累积到了类中的double里面去了
        // 如果打印就是300
        System.out.println(Student.getFee());
        Student.showFee();
    }
}

class Student {
    private String name;
    // 定义一个静态变量，来累积学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }
    public static void payFee(double fee) {
        Student.fee += fee;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // 当方法被static修饰，就是静态方法
    // 静态方法就可以访问静态属性
    public static void showFee() {
        System.out.println("总学费有：" + Student.fee);
    }
    // 因为fee是静态变量，想要使用类变量，就要把方法也设置为静态的
    public static double getFee() {
        return fee;
    }
    public static void setFee(double fee) {
        Student.fee = fee;
    }
}
