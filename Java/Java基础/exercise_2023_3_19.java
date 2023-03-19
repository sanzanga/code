// public class exercise_2023_3_19{
//     //某人有100,000元，每经过一次路口，需要交费，规则如下
//     //1. 当现金>50000时，每次交5%
//     //2. 当现金<=50000时，每次交1000
//     //编程计算该人可以经过多少此路口
//     public static void main(String args[]){
//         double money = 100000;
//         int count = 0;
//         while(true){
//             if(money > 50000){
//                 count++;
//                 money -= money * 0.05;
//             }
//             else{
//                 money -= 1000;
//                 if(money < 0){
//                     break;
//                 }else{
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
// }

// //实现判断一个整数，属于哪一个范围：大于0，小于0，等于0
// import java.util.Scanner;
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         Scanner myScanner = new Scanner(System.in);
//         int num = myScanner.nextInt();
//         if(num > 0){
//             System.out.println("这个数大于0");
//         }else if(num == 0){
//             System.out.println("这个数等于0");
//         }else{
//             System.out.println("这个数小于0");
//         }
//     }
// }

// //实现判断年份，是否为闰年
// import java.util.Scanner;
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         Scanner myScanner = new Scanner(System.in);
//         int year = myScanner.nextInt();
//         if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
//             System.out.println(year + "闰年");
//         }else{
//             System.out.println(year + "不是闰年");
//         }
//     }
// }

// //实现一个数，是否为水仙花数
// import java.util.Scanner;
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         Scanner myScanner = new Scanner(System.in);
//         int num = myScanner.nextInt();//153
//         int sum = 0;
//         int num1 = num;
//         int num2 = num1 % 10;//3
//         sum += num2 * num2 * num2; //27
//         num1 /= 10;
//         while(num1 > 0){//153
//             num2 = num1 % 10;//5
//             sum += num2 * num2 * num2; 
//             num1 /= 10;
//         }
//         if(sum == num){
//             System.out.println(num + "是水仙花数");
//         }else{
//             System.out.println(num + "不是水仙花数");
//         }
        
//     }
// }

// //输出1-100之间的不能被5整除的数，每5个一行
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         int count = 0;
//         for(int i = 1; i <= 100; i++){
//             if(i % 5 != 0){
//                 System.out.print(i + " ");
//                 count ++;
//                 if(count % 5 == 0){
//                     System.out.println();
//                     count = 0;
//                 }
//             }
//         }
//     }
// }



// //输出小写的a-z以及大写的Z-A
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         for(int i = (int)'a'; i <= (int)'z'; i++){
//             System.out.println((char)i + " " + (char)(i - 32));
//         }
//     }
// }


// //求出1-1/2+1/3-1/4 ... 1/100的和
// public class exercise_2023_3_19{
//     public static void main(String args[]){
//         double sum = 0;//用来接收和
//         for(double i = 1; i <= 100; i++){
//             double flag = 1/i;
//             if(i % 2 == 0){
//                 flag = -flag;
//             }
//             sum += flag;
//         }
//         System.out.println(sum);
//     }
// }

// //求出1+(1+2)+(1+2+3)+...+(1+2+3+...+100)的和
// public class exercise_2023_3_19{
//     public static void main(String []args){
//         int sum = 0;
//         for(int i = 1; i <= 100; i++){
//             for(int j = 1; j <= i; j++){
//                 sum += j;
//             }
//         }
//         System.out.println(sum);
//     }
// }

// //有一个升序的数组，要求插入一个元素，该数组顺序依然是升序
// import java.util.Scanner;
// public class exercise_2023_3_19{
//     public static void main(String []args){
//         int arr[] = {10, 12, 45, 90};
//         int retArr[] = new int[arr.length + 1];
//         Scanner scanner = new Scanner(System.in);
//         int insertNum = scanner.nextInt();
//         for(int i = 0; i < arr.length; i++){
//             retArr[i] = arr[i];
//         }
//         retArr[retArr.length - 1] = insertNum;
//         //排序
//         for(int i = 0; i < retArr.length - 1; i++){
//             for(int j = 0; j < retArr.length - 1 - i; j++){
//                 if(retArr[j + 1] < retArr[j]){
//                     int temp = retArr[j + 1];
//                     retArr[j + 1] = retArr[j];
//                     retArr[j] = temp;
//                 }
//             }
//         }

//         for(int i = 0; i < retArr.length; i++){
//             System.out.print(retArr[i] + " ");
//         }
//     }
// }


// //有一个升序的数组，要求插入一个元素，该数组顺序依然是升序
// import java.util.Scanner;
// public class exercise_2023_3_19{
//     public static void main(String []args){

//         int[] arr = {10, 12, 45, 90};
//         int insertNum = 23;
//         int index = -1;
//         for(int i = 0; i < arr.length; i++){
//             if(insertNum <= arr[i]){
//                 index = i;
//                 break;//找到位置后，就退出
//             }
//         }
//         //判断index的值
//         if(index == -1){
//             //说明没找到位置，也就是最后一个位置
//             index = arr.length;
//         }
//         //创建新的接收数组
//         int newArr[] = new int[arr.length + 1];
//         for(int i = 0, j = 0; i < newArr.length; i++){
//             if(i != index){
//                 //说明可以把arr元素的值拷贝到newArr里面
//                 newArr[i] = arr[j];
//                 j++;
//             }else{
//                 newArr[i] = insertNum;
//             }
//         }

//         //遍历
//         for(int i = 0; i < newArr.length; i++){
//             System.out.print(newArr[i] + " ");
//         }
//     }
// }


// //随机生成10个整数（1-100范围内）保存到数组，并倒叙打印以及平均值
// //最大值和最大值的下标怕，并查找里面是否有8
// public class exercise_2023_3_19{
//     public static void main(String []args){
//         int nums[] = new int[10];
//         int sum = 0;
//         boolean flag = false;
//         int index = 0;
//         for(int i = 0; i < nums.length; i++){
//             //生成1-100的随机数
//             nums[i] = (int)(Math.random() * 100) + 1;
//             System.out.print(nums[i] + " ");
//             //求和
//             sum += nums[i];
//         }
//         System.out.println();
//         int max = nums[0];
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i] == 8){
//                 flag = true;
//             }
//             if(nums[i] > max){
//                 max = nums[i];
//                 index = i;
//             }
//         }
//         System.out.println("平均值为：" + sum / nums.length);
//         System.out.println("最大值为：" + max + "  对应下标为：" + index);
//         if(flag){
//             System.out.println("里面存在8");
//         }else{
//             System.out.println("里面不存在8");
//         }
//     }
// }

//实现冒泡排序
public class exercise_2023_3_19{
    public static void main(String []args){
        int arr[] = {20, -1, 89, 2, 890, 7};

        //实现排序
        for(int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j + 1] < arr[j]){
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        //遍历输出
        for(int e : arr){
            System.out.print(e + " ");
        }
    }
}
