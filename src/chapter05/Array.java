package chapter05;

import java.util.Scanner;
//test1:计算一个数组的和和平均值
//计算六只鸡的总体重和平均体重
public class Array {
    public static void main(String[] args){
        double[] hens = {3 , 5, 1 , 3.4 , 2 , 50,49.9};
        double sum = 0;
        for(int i = 0;i < hens.length;i++){
            System.out.println("第" + (i+1) + "只鸡的体重为" + hens[i]);
            sum += hens[i];  //i∈[0,i-1]
        }
        System.out.println("sum=" + sum + "\n" + "average=" + (sum/6));
        System.out.println("共有" + hens.length + "只鸡");
    } 
}
//test2:循环输入元素到数组并输出
class ArrayTest2{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        double[] grades = new double[5]; 
        //静态化使用
        //1.遍历输入
        for(int i = 0;i < grades.length;i++){
            System.out.println("请输入第"+(i+1)+"个成绩：");
            grades[i] = myScanner.nextDouble();
        }
        System.out.println(grades);
        //2.遍历输出：
        for(int i = 0;i < grades.length;i++){
            System.out.println("第"+(i+1)+"个成绩为："+grades[i]);
        }
        //动态化使用
        //int[] a;声明一个数组，不占用内存
        //a = new int[3];分配内存空间可存放数据

    }
}
//test3:数组应用
class ArrayTest3{
    public static void main(String[] args){
    // 1.创建char[]放置A-Z,循环访问并打印所有元素。
        char[] array1 = new char[26];
        for(char n = 0;n < array1.length;n++){
            array1[n] =(char)('A' + n);  
        }
        for(int m = 0;m < array1.length;m++){
            System.out.print(array1[m] + " ");
        }
        System.out.println();

    //2.求取int[]的最大值{4.-1,9,0,23},并得到对应下标；
        //方法1:if过滤
        int[] array2 = {4,-1,9,0,23};
        int max = 0;
        int num = 0;
        if(array2[0] >= array2[1]){
            max = array2[0];
            num = 0;
        }
        else{
            max = array2[1];
            num = 1;
        }
        if(array2[2] > max){
            max = array2[2];
            num = 2;
        }
        if(array2[3] > max){
            max = array2[3];
            num = 3;
        }
        if(array2[4] > max){
            max = array2[4];
            num = 4;
        }
        System.out.print("max=" + max + "  num=" + num);
        System.out.println();
        //方法2:for优化
        int[] array3 = {4,-1,9,0,23,110,-23,67,888};
        int max2 = array3[0];
        int num2 = 0;
        for(int i = 0;i < array3.length;i++){
            if(array3[i] > max2){
                max2 = array3[i];
                num2 = 1;
            }
        }
        System.out.print("max=" + max2 + "  num=" + num2);
    }
}

//Test4数组拷贝且要求数据空间独立
//1.开辟新的空间：new
//2.值传递：遍历赋值
class ArrayTest4{
    public static void main(String[] args){
        int[] array1 = {10,20,30};
        int[] array2 = new int[array1.length];
        for(int i = 1;i < array1.length;i++){
            array2[i] = array1[i];
        }
    }
}
//Teest5数据反转：
class ArrayTest5{
    public static void main(String[] args){
        //方法1：同一个数组寻找规律反转
        /*1.定义变量：反转次数(len/2)、数组长度(len)、首个被互换的元素(swap)
          2.确定互换元素：[i],[len-1-i]
          3.遍历实现
        */
        int[] array = {11,22,33,44,55,66};
        int len = array.length;
        for(int i = 0;i < len/2;i++){
            int swap = array[i];
            array[i] = array[len - 1 - i];
            array[len - 1 -i] = swap;
        }
        for(int j = 0;j < len;j++){
            System.out.print(array[j] + " ");    
        }
        System.out.println();    
        
        /*方法2：
          1.新建数组array2逆序遍历赋值，
          2.1地址->2数据空间地址；#原先1的数据空间被清除
        */
        int[] array1 = {11,22,33,44,55,66};
        int len1 = array1.length;
        int[] array2 = new int[len1];
        for(int m = 0;m < len1;m++){
            array2[m] = array1[len1 -1 -m];
        }
        array1 = array2;
        for(int n = 0;n < len1;n++){
            System.out.print(array1[n] + " ");    
        }

    }
}

//test6:数组添加
//{1,2,3}-键入添加？->{1,2,3,？}->添加成功，是否继续(y/n)
class ArrayTest6{
    public static void main(String[] args){
        /*1.定义新数组，长度=array.length+1
          2.新数组的值添加:原数组赋值+键入赋值
          3.分析循环：无限循环(true)，直到键入n

        */
        int[] array = {1,2,3};
        Scanner myScanner = new Scanner(System.in);
        int[] array2;
        int num = array.length;
        while(true){
            num += 1;
            array2= new int[num];
            for(int j = 0;j < array.length;j++){
                array2[j] = array[j];
            }
            System.out.println("请输入想要添加的数：");
            int addNum = myScanner.nextInt();
            System.out.println("正在为您添加：" + addNum);
            array2[num - 1] = addNum;
            array = array2;
            System.out.println("当前数组为：");
            for(int i = 0;i < array.length;i++){
            System.out.print(array2[i] + " ");    
            }
            System.out.println();
            System.out.println("添加成功，是否继续?(y/n)");
            char answer = myScanner.next().charAt(0);
            if(answer == 'n'){
                break;
            }
        }
        System.out.println("程序结束..");
    }
}
//test7:数组缩减{1,2,3,4,5}
//提示用户是否继续缩减，每次缩减到哪个元素
//当只剩最后一个元素，提示不能再缩减
class ArrayTest7{
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        Scanner myScanner = new Scanner(System.in);
        // int[] newArray;
        int num = array.length;
        while(true){
            System.out.println("是否要进行缩减?(y/n)");
            char answer = myScanner.next().charAt(0);
            if(answer != 'y'){
                System.out.println("当前最后一个元素为：" + array[num-1]);
                System.out.print("当前数组为：");
                for(int i = 0;i < num;i++){
                System.out.print(array[i] + " ");    
                }
                System.out.println();       
                break;
            }
            num -= 1;
            int[] newArray = new int[num];
            for(int j = 0;j < num;j++){
                newArray[j] = array[j];
            }
            array = newArray;
            System.out.println("当前最后一个元素为：" + array[num-1]);
            if(num <= 1){
                System.out.println("不能继续缩减..");
            }
        }
        System.out.println("程序结束..");
    }
}


