package com.exercise;

// import javax.print.Doc;

/*
 * 编写Doctor类{name，age，job，gender，sal}，相应的get和set方法，以及五个参数的构造器
 * 重写父类Object的equals方法，判断属性是否相等
 */

public class exercise05 {
    public static void main(String[] args) {
        Doctor05 doctor05 = new Doctor05("zhansan", 30, "妇产科", '男', 12000);
        Doctor05 doctor052 = new Doctor05("zhansan", 30, "妇产科", '男', 12000);
        boolean ret = doctor05.equals(doctor052);
        if(ret == true) {
            System.out.println("相同");
        }else {
            System.out.println("不相同");
        }
    }
}

class Doctor05 {
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;
    public Doctor05(String name, int age, String job, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
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
    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    // 自己写的
    // @Override
    // public boolean equals(Object obj) {
    //     // 将父类强转为Doctor05
    //     Doctor05 doctor05 = (Doctor05)obj;
    //     if(doctor05.getName().equals(this.name) && doctor05.getAge() == this.age && doctor05.getJob().equals(this.job) && doctor05.getGender() == this.gender && doctor05.getSalary() == this.salary) {
    //         return true;
    //     }
    //     return false;
    // }

    // 老师的方法
    @Override
    public boolean equals(Object obj) {
        // 判断两个比较对象是否相同
        if(this == obj) {
            return true;
        }
        // 判断obj是否是Doctor05类
        if(!(obj instanceof Doctor05)) {
            return false;
        }else {
            // 是的话，就向下转型
            Doctor05 doctor05 = (Doctor05)obj;
            if(doctor05.getName().equals(this.name) && doctor05.getAge() == this.age && doctor05.getJob().equals(this.job) && doctor05.getGender() == this.gender && doctor05.getSalary() == this.salary) {
                return true;
            }
        }
        return false;
    }
}
