// public class exercise_2023_3_24 {
    
// }

// // package chapter2.step7;
// /********* Begin *********/
// import java.util.Scanner;

// public class HelloWorld{
// 	public static void main(String[] args){
//         System.out.println("请录入嫦娥个人信息：");
//         Scanner scan = new Scanner(System.in);

//         System.out.print("请输入姓名：");
//         String name = scan.next();
//         System.out.println();

//         System.out.print("请输入年龄：");
//         int age = scan.nextInt();
//         System.out.println();
        
//         System.out.print("请输入性别：");
//         char sex = scan.next().charAt(0);
//         System.out.println();
        
//         System.out.print("请输入体重：");
//         double weight = scan.nextDouble();
//         System.out.println();

//         System.out.print("请输入地址：");
//         String address = scan.next();
//         System.out.println();

//         System.out.print("请输入是否已婚：");
//         char isMarried = scan.next().charAt(0);
//         System.out.println();

//         System.out.println("信息如下：");
//         System.out.println("\t姓名：" + name);
//         System.out.println("\t年龄：" + age + "岁");
//         System.out.println("\t性别：" + sex);
//         System.out.println("\t体重：" + weight + "kg");
//         System.out.println("\t地址：" + address);
//         System.out.println("\t婚否：" + isMarried);
// 		/********* End *********/
// 	}
// }


/*
 * 有数列为：9，99，999，...，9999999999。
 * 要求使用程序计算此数列的和，并在控制台输出结果。
 * （请尝试使用循环的方式生成这个数列并同时在循环中求和）
 */

// public class Main {
//     public static void main(String[] args) {

//         //write your code here........
//         String a = "9";
//         long sum = 0;
//         for(int i = 0;i<10;i++){
//             sum = Long.parseLong(a) + sum;
//             a = a + "9";
//         }
//         System.out.println(sum);

//     }
// }


/*
 * 控制台输入整数，请设计一个死循环，当用户输入非正数时停止输入。
 * 请给出用户输入的正整数个数（默认输入个数不超过2147483647）
//  */
// import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         int count = 0;
//         Scanner scanner = new Scanner(System.in);

//         //write your code here......
//         while(true) {
//             int num = scanner.nextInt();
//             if(num < 1) {
//                 break;
//             }else {
//                 count++;
//             }
//         }
//         System.out.println(count);

//     }
// }


/*
 * 编写一个方法，该方法的返回值是两个不大于100的正整数的最小公倍数
 */

//  import java.util.*;

// public class Main {
//     public static void main(String[] args) {
//         Scanner console = new Scanner(System.in);
//         int m = console.nextInt();
//         int n = console.nextInt();
//         int result = getCM(m, n);
//         System.out.println(result);
//     }

//     public static int getCM(int m, int n){

//         //write your code here......
//         int max = m > n ? m : n;
//         while(true) {
//             if(max % m == 0 && max % n == 0) {
//                 break;
//             }
//             max++;
//         }
//         return max;

//     }
// }


/*
 * 一球从h米高度自由落下，每次落地后反弹回原高度的一半再落下，
 * 求它在第n次落地时共经过了多少米？第n次反弹多高？
 */
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner=new Scanner(System.in);
//         float h=scanner.nextFloat();
//         int n =scanner.nextInt();

//         //write your code here......
//         double sum = 0;//经过的距离
//         double dis = 0;//反弹的高度

//         for(int i = 0; i < n; i++) {
//             sum += h;
//             h /= 2;
//             sum += h;
//             dis = h;
//         }

//         sum -= dis;

//         //输出格式为：System.out.println(String.format("%.3f", h)+" "+String.format("%.3f", sum));
//         System.out.println(String.format("%.3f", dis) + " " + String.format("%.3f", sum));

//     }
// }


/*
 * 键盘输入任意多个10000以内正整数（负数代表结束），求出它们的平均数，
 */

//  import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         double sum = 0;
//         int count = 0;

//         //write your code here......
//         while(true) {
//             int num = scan.nextInt();
//             if(num <= 0) {
//                 break;
//             }
//             sum += num;
//             count ++;
//         }

//         //输出格式为：System.out.println(String.format("%.2f",avg));
//         System.out.println(String.format("%.2f", sum / count));

//     }
// }


/*
 * 请补全预设代码中判断质数的方法。
 */

//  import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Main main = new Main();
//         Scanner scan = new Scanner(System.in);
//         int number = scan.nextInt();
//         System.out.println(main.isPrimeNumber(number));
//     }

//     public Boolean isPrimeNumber(int number) {

//         //write your code here......
//         for(int i = 2; i <= Math.sqrt(number); i++) {
//             if(number % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


/*
 * 输入一个整数，计算它的位数。如果输入的整数不大于0则输出这个数
 */
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);
//         int num = scan.nextInt();
//         scan.close();

//         //write code here......
//         int count = 0;
//         while(num > 0) {
//             count ++;
//             num /= 10;
//         }

//         System.out.println(count);

//     }
// }


/*
 * 将用户输入的六个数字填入数组并找出数组中最大值和最小值
 */
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         int[] ary = new int[6];
//         int max;
//         int min;
//         Scanner scanner = new Scanner(System.in);
//      	for (int i = 0; i <ary.length ; i++) {
//             ary[i]=scanner.nextInt();
//         }

//         //write your code here......
//         max = ary[0];
//         min = ary[0];
//         for(int i = 0; i < ary.length; i++){
//             if(ary[i] > max) {
//                 max = ary[i];
//             }
//             if(ary[i] < min) {
//                 min = ary[i];
//             }
//         }

//         System.out.println(max+" "+min);
//     }
// }


/*
 * 输入6个整数，先将其输出然后再将数组倒转，再次输出数组
 */
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         int[] arr = new int[6];
//         Scanner scanner = new Scanner(System.in);
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = scanner.nextInt();
//         }
//         System.out.println(Arrays.toString(arr));

//         //write your code here......
//         int left = 0;
//         int right = 5;
//         while(left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }


/*
 * 给定一个二维数组，请你编写一个求和函数，计算出这个数组元素的和
 */
// public class Main {
//     public static void main(String[] args) {
//         int[][]  arr = {{11,33,55},{22,44,66,88},{131,214,315,146},{928,827,726,625},{424,525}};
//         int sum=add(arr);
//         System.out.println(sum);
//     }

//     public static int add(int[][] arr) {
//         int sum=0;

//         //write your code here......
//         for(int i = 0; i < arr.length; i++) {
//             for(int j = 0; j < arr[i].length; j++) {
//                 sum += arr[i][j];
//             }
//         }

//         return sum;
//     }
// }


/*
 * 现有一个Data类，内部定义了属性x和y，在main方法中实例化了Data类，并计算了data对象中x和y的和。
 * 但是，Data类的定义存在错误，请你将这些错误修正过来，使得main方法中的求和逻辑可以正常执行。
 */
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNextInt()) {
//             int x = scanner.nextInt();
//             int y = scanner.nextInt();
//             Data data = new Data(x, y);
//             System.out.println(data.getX() + data.getY());
//         }
//     }

// }

// class Data {

//     private int x;
//     private int y;

//     public Data(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public int getX() {
//         return x;
//     }

//     public int getY() {
//         return y;
//     }

// }


/*
 * 采用封装的思想，为Person类定义年龄属性，要求：
修改年龄时判断其范围，若年龄小于0则按0输出，若年龄大于200则按200输出。
 */
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Person p = new Person();
//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNextInt()) {
//             int age = scanner.nextInt();
//             p.setAge(age);
//             System.out.println(p.getAge());
//         }
//     }

// }

// class Person {

//     private int age;

//     //write your code here......
//     public void setAge(int age) {
//         if(age < 0) {
//             this.age = 0;
//         }else if(age <= 200) {
//             this.age = age;
//         }else {
//             this.age = 200;
//         }
//     }

//     public int getAge() {
//         return this.age;
//     }

// }


/*
 * 有父类Base，内部定义了x、y属性。有子类Sub，继承自父类Base。子类新增了一个z属性，并且定义了calculate方法，
 * 在此方法内计算了父类和子类中x、y、z属性三者的乘积。
 * 请补全子类构造方法的初始化逻辑，使得该计算逻辑能够正确执行。
 */
// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         while (scanner.hasNextInt()) {
//             int x = scanner.nextInt();
//             int y = scanner.nextInt();
//             int z = scanner.nextInt();
//             Sub sub = new Sub(x, y, z);
//             System.out.println(sub.calculate());
//         }
//     }

// }

// class Base {

//     private int x;
//     private int y;

//     public Base(int x, int y) {
//         this.x = x;
//         this.y = y;
//     }

//     public int getX() {
//         return x;
//     }

//     public int getY() {
//         return y;
//     }

// }

// class Sub extends Base {

//     private int z;

//     public Sub(int x, int y, int z) {

//         //write your code here
//         super(x, y);
//         this.z = z;

//     }

//     public int getZ() {
//         return z;
//     }

//     public int calculate() {
//         return super.getX() * super.getY() * this.getZ();
//     }

// }



/*
 * 在父类Base中定义了计算方法calculate()，该方法用于计算两个数的乘积（X*Y）。
 * 请在子类Sub中重写该方法，将计算逻辑由乘法改为除法（X/Y）。注意，当分母为0时输出“Error”。
 */
import java.util.Scanner;

public class exercise_2023_3_24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            sub.calculate();
        }
        scanner.close();
    }

}

class Base {

    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void calculate() {
        System.out.println(getX() * getY());
    }

}

class Sub extends Base {

    //write your code here......
    public Sub(int x, int y) {
        super(x, y);
    }

    public void calculate() {
        if(getY() == 0) {
            System.out.println("Error");
        }else {
            System.out.println(getX() / getY());
        }
    }

}
