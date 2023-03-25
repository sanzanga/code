package com.object_;

/*
 * 判断两个Person对象的内容是否相等
 * 如果两个Person对象的各个属性值都一样，返回true
 * 否则返回false
 */

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person1
         = new Person("jack", 18, '男');
         Person person2
         = new Person("jack", 18, '男');

         System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        // 判断如果比较两个对象是同一个对象，则直接返回true
        if(this == obj) {
            return true;
        }
        //类型判断
        if(obj instanceof Person) {
            // 向下转型
            Person p = (Person)obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;

        }
        return false;
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
    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    } 
}
