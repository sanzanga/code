package com.exercise;

/*
 * 通过继承实现员工工资打印功能
 * 父类：员工类
 * 子类：部门经理、普通员工类
 * 1. 部门经理工资=1000+单日工资*天数*等级（1.2）
 * 2. 普通员工工资=单日工资*天数*等级（1.0）
 * 3. 员工属性：姓名，单日工资，工作天数
 * 4. 员工方法（打印工资）
 * 5. 普通员工及部门经理都是员工类，需要重写打印工资方法
 * 6. 定义初始化普通员工类，调用打印工资方法输入工资，定义并初始化部门经理对象，调用打印工资方法输入工资
 */

public class exercise03 {
    public static void main(String[] args) {
        Worker worker = new Worker("zhangsan", 5000, 100);
        Manager manager = new Manager("lisi", 6000, 100);
        worker.printSalary();
        manager.printSalary();
    }
}

/*
 * 还可以添加一个等级的属性
 * 另外在经理类可以加一个奖金的属性
 */

// 员工类
class Employee {
    private String name;
    private double salary;
    private int days;
    public Employee(String name, double salary, int days) {
        this.name = name;
        this.salary = salary;
        this.days = days;
    }

    // 打印工资
    public void printSalary() {
        System.out.println(this.name + "的薪水为：" + this.salary * this.days);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    
}

class Worker extends Employee {

    public Worker(String name, double salary, int days) {
        super(name, salary, days);
    }
    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Manager extends Employee {

    public Manager(String name, double salary, int days) {
        super(name, salary, days);
    }
    
    @Override
    public void printSalary() {
        System.out.println(getName() + "的薪水为：" + getDays() * getSalary() * 1.2 + 100);
    }
}
