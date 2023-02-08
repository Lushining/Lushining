package chapter06;

import java.sql.PreparedStatement;

//test1：递归求斐波那契数(1,1,2,3,5,8,13..)，输入大于等于1的整数，得输出
public class Recursion {
    public static void main(String[] args) {
        CC c = new CC();
        int n = -1;
        int res1 = c.fibonacci(n);
        if(n != -1) {
            System.out.println(n + "对应的Fibonacci数为：" + res1);
        }
    }
}
class CC {
    public int fibonacci(int n) {
        if (n >= 1) {
            if (n >= 3) {
                return fibonacci(n - 1) + fibonacci(n - 2);
            } else {
                return 1;
            }
        } else {
            System.out.println("请输入大于等于1的整数");
            return -1;
        }
    }
}


//test2：猴子吃桃：每天吃一半多一个，第十天只剩一个，求最初共多少桃子
class RecursionTest2{
    public static void main(String[] args) {
        DD d = new DD();
        int res2 = d.MonkeyEatPeach(10,1);
        if(res2 != -1) {
            System.out.println("最初共有" + res2 + "个桃子");
        }
    }
}
class DD {
    public int MonkeyEatPeach(int day, int num) {
        if (day >= 1 && num >= 0) {
            if (day > 1) {
                return (MonkeyEatPeach(day - 1, num) + 1) * 2;
            } else {
                return num;
            }
        } else {
            System.out.println("您的输入有误");
            return -1;
        }
    }
}
/*
public int peach(int day){
    if(day >= 1 && day <=10){
        if(day == 10){
            return 1;
        }else if(1 <= day <= 9){
            return (peach(day-1)+1)*2;
        }else{
            System.out.print("您的输入有误")；
        return -1;
    }
}
 */

//test3:迷宫问题：寻求最短路径
class RecursionTest3{
    public static void main(String[] args){
        //1.创建迷宫：二维数组表示
        int[][] map = new int[8][7];
        //2.定义元素：0-路 1-障碍
        for(int i = 0;i < map.length;i++){
            if(i == 0 | i == 7) {
                for (int j = 0; j < map[i].length; j++) {
                    map[i][j] = 1;
                    System.out.print(map[i][j] + " ");
                }
            System.out.println();
            }else{
                for (int j = 0; j < map[i].length; j++) {
                    if(j == 0 |j == 6) {
                        map[i][j] = 1;
                    }
                    map[3][1] = 1;
                    map[3][2] = 1;
                    System.out.print(map[i][j] + " ");
                }
                System.out.println();
            }
        }
        EE e = new EE();
        e.findWay(map,1,1);
        System.out.println("=======找路情况如下=======");
        for(int i = 0;i < map.length;i++){
            for(int j = 0;j < map[i].length;j++){
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        boolean res3 = e.findWay(map,1,1);
        System.out.println("是否成功走出迷宫：" + res3);
    }
}
//3.递归问题：
//定义：0-路；1-障碍；2-通路；3-死路；成功true失败false
//     map[1][1]初始位置，map[6][5]最终位置
//     map[6][5]=2 则成功，退出程序;否则继续寻找
//策略：下->右->上->左
class EE{
    public boolean findWay(int[][] arr,int i,int j){
        if(arr[6][5] == 2){
            return true;
        }else{
            if(arr[i][j] == 0){//探测位置：0-路
                //假定通路
                arr[i][j] = 2;
                //使用策略进行探测
                if(findWay(arr,i+1,j)){//先走下
                    return true;
                }else if(findWay(arr,i,j+1)){//再走右
                    return true;
                }else if(findWay(arr,i-1,j)) {//再走上
                    return true;
                }else if(findWay(arr,i,j-1)) {//再走左
                    return true;
                }else{
                    arr[i][j] = 3;
                    return false;
                }
            }else{//1-障碍；2-已成功的通路，3-已走过但失败
                return false;
            }
        }
    }
}
//4.回溯现象：arr[2][2]=1
// 执行planA(向下)到达下一步
// planABCD(下右上左)探测均失败
// 返回上一步，执行planb继续探索...

//5.最短路径：
//不同策略穷举：下右上左/下右左上/...
//图：深度优先广度优先的遍历->数据结构和算法

//test4：汉诺塔
class RecursionTest4{
    public static void main(String[] args){
        FF f = new FF();
        f.Hanio(3,'a','b','c');
    }
}
class FF{
    public void Hanio(int num,char a,char b,char c){
        if(num == 1){
            System.out.println(a + "->" + c);
        }else{
            //1.a小盘全部移到b(借助c)，b-num=num-1
            Hanio(num-1,a,c,b);
            //2.a的大盘移动到c
            System.out.println(a + "->" + c);
            //3.b所有盘全部移到c(借助a),
            Hanio(num-1,b,a,c);
        }
    }
}

////test5:八皇后
//class RecusionTest5{
//    public static void main(String[] args) {
//        int[][] arr = new int[8][8];
//
//    }
//}
////定义:0-空,1-放
///*策略：
//1.arr[0][0]=1
//2.arr[1][j]=1,循环判断是否可以放;arr[2][j]...
//3.得正确解，回溯第一个皇后的所有正确解
//
// */
//class GG{
//    public boolean queen(int[][] arr){
//        arr[0][0] = 1;
//        for(int i = 0;i < 8;i++){
//            for(int j = 0;j < 8;j++){
//                if(arr[i][j] == 1){
//                    for(int m = i;m < 8;m++){
//                        arr[m][i]=1;//当前皇后所在列均不能放
//                    }
//                    for(int n = j;n < 8;n++){
//                        arr[j][n]=1;//当前皇后所在行均不能放
//                    }
//                    for(int x = i,y = j;x < 7;x++,y++){
//                            arr[x+1][y+1] =1;//当前皇后所在斜线均不能放
//                    }
//                }
//            }
//        }
//
//    }
//}