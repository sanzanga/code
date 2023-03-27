package com.exercise;

/*
 * 编写老师类：
 * 1. 要求属性“姓名name”、“年龄age”、“职称post”、“基本工资salary”
 * 2. 编写业务方法，introduce（），实现输出一个教师的信息
 * 3. 编写教师类的三个子类，教授类（Professor）、副教授类、讲师类。
 * 工资级别分别为：教授为1.3，副教授为1.2，讲师类1.1，在三个子类里面都重写父类的introduce（）方法
 * 4. 定义并初始化一个老师对象，调佣业务方法，实现对象基本信息的后台打印
 */

public class exercise02 {
    public static void main(String[] args) {
        Professor professor = new Professor("贾宝玉", 30, "高级职称", 30000, 1.3);
        AssProfessor assProfessor = new AssProfessor("zhangsan", 28, "中级职称", 20000, 1.2);
        professor.introduce();
        assProfessor.introduce();
    }
}

class Teacher {
    private String name;
    private int age;
    private String post;
    private double salary;
    private double grade;
    public Teacher(String name, int age, String post, double salary, double grade) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.grade = grade;
    }

    public void introduce() {
        System.out.println(this.name + " " + this.age + " " + this.post + " " + this.salary + " " + this.grade);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getPost() {
        return post;
    }
    public void setPost(String post) {
        this.post = post;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
    
}

class Professor extends Teacher {

    public Professor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    
    @Override
    public void introduce() {
        System.out.println("教授信息");
        super.introduce();
    }
}

class AssProfessor extends Teacher {

    public AssProfessor(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    
    @Override
    public void introduce() {
        System.out.println("副教授信息");
        super.introduce();
    }
}

class Lecturer extends Teacher {

    public Lecturer(String name, int age, String post, double salary, double grade) {
        super(name, age, post, salary, grade);
    }
    @Override
    public void introduce() {
        System.out.println("讲师信息");
        super.introduce();
    }
}
