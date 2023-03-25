package com.object_;

public class toString_ {
    public static void main(String[] args) {
        // toString()方法返回类名+哈希码值的十六进制
        Monster monster = new Monster("小妖怪", "巡山的", 1000);
        System.out.println(monster.toString());
        // 重写toString方法，打印对象或者拼接对象时，都会自动调用该对象的toString形式

        // 当直接输出一个对象时，toString方法会被默认的调用
        System.out.println(monster);
    }
}

class Monster {
    private String name;
    private String job;
    private double salary;
    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // 重写toString方法，输出对象的属性
    // alt + insert快捷键
    @Override
    public String toString() {
        return "Monster [name=" + name + ", job=" + job + ", salary=" + salary + "]";
    }
}
