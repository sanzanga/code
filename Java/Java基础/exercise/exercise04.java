package com.exercise;

/*
 * 设计一个员工类。子类：工人类（Worker)，农民类（Peasant），教师类（Teacher）
 * 科学家类（Scientist），服务生类（Waiter）
 * 1、其中工人、农民、服务生只有基本工资
 * 2、教师除了基本工资外，还有课酬（元/天）
 * 3、科学家除基本工资外，还有年终奖
 * 4、编写一个测试类，将各种类型的员工的全年工资打印出来
 */

public class exercise04 {
    public static void main(String[] args) {
        Worker_ worker_ = new Worker_("zhangsan", 100000);
        worker_.printSalary();
        Peasant peasant = new Peasant("lisi", 150000);
        peasant.printSalary();
        Waiter waiter = new Waiter("wangwu", 140000);
        waiter.printSalary();
        Teacher_ teacher = new Teacher_("zhaoliu", 160000, 50, 100);
        teacher.printSalary();
        Scientist scientist = new Scientist("tom", 200000, 100000);
        scientist.printSalary();
    }
}

// 员工类
class Employee_ {
    private String name;
    private double salary;//基本工资
    public Employee_(String name, double salary) {
        this.name = name;
        this.salary = salary;
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
    // 打印工资
    public void printSalary() {
        System.out.println(this.name + "工资为：" + this.salary);
    }
}

class Worker_ extends Employee_ {

    public Worker_(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Peasant extends Employee_ {

    public Peasant(String name, double salary) {
        super(name, salary);
    }
    
    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Waiter extends Employee_ {

    public Waiter(String name, double salary) {
        super(name, salary);
    }
    @Override
    public void printSalary() {
        super.printSalary();
    }
}

class Teacher_ extends Employee_ {
    private int days;
    private double daySal;
    public Teacher_(String name, double salary, int days, double daySal) {
        super(name, salary);
        this.days = days;
        this.daySal = daySal;
    }
    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
    public double getDaySal() {
        return daySal;
    }
    public void setDaySal(double daySal) {
        this.daySal = daySal;
    }
    
    @Override
    public void printSalary() {
        System.out.println(this.getName() + "工资为：" + (getSalary() + (this.days * this.daySal)));
    }
}


class Scientist extends Employee_ {
    private double bonus;

    public Scientist(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    @Override
    public void printSalary() {
        System.out.println(this.getName() + "工资为：" + (getSalary() + this.bonus));
    }
}
