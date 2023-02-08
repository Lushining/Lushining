package chapter04;
/*test1:计算可经过多少次路口(while break)
  某人有100,000元，每路过一次路口都需要缴费->循环
  1)现金>50,000,交5%
  2)现金<=50,000,交1000
*/
public class Hw04 {
    public static void main(String[] args){
        /*方法1：
          1.定义变量：money tax count
          2.分析循环：>50000/<=50000
          3.分析过滤：>=1000;否则跳出
        */
        double money1 = 100000;
        // double tax = 0;
        int count1 = 0;
        while(money1 > 50000){
            // tax = money * 0.05;
            // System.out.println("请缴费：" + tax + "元");
            money1 *= 0.95;
            count1++;
        }
        while(money1 <= 50000){
            // System.out.println("请缴费1000元");
            money1 -= 1000;
            count1++;
            if(money1 < 1000){
                // System.out.println("您的余额不足，请充值...");
                break;
            }
        }
        System.out.println("您一共可路过" + count1 +"次,余额" + money1 + "元");
        /*方法2：
          1.定义变量
          2.分析循环：无限循环(true)
          3.分析过滤：<1000/[1000,50000]/>50000
        */
        double money2 = 100000;
        int count2 = 0;
        while(true){
            if(money2 > 50000){
            money2 *= 0.95;
            count2++;
            }
            else if(money2 >= 1000){
                money2 -= 1000;
                count2++;
            }
            else{
                break;
            }
        }
        System.out.println("您一共可路过" + count2 +"次，余额" + money2 + "元");
    } 
}

//test2:判断一个整数的范围:>0/<0/=0
class Hw04t2{
    public static void main(String[] args){
        int number = 0;
        if(number < 0){
            System.out.println("这个数为负数");
        }
        else if(number == 0){
            System.out.println("这个数为零");
        }
        else{
            System.out.println("这个数为正数");
        }
    }
}

//test3：判断一个整数是否是水仙花数
/*水仙花数:三位数，各个位上的数字的立方和等于其本身
  1.定义变量
  2.得个十百千位：n%10 (n/10)%10 n/100
  3.求立方和
*/
class Hw04t3{
    public static void main(String[] args){
        int n = 153;
        int a = n / 100;
        int b = (n / 10)%10;
        int c = n % 10;
        if(n == a*a*a+b*b*b+c*c*c){
            System.out.println("这个数为水仙花数");
        }
        else{
            System.out.println("这个数不是水仙花数");
        }
    }
}
//test4：输出1-100之间不能被5整除的数，每五个一行
/*
  1.定义变量:n count
  2.分析循环：n=1，n<=100
  3.分析过滤：n%5 == 0
  4.考虑输出:System.out.print(ln)
*/
class Hw04t4{
    public static void main(String[] args){
        int count = 0;
        for(int n = 1;n <= 100;n++){
            if(n % 5 != 0){
                System.out.print(n + "\t");
                count++;
                if(count % 5 == 0){
                    System.out.println();
                }
            }
        }
    }
}

//test5：输出小写的a-z和大写Z-A
/*循环+unicode编码(int->char强制转换)
  1.'a-z'==[97,122],'b'='a'+1
  2.'Z-A'==[90,65],'Y'=='Z'-1
*/
class Hw04t5{
    public static void main(String[] args){
        for(int n = 97;n <= 122;n++){
            System.out.print((char)n + " ");
        }    
        System.out.println();
        for(int n = 90;n >= 65;n--){
            System.out.print((char)n + " ");
        }    
        System.out.println();
        //char的本质是一个整数，可以进行运算
        for(char a = 'a';a <= 'z';a++){
            System.out.print(a + " ");
        }   
        System.out.println();
        for(char b = 'Z';b >= 'A';b--){
            System.out.print(b + " ");
        }      
    }
}

//test6：求1-1/2+1/3-1/4...1/100
//1.定义变量：数字(1/n);和sum
//2.分析循环；n=1,n<=100,n++
//3.分析过滤：(n%2==0)奇数+，偶数-
//4.非整数得运算：D/D才能得到精确的小数
class Hw04t6{
    public static void main(String[] args){
        double sum = 0;
        for(int n = 1;n <= 100;n++){
            if(n % 2 != 0){
                sum += (1.0/n);
            }
            else{
                sum -= (1.0/n);
            }
        }
        System.out.print("1-1/2+1/3-1/4...1/100 = " + sum);
    }
}

//test7：求1+(1+2)+(1+2+3)+...(1+2+...+100)的和
//1.定义变量：sum=(),totalSum=()+()...
//2.分析循环：内循环得sum,外循环求sum和;
class Hw04t7{
    public static void main(String[] args){
        int sum = 0;
        for(int n = 1;n <= 100;n++){
            for(int m = 1;m <=n;m++){
                sum += m;
            }
        }
        System.out.println("totalSum=" + sum);
    }
}