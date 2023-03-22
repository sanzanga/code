// //编写类A01，定义方法max，实现求某个double数组的最大值，并返回
// public class exercise_2023_3_22 {
//     public static void main(String[] args){
//         double arr[] = {1.1, 2, -0.9, 45, 33, 34.6, 78.9, 56};
//         //创建对象
//         A01 a01 = new A01();
//         //调用方法
//         double max = a01.max(arr);
//         System.out.println(max);
//     }
// }
// //创建类A01
// class A01 {
//     //传入double数组，求最大值
//     public double max(double[] arr){
//         double max = arr[0];
//         for(int i = 0; i < arr.length; i++) {
//             if(arr[i] > max){
//                 max = arr[i];
//             }
//         }
//         return max;
//     }
// }

// //对上面代码进行修改，考虑代码的健壮性
// //编写类A01，定义方法max，实现求某个double数组的最大值，并返回
// public class exercise_2023_3_22 {
//     public static void main(String[] args) {
//         //double arr[] = { 1.1, 2, -0.9, 45, 33, 34.6, 78.9, 56 };
//         // double arr[] = {};
//         double arr[] = null;
//         // 创建对象
//         A01 a01 = new A01();
//         // 调用方法
//         Double max = a01.max(arr);
//         //进行判断
//         if(max != null) {
//             System.out.println(max);
//         }else {
//             System.out.println("输入有误！");
//         }
//     }
// }

// // 创建类A01
// class A01 {
//     // 传入double数组，求最大值
//     public Double max(double[] arr) {
//         //如果数组长度等于零，会抛出异常;或者数组直接为空
//         if (arr != null && arr.length > 0) {
//             double max = arr[0];
//             for (int i = 0; i < arr.length; i++) {
//                 if (arr[i] > max) {
//                     max = arr[i];
//                 }
//             }
//             return max;
//         }else {
//             return null;
//         }
//     }
// }

// //编写类A02，定义方法find，实现查找某字符串在字符串数组中的元素查找
// //并返回索引，如果找不到，返回-1
// public class exercise_2023_3_22{
//     public static void main(String[] args){
//         // String[] arr = {"zhangsan", "li", "wangwu"};
//         // String[] arr= {};
//         String[] arr = null;
//         A02 a02 = new A02();
//         int index = a02.find("zhangsan", arr);
//         if(index == -1){
//             System.out.println("不存在");
//         }else {
//             System.out.println("存在");
//         }
//     }
// }

// //编写类A02
// class A02 {
//     //find方法
//     public int find(String findStr, String arr[]) {
//         if(arr != null && arr.length > 0) {
//             for(int i = 0; i < arr.length; i++){
//                 if(findStr.equals(arr[i])){
//                     return i;
//                 }
//             }
//             return -1;
//         }else {
//             return -1;
//         }
//     }
// }

// //编写类Book，定义方法updatePrice，实现更改某本书的价格，具体：
// // 如果价格>150，则更改为150
// // 如果价格大于100，更改为100，否则不变
// public class exercise_2023_3_22{
//     public static void main(String[] args){
//         Book book = new Book();
//         book.price = 149;
//         book.updatePrice();
//         System.out.println("price = " + book.price);
//     }
// }

// //编写Book类
// class Book {
//     int price;

//     //updatePrice方法
//     public void updatePrice() {
//         if(this.price > 150) {
//             this.price = 150;
//         }else if(this.price > 100) {
//             this.price = 100;
//         }
//     }
// }

// //编写类A03，实现数组的复制功能copyArr，输入旧数组，返回一个新数组
// // 元素和就数组一样
// public class exercise_2023_3_22 {
//     public static void main(String[] args) {
//         double arr[] = { 1.1, 2, -0.9, 45, 33, 34.6, 78.9, 56 };
//         A03 a03 = new A03();
//         double retArr[] = a03.copyArr(arr);
//         for(int i = 0; i < retArr.length; i++){
//             System.out.print(retArr[i] + " ");
//         }
//     }
// }

// class A03 {
//     public double[] copyArr (double soureArr[]) {
//         double retArr[] = new double[soureArr.length];
//         for(int i = 0; i < soureArr.length; i++){
//             retArr[i] = soureArr[i];
//         }
//         return retArr;
//     }
// }

// //定义一个圆类Circle，定义属性：半径，提供显示圆周长功能的方法
// // 提供显示圆面积的方法
// public class exercise_2023_3_22 {
//     public static void main(String[] args) {
//         Circle circle = new Circle();
//         circle.r = 1;
//         double area = circle.area();
//         double len = circle.len();
//         System.out.println("面积是：" + area);
//         System.out.println("周长是：" + len);
//     }
// }

// class Circle {
//     double r;

//     //计算面积
//     public double area() {
//         return 3.14 * this.r * this.r;
//     }
//     //计算周长
//     public double len() {
//         return 2 * r * 3.14;
//     }
// }

// // 编程创建一个Cale类，在其中定义2个变量表示两个操作数
// // 定义4个方法实现求和、差、积、商（如果除数为0，要提示）
// // 并创建两个对象，分别测试
// public class exercise_2023_3_22 {
//     public static void main(String[] args) {
//         Cale cale = new Cale(4, 0);
//         System.out.println("sum = " + cale.getSum());
//         System.out.println("minus = " + cale.getMinus());
//         System.out.println("mul = " + cale.getMul());
//         if (cale.num2 == 0) {
//             System.out.println("除数不能为0");
//         } else {
//             System.out.println("div = " + cale.getDiv());
//         }
//     }
// }

// class Cale {
//     double num1;
//     double num2;

//     // 构造方法
//     public Cale(int num1, int num2) {
//         this.num1 = num1;
//         this.num2 = num2;
//     }

//     // 计算和
//     public double getSum() {
//         return this.num1 + this.num2;
//     }

//     // 计算差
//     public double getMinus() {
//         return this.num1 - this.num2;
//     }

//     // 计算积
//     public double getMul() {
//         return this.num1 * this.num2;
//     }

//     // 计算除法
//     public double getDiv() {
//         return this.num1 / this.num2;
//     }
// }


// //设计一个Dog类，有名字、颜色和年龄的属性
// // 定义输出方法show()显示其信息，并创建对象，并测试
// public class exercise_2023_3_22 {
//     public static void main(String[] args) {
//         Dog dog = new Dog("旺财", "black", 2);
//         dog.show();
//     }
// }

// class Dog {
//     int age;
//     String name;
//     String color;

//     public Dog(String name, String color, int age) {
//         this.name = name;
//         this.color = color;
//         this.age = age;
//     }

//     public void show() {
//         System.out.println("name = " + this.name +
// " color = " + this.color + " age = " + this.age);
//     }
// }



public class exercise_2023_3_22 {
    int count = 9;
    public void count1() {
        count = 10;
        System.out.println("count1=" + count);
    }
    public void count2() {
        System.out.println("count1=" + count++);
    }

    public static void main(String[] args) {
        // 这个new exercise_2023_3_22()是匿名对象
        // 匿名对象使用后，就不能使用了
        // 创建好匿名对象后，就调用count1()方法
        new exercise_2023_3_22().count1();

        exercise_2023_3_22 t1 = new exercise_2023_3_22();
        t1.count2();
        t1.count2();
    }
}
