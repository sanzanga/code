package com.exercise;

/*
 * 定义一个Person类{name，age，job}，初始化Person对象数组，有3个person对象，并按照age从大到小进行排序，使用冒泡排序
 */

public class exercise01 {
    public static void main(String[] args) {
        Person person = new Person("zhangsan", 20, "woker");
        Person person2 = new Person("lisi", 18, "manager");
        Person person3 = new Person("wangwu", 22, "程序员");
        Person persons[] = {person, person2, person3};
        // 进行冒泡排序
        for(int i = 0; i < 3 - 1; i++) {
            for(int j = 0; j < 3 - 1 - i; j++) {
                if(persons[j + 1].getAge() > persons[j].getAge()) {
                    Person tempPerson = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = tempPerson;
                }
            }
        }
        // 输出
        for(int i = 0; i < 3; i++) {
            // System.out.println(persons[i].getName() + " " + persons[i].getAge() + "  " + persons[i].getJob());
            // 用toString
            System.out.println(persons[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", job=" + job + "]";
    }
    
}
