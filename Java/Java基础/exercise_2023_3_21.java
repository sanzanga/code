// public class exercise_2023_3_21 {
    
// }

/* java基础第一次实验 */
// package test;
// import java.util.Scanner; 
// public class First {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         String username="";
//         int a=0,b=0;
//         //用户输入提示
//         System.out.println("输入用户名：");
//         //获取第一个输入字符串
//         if (scan.hasNext()) {
//         	username = scan.next();
//         }
//         //用户输入提示
//         System.out.println("输入第一个整数：");
//         //获取输入的整数
//         if (scan.hasNextInt()) {
//         	a = scan.nextInt();
//         }
//         //用户输入提示
//         System.out.println("输入第二个整数：");
//         //获取输入的整数
//         if (scan.hasNextInt()) {
//         	b = scan.nextInt();
//         }
// //下边编写输出用户名和两数之和的程序
//         // System.out.println("输入用户名：" + username);
//         // System.out.println("输入第一个整数：" + a);
//         // System.out.println("输入第二个整数：" + b);
//         System.out.println("用户名：" + username);
//         System.out.println("两数之和：" + (a + b)); 
//     }
// }

//第二道编程题：打印等腰三角形
// import java.util.Scanner; 
 
// public class Printsanjiao {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = 0;
// //获取用户输入存入整形变量i中
//         i = scan.nextInt();
// //用for输出等腰三角形
//         for(int j = 0; j < i; j++){
//             //打印前面的空格
//             for(int k  = 0; k < i - j - 1; k++){
//                 System.out.print(" ");
//             }
//             //打印字符
//             for(int k = 0; k < j * 2 + 1; k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


/*
 * 本关任务：编写一个根据用户输入的整数，打印输出菱形图案。
注意：需要判断输入的整数（行数）是否能构成菱形，如果非法，则输出error。
 */
// package sec;
// import java.util.Scanner; 
 
// public class Printlingxing {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int i = 0;
// //获取用户输入存入整形变量i中
//         i = scan.nextInt();
// //判断并输出
//         if(i % 2 != 0 && i >= 2){
//             //能构成菱形
//             //先打印上部分
//             for(int j = 0; j < i / 2 + 1; j++){
//                 //打印前面的空格
//                 for(int k  = 0; k < i / 2 - j; k++){
//                     System.out.print(" ");
//                 }
//                 //打印字符
//                 for(int k = 0; k < j * 2 + 1; k++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             }

//             //打印下半部分
//             for(int j = 0; j < i / 2; j++){
//                 //打印前面的空格
//                 for(int k  = 0; k < j + 1; k++){
//                     System.out.print(" ");
//                 }
//                 //打印字符
//                 for(int k = 0; k < (i / 2 - j) * 2 - 1; k++){
//                     System.out.print("*");
//                 }
//                 System.out.println();
//             } 
//         }else{
//             //不能构成菱形
//             System.out.println("error");
//         }
//     }
// }


/*
 * 计算并输出数组的和、平均值（保留一位小数）和最大值。
 */
//  package third;
// import java.util.Scanner; 
 
// public class Shuzujisuan {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
// //获取用户输入，注意第一个数字为接下来输入数字的数量，定义整形数组，获取用户输入存入数组内
//         int count = scan.nextInt();
//         int arr[] = new int[count];
//         int sum = 0;
//         for(int i = 0; i < count; i++){
//             int num = scan.nextInt();
//             arr[i] = num;
//             sum += num;
//         }
// //计算数组的和、平均值、最大值并输出
//         int max = arr[0];
//         for(int i = 0; i < count; i++){
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         double avg = (double)sum / count;
//         String avg1 = String.format("%.1f",avg);
//         System.out.println("和:" + sum);
//         System.out.println("平均值:" + avg1);
//         // System.out.printf("平均值:%.1f" + (double)sum / count);
//         System.out.println("最大值:" + max);
//     } 
// }



//牛客网java入门题
// 设计一个方法，将一个小于2147483647的double类型变量以截断取整方式转化为int类型
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double d = scanner.nextDouble();
//         System.out.println(Main.typeConversion(d));
//     }
//     public static int typeConversion(double d){

//         //write your code here......
//         return (int)d;

//     }
// }

// 输入两个正整数a和b，输出这两个正整数的和，差，积，商，模
// （若a>b则输出a-b，a/b，a%b的值反之输出b-a，b/a，b%a的值，不考虑小数，请使用int类型）
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();
//         scanner.close();

//         //write your code here......
//         if(a > b){
//             System.out.print(a + b + " ");
//             System.out.print(a - b + " ");
//             System.out.print(a * b + " ");
//             System.out.print(a / b + " ");
//             System.out.print(a % b);
//         }else{
//             System.out.print(a + b + " ");
//             System.out.print(b - a + " ");
//             System.out.print(a * b + " ");
//             System.out.print(b / a + " ");
//             System.out.print(b % a);
//         }
//     }
// }


// 定义一个int类型变量i,i为由浮点数变量d四舍五入后的整数类型，请将转换后的i进行输出
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double d= scanner.nextDouble();

//         //write your code here......
//         int i = (int)((d * 10) + 5) / 10;

//         System.out.println(i);
//     }
// }

// 在不使用第三个变量的情况下交换两个int类型变量的值
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int a = scanner.nextInt();
//         int b = scanner.nextInt();

//         //write your code here.......
//         int temp = a;
//         a = b;
//         b = temp;

//         System.out.println(a+" "+b);
//     }
// }


// 计算折扣
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner console = new Scanner(System.in);
//         int price = console.nextInt();
//         int cost = 0;

//         //write your code here......
//         if(price >= 5000){
//             cost = (int)(price * 0.6);
//         }else if(price >= 2000){
//              cost = (int)(price * 0.7);
//         }else if(price >= 500){
//              cost = (int)(price * 0.8);
//         }else if(price >= 100){
//              cost = (int)(price * 0.9);
//         }else{
//             cost = price;
//         }

//         System.out.println(cost);
//     }
// }


/*
 * 体重指数 = 体重 (kg) / ( 身高 (m) × 身高 (m) )，小于18.5属于偏瘦，
 * 介于18.5和20.9之间（左闭右开）属于苗条，介于20.9和24.9之间（左闭右闭）属于适中，
 * 超过24.9属于偏胖。下面由你来编写一段逻辑，
 * 算出输入了身高和体重的用户的体重指数，
 * 并返回他们的身材状态。(体重指数请使用double类型)
 */

//  import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         double height = scanner.nextDouble();
//         double weight = scanner.nextDouble();

//         //write your code here......
//         double IBM = weight / (height * height);

//         //进行判断
//         if(IBM < 18.5){
//             System.out.println("偏瘦");
//         }else if(IBM < 20.9){
//             System.out.println("苗条");
//         }else if(IBM <= 24.9){
//             System.out.println("适中");
//         }else{
//             System.out.println("偏胖");
//         }
//     }
// }


/*
 * 现有如下成绩等级A,B,C,D。
 * 其中A代表优秀，B代表良好，C代表及格，D代表不及格。
 * 现在请你来为学生的成绩进行分级，如果用户输入错误则输出未知等级。
 */

 import java.util.Scanner;
public class exercise_2023_3_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String grade =scanner.next();

        //write your code here......
        switch (grade) {
            case "A":
                System.out.println("优秀");
                break;
            case "B":
                System.out.println("良好");
                break;
            case "C":
                System.out.println("及格");
                break;
            case "D":
                System.out.println("不及格");
                break;
            default:
                System.out.println("未知等级");
                break;
        }

    }
}

