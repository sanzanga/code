package com.exercise;

/*
 * 1. 做一个Student类，包含name、sex、age、stu_id，合理封装，通过构造器进行四个值赋值
 * 2. 写一个Teacher类，包含name、sex、age、work_age，合理封装，通过构造器进行四个值赋值
 * 3. 抽取一个父类Person类，将其共有的属性和方法放到Person当中
 * 4. 学生需要有学习的方法study，在方法里面写“我承诺，我会好好学习”
 * 5. 教师需要有教学的方法teach，在方法里面写“我承诺，我会认真教书”
 * 6. 学生和教师都有一个玩的方法play，学生玩的是足球，老师玩的是象棋
 * 7. 定义多态数组，里面保存2个学生2个老师，要求按照年龄从高到低排序
 * 8. 定义方法，形参为Person类型，功能：调用学生的study或教师的teach方法
 */

public class exercise06 {
    public static void main(String[] args) {
        Person06 student1 = new Student06("zhangsan", '男', 18, "12345678");
        Person06 student2 = new Student06("lisi", '男', 21, "12545678");

        Person06 teacher1 = new Teacher06("wangwu", '男', 30, 8);
        Person06 teacher2 = new Teacher06("zhaoliu", '男', 40, 18);
        
        Person06 persons[] = {student1, student2, teacher1, teacher2};

        // 年龄从高到低排序
        for(int i = 0; i < persons.length - 1; i++) {
            for(int j = 0; j < persons.length - 1 - i; j++) {
                if(persons[j + 1].getAge() > persons[j].getAge()) {
                    Person06 temp = persons[j + 1];
                    persons[j + 1] = persons[j];
                    persons[j] = temp;
                }
            }
        }

        for(int i = 0; i < persons.length; i++) {
            if(persons[i] instanceof Student06) {
                Student06 student = (Student06)persons[i];
                System.out.println("学生信息");
                System.out.println("姓名：" + persons[i].getName());
                System.out.println("年龄：" + persons[i].getAge());
                System.out.println("性别：" + persons[i].getSex());
                System.out.println("学号：" + student.getStu_id());
                persons[i].play();
                student.study();
            }else if(persons[i] instanceof Teacher06) {
                Teacher06 teacher = (Teacher06)persons[i];
                System.out.println("老师信息");
                System.out.println("姓名：" + persons[i].getName());
                System.out.println("年龄：" + persons[i].getAge());
                System.out.println("性别：" + persons[i].getSex());
                System.out.println("工龄：" + teacher.getWork_age());
                persons[i].play();
                teacher.teach();
            }else {
                System.out.println("类型有误");
            }
            System.out.println("=====================");
        }
    }
}

class Person06 {
    private String name;
    private char sex;
    private int age;
    public Person06(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public char getSex() {
        return sex;
    }
    public void setSex(char sex) {
        this.sex = sex;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    // play
    public void play() {
        System.out.println(this.name + "在玩");
    }
}

class Student06 extends Person06 {
    private String stu_id;

    public Student06(String name, char sex, int age, String stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }
    //study
    public void study(){
        System.out.println(this.getName() + ":我承诺，我会好好学习");
    }
    // 重写play
    @Override
    public void play() {
        System.out.println(this.getName() + "在玩足球");
    }
}

class Teacher06 extends Person06 {
    private int work_age;

    public Teacher06(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }
    //teach
    public void teach() {
        System.out.println(this.getName() + ":我承诺，我会认真教书");
    }
    // 重写play方法
    @Override
    public void play() {
        System.out.println(this.getName() + "在玩象棋");
    }
    
}
