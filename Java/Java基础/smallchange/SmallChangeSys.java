package com.smallchange;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

//零钱通项目
public class SmallChangeSys {
    public static void main(String[] args) {
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

        do{
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
                    // System.out.println("零钱通明细");
                    System.out.println(detail);
                    break;
                case "2":
                    System.out.print("收益入账金额：");
                    money = scanner.nextDouble();

                    // money进行校验
                    // 找出不正确的金额，给出提示，就直接break
                    if(money <= 0) {
                        System.out.println("收益入账金额需要大于0");
                        break;
                    }

                    balance += money;
                    //获取当前日期
                    date = new Date();
                    // 拼接入账信息到detail
                    detail += "\n收益入账\t+" + money + "\t" + sdf.format(date) + "\t" + balance; 
                    break;
                case "3":
                    System.out.print("消费金额：");
                    money = scanner.nextDouble();

                    // money范围判断
                    // 找出金额不正确的范围
                    if(money <= 0 || money > balance) {
                        System.out.println("你的消费金额应该在0-" + balance);
                        break;
                    }

                    System.out.print("消费说明:");
                    note = scanner.next();
                    balance -= money;

                    // 拼接消费信息带detail
                    detail += "\n" + note + "\t\t-" + money + "\t" +sdf.format(date) + "\t" + balance; 
                    break;
                case "4":
                    String choice = "";
                    while(true) {
                        System.out.println("你确定要退出吗？y/n");
                        choice = scanner.next();
                        if("y".equals(choice) || "n".equals(choice)) {
                            break;
                        }
                    }

                    // 当用户退出后进行判断
                    if(choice.equals("y")) {
                        loop = false;
                    }
                    // 如果输入n，也就是不退出，就可以不用进行处理
                    break;
                default :
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }while(loop);

        scanner.close();
        System.out.println("退出零钱通");
    }
}
