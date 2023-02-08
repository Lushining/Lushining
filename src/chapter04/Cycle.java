package chapter04;
/*思路分析：化繁为简+先死后活
  1.化繁为简：拆分需求逐步实现
  2.先死后活：常量->变量，优化程序
*/
import java.util.Scanner;
//test1：for循环
//打印1~100间所有是9的倍数的整数，统计个数及总和
public class Cycle{
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        int max = 200;//可根据需求更改
        int number = 7;//可根据需求更改
        for(int i = 1 ; i <= max ; i++){
            if(i % number == 0){
                System.out.println("整数倍有："+i);
                count++;
                sum += i;    
            }
        }
        System.out.println("整数倍共"+ count +"个");
        System.out.println("所有整数倍的和为"+ sum);
        //输出下列表达式
        int n = 5;
        for(int i = 0;i <= n;i++){
        //"+"&'+':字符串/数字 
        System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
//test2：while循环
class CycleTest2{
    public static void main(String[] args){
        //1-m能被n整除的数，统计个数与总和
        int i = 1;
        int m =100;
        int n = 3;
        int count = 0;
        int sum = 0;
        while(i <= m){
            if(i % n == 0){
                System.out.println("整数倍有：" + i);
                count++;
                sum += i;
            }  
            i++;
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        //a-b之间所有的偶数
        int a = 40;
        int b = 200;
        while(a <= b){
            if(a % 2 == 0){
                System.out.println(a);
            }
            a++;
        }
    }
}
//test3do..while循环

class CycleTest3{
    public static void main(String[] args){
        //1.打印1-100
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 100);
        //计算1-100的和
        int a = 1;
        int b = 0;
        do{
            b += a;
            a++;
        }while(a <= 100);
        System.out.println(b);
        //3.统计m-n能被x整除不能被y整除的个数
        int m = 1;
        int n = 200;
        int x = 5;
        int y = 3;
        int count = 0;
        do{
            if((m % x == 0) && (m % y != 0)){
                count++;
            }
            m++;
        }while(m <= n);
        System.out.println("count=" + count);

        //4.问李三还不还钱，一直打他直到说还钱
        //循环语句：问+回答
        //回答用键盘输入语句
        char answer = ' ';
        do{
            System.out.println("你还钱吗?y/n");
            Scanner myScanner = new Scanner(System.in);
            answer = myScanner.next().charAt(0);
            if(answer != 'y'){
                System.out.println("打一顿");
            }
        }while(answer != 'y');
        System.out.println("收到欠款，这次放过你了");   
    }
}
// test4：多重循环
//1.统计三个班成绩，每班五人，求各班平均分和所有班级平均分(键入成绩)，并统计及格人数
/*
1.1定义变量：键入(Scanner),成绩(grade),总成绩(sum/generalSum)，平均分(sum/5,generalSunm/15)
1.2内循环：键入五次(b=1,b<=5)学生成绩->总成绩(sum += grade)和平均分(sum/5)
1.3外循环：求三个班级(a=1,a<=3)的总成绩和平均分(generalSum/5)
1.4统计及格人数：定义变量(passNum/generalPassNum)并过滤(if{passNum++;})
1.5优化：定义变量class=3 student5；
*/
class CycleTest4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double sum = 0.0;
        int passNum = 0;
        double generalSum = 0.0;
        int generalPassNum = 0 ;
        for(int a = 1;a <= 3;a++){
            for(int b = 1;b <= 5;b++){
                System.out.println("请输入第" + a + "个班第" + b +"个学生成绩：");
                double grade = myScanner.nextDouble();
                if(grade >= 60){
                    passNum++;
                }
                sum += grade;
            }
            System.out.println(a + "班总成绩为：" + sum);
            System.out.println(a + "班平均分为：" + (sum / 5));
            System.out.println(a + "班及格人数为：" + passNum);
            generalSum += sum;
            generalPassNum += passNum;
        }    
        System.out.println("三个班级总成绩为为：" + (generalSum));
        System.out.println("三个班级的平均分为：" + (generalSum / 15));
        System.out.println("三个班级总的及格人数为：" + generalPassNum);

    }
}

//test5打印金字塔：接收整数表示层数打印金字塔
class CycleTest5{
    public static void main(String[] args){
        int num = 3;
        //1.打印一个矩形:for(每层num个)
        for(int m=1;m <= num;m++){
            for(int n=1;n <= num;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2.打印半个金字塔：
        //for：i表示第i层-换行输出
        //for：j表示"*"的个数(j=i)-同行输出
        for(int i = 1;i <= num;i++){
            for(int j=1;j <= i;j++){
                System.out.print("*");//同行输出
            }
            System.out.println();//换行输出
        }
        //3.打印整个金字塔：
        //a表示层数
        //b表示首" "的个数：b=(num-a)
        //c表示"*"的个数：c=a*2-1
        for(int a = 1;a <= num;a++){
            for(int b=1;b <=(num - a);b++){
                System.out.print(" ");
            }
            for(int c=1;c <=(a * 2 -1);c++){
                System.out.print("*");
            }
            System.out.println();
        }
        //4.打印空心金字塔
        //x表示层数
        //y表示首" "的个数：y=(num-x)
        //z表示输出"*"的位置：
        //①前(num-1)层：首位和末位(z == 1 || z=x*2-1)
        //②最后一层(z)：全部输出*

        for(int x = 1;x <= num;x++){
            for(int y=1;y <=(num - x);y++){
                System.out.print(" ");
            }
            for(int z=1;z <=(x * 2 -1);z++){
                if(z == 1 || z == (x * 2 - 1) || x == num){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

//test6 :打印九九乘法表
/*
1.a*b=c
2.内循环(b)：for(b)-同行输出
3.外循环(a)：for(a)-换行输出
*/
class CycleTest6{
    public static void main(String[] args){
        for(int a = 1;a <= 9;a++){
            for(int b=a;b<=9;b++){
                int c = a * b;
                System.out.print(a + "*" + b + "=" + c + "\t");
            }   
            System.out.println();   
        }
    }
}

