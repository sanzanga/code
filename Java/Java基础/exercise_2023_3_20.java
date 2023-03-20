// import java.io.ObjectOutputStream.PutField;

// //汉诺塔问题
// public class exercise_2023_3_20{
//     public static void main(String[] args){
//         Tower tower = new Tower();
//         tower.move(2, 'A', 'B', 'C');
//     }
// }

// class Tower{
//     //方法
//     //num表示移动的个数，a，b，c分别表示A塔，B塔，C塔
//     public void move(int num, char a, char b, Character c){
//         //如果只有1个盘,直接将A塔上的盘直接移动到C塔上
//         if(num == 1){
//             System.out.println(a + "->" + c);
//         }else{
//             //如果有多个盘，可以看成是两个盘，最下面和上面所有的盘（num - 1）
//             //1. 先移动上面所有的盘到b，借助c
//             move(num - 1, a, c, b);
//             //2. 把最下面的盘，移动到c
//             System.out.println(a + "->" + c);
//             //3. 再把B塔上的盘，移动到C塔，借助A塔
//             move(num - 1, b, a, c);
//         }
//     }
// }


// //迷宫问题
// public class exercise_2023_3_20{
//     public static void main(String[] args){
//         //先创建迷宫，用二维数组表示 int[][] map = new int[8][7];
//         //规定map数组的元素：0表示可以走，1表示障碍物

//         int[][] map = new int[8][7];
//         //将最上面的一行和最下面的一行全部设置为1
//         for(int i = 0; i < 7; i++){
//             map[0][i] = 1;
//             map[7][i] = 1;
//         }
//         //将最左边的一行和最右边的一行设置为1
//         for(int i = 0; i < 8; i++){
//             map[i][0] = 1;
//             map[i][6] = 1;
//         }
//         map[3][1] = 1;
//         map[3][2] = 1;

//         //输出当前地图
//         System.out.println("=====当前地图=====");
//         for(int i = 0; i < map.length; i++){
//             for(int j = 0; j < map[i].length; j++){
//                 System.out.print(map[i][j] + " ");
//             }
//             System.out.println();
//         }

//         //找路
//         T t1 = new T();
//         t1.findWay(map, 1, 1);
//         //找路的情况如下
//         System.out.println("=====找路的情况=====");
//         for(int i = 0; i < map.length; i++){
//             for(int j = 0; j < map[i].length; j++){
//                 System.out.print(map[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// class T {
//     //使用递归回溯的思想解决迷宫老鼠问题
//     //1. findWay方法就是专门找出迷宫的路径
//     //2. 如果找到了就返回true，没有找到就返回false
//     //3. map就是二维数组，也就是迷宫
//     //4. i,j就是老鼠的位置，初始化的位置为(1,1)
//     //5. 规定：map数组的各个值得含义
//     //         0表示可以走 1表示障碍物 2表示可以走 3表示走过，但是走不通
//     //6. 当map[6][5] == 2 就代表走痛了
//     //7. 找路策略：上 -> 右 -> 下 -> 左
//     //8. 找路策略的改变找出来的路径是不相同的
//     public boolean findWay(int map[][], int i, int j){
//         if(map[6][5] == 2){
//             //表示走通了
//             return true;
//         }else{
//             if(map[i][j] == 0){
//                 //当前位置为0，说明可以走，假定可以走
//                 map[i][j] = 2;
//                 //找路
//                 if(findWay(map, i + 1, j)){
//                     //下
//                     return true;
//                 }else if(findWay(map, i, j + 1)){
//                     //右
//                     return true;
//                 }else if(findWay(map, i - 1, j)){
//                     //上
//                     return true;
//                 }else if(findWay(map, i, j - 1)){
//                     return true;
//                 }else{
//                     //假定可以走通是错的
//                     map[i][j] = 3;
//                     return false;
//                 }
//             }else{
//                 return false;
//             }
//         }
//     }
// }



// //八皇后问题
// public class exercise_2023_3_20 {
//     public static void main(String[] args){
//          int queue[] = {-1, -1, -1, -1, -1, -1, -1, -1, -1};
//          Queue q = new Queue();
//          q.findSpace(queue, 1);

//          for(int i = 1; i < queue.length; i++){
//             System.out.print(queue[i] + " ");
//          }
//     }
// }

// class Queue {
//     //queueNum行能放的皇后位置
//     public void findSpace(int queue[], int queueNum) {
//         for(int i = 1; i <= 8; i++){
//             if(available(queue, queueNum, i)){
//                 queue[queueNum] = i;
//                 if(queueNum == 8){
//                     return;
//                 }
//                 int nextNum = queueNum + 1;
//                 findSpace(queue, nextNum);
//             }
//         }
//         //如果这一行没有可放置的位置说明上一行皇后位置不行
//         //要为上一个皇后重新找一个位置
//         queue[--queueNum] = -1;
//         return ;
//     }

//     public boolean available(int queue[], int pos1, int pos2){
//         //判断位置是否冲突
//         for(int i = 1; i < pos1; i++){
//             if(pos2 == queue[pos1]){
//                 return false;//同一列
//             }
//             if((pos1 - i) == (pos2 - queue[pos1])){
//                 return false;//同一主对角线
//             }
//             if((pos1 - i) + (pos2 - queue[i]) == 0){
//                 return false;//同一副对角线
//             }
//         }
//         return true;
//     }
// }



//八皇后问题
public class exercise_2023_3_20 {
    //八皇后问题，在一个8×8的国际象棋棋盘上摆放8个皇后，
    //摆放需遵守皇后不能处于同一行、同一列、同一斜线上，
    //问有多少种摆法
    int max = 8;
    //记录有多少种摆法
    static int count = 0;
    // 初始化一个数组用于存放结果
	/*
	 * 这里用一维数组存放数据就可以了，这里一维数组中的值存放的是皇后的列坐标， 
	 * 因为规定皇后是不能摆放在同一行，所以每一行只有一个皇后 ； 一维数组 arr
	 * 的第一个值就是 棋盘第一行皇后的列坐标值，第二个值就是皇后在棋盘第二行的列坐标值
	 */
    int[] arr = new int[max];
    public static void main(String[] args){
        exercise_2023_3_20 queue = new exercise_2023_3_20();
        queue.putQueue(0);
        System.out.println("共有" + count + "种摆法");
    }

    public void putQueue(int num){
        if(num == max){
            ////因为n是从0开始增加，
            //即n=0表示放第一个皇后，当n==max时表示皇后已经摆完了
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            count++;
            System.out.println();
            return;
        }
        for(int i = 0; i < max; i++){
            ////放置第一个皇后
            arr[num] = i;
            if(judge(num)){//判断皇后的位置是否冲突，不冲突继续放下一个皇后
                putQueue(num + 1);
            }
        }
    }

    //判断皇后在该位置是否会引起冲突，即在同一行或同一列或同一斜线
    public boolean judge(int num){
        for(int i = 0; i < num; i++){
            /*
			 * 1. 判断 皇后是否在同一列，只需判断皇后的列坐标是否相等即可，即arr[i] == arr[n]
			 * 2.判断皇后是否在同一斜线上，只需判断两个皇后的列坐标之差的绝对值与其横坐标之差的绝对值是否相等即可，
			 *   即Math.abs(n - i) == Math.abs(arr[i] - arr[n])
			 *  */
            if(arr[i] == arr[num] || Math.abs(num - i) == Math.abs(arr[i] - arr[num])){
                return false;
            }
        }
        return true;
    }
}
