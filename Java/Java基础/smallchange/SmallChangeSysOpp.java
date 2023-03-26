package com.smallchange;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

// 面向对象编程
// 完成各个功能，将对应的各个功能看成一个方法
public class SmallChangeSysOpp {
    // 1. 先完成显示菜单，并选择打印菜单，给出对应提示
    boolean loop = true;
    Scanner scanner = new Scanner(System.in);
    String key = "";

    // 2. 完成零钱通明细
    String detail = "--------------------零钱通明细--------------------";

    // 3. 完成收益入账
    double money = 0;
    double balance = 0;
    Date date = null;
    // 日期格式化
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    // 4. 消费
    String note = "";

    // 显示菜单
    public void mainMenu() {
        // 显示零钱通菜单
        do {
            System.out.println("\n--------------------零钱通菜单--------------------");
            System.out.println("\t\t1 零钱通明细");
            System.out.println("\t\t2 收益入账");
            System.out.println("\t\t3 消费");
            System.out.println("\t\t4 退     出");

            System.out.print("请选择(1-4)：");
            key = scanner.next();

            // 使用switch 分支控制
            switch (key) {
                case "1":
                    this.detail();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.pay();
                    break;
                case "4":
                    this.exit();
                    break;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        } while (loop);
    }

    // 完成零钱通明细
    public void detail() {
        System.out.println(detail);
    }

    // 完成收益入账
    public void income() {
        System.out.print("收益入账金额：");
        money = scanner.nextDouble();

        // money进行校验
        // 找出不正确的金额，给出提示，就直接break
        if (money <= 0) {
            System.out.println("收益入账金额需要大于0");
            return;
        }

        balance += money;
        // 获取当前日期
        date = new Date();
        // 拼接入账信息到detail
        detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    // 消费
    public void pay() {
        System.out.print("消费金额：");
        money = scanner.nextDouble();

        // money范围判断
        // 找出金额不正确的范围
        if (money <= 0 || money > balance) {
            System.out.println("你的消费金额应该在0-" + balance);
            return;
        }

        System.out.print("消费说明:");
        note = scanner.next();
        balance -= money;

        // 拼接消费信息带detail
        detail += "\n" + note + "\t\t-" + money + "\t" + sdf.format(date) + "\t" + balance;
    }

    // 退出
    public void exit() {
        String choice = "";
        while (true) {
            System.out.println("你确定要退出吗？y/n");
            choice = scanner.next();
            if ("y".equals(choice) || "n".equals(choice)) {
                break;
            }
        }

        // 当用户退出后进行判断
        if (choice.equals("y")) {
            loop = false;
        }
        // 如果输入n，也就是不退出，就可以不用进行处理
    }
}
