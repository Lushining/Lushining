package chapter06;

import java.util.Scanner;
//test1：实例化一只猫(类->对象)
public class ClassAndObject {
    public static void main(String[] args){
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        System.out.print("第一只猫信息如下："+cat1.name+" "
        +cat1.age+" "+cat1.color);
        System.out.println();
        System.out.print("第二只猫信息如下："+cat2.name+" "
        +cat2.age+" "+cat2.color);
    }
}
class Cat{
    String name;
    int age;
    String color;
}

//test2：成员方法:创建方法-创建对象-调用方法
class Ct06Test2{
    public static void main(String[] args){//栈：main空间
        Person p1 = new Person();//堆：开辟一个对象空间
        p1.speak();
        p1.cal01();
        p1.cal02(2);
        p1.getSum01();
        int return_sum = p1.getSum02(1,2);
        System.out.println("return_sum=" + return_sum);
    }
}
class Person{
    int age;
    String name;
    public void speak(){
        System.out.println("我是一个好人");
    }
    public void cal01(){
        int sum = 0;
        for(int i = 1;i <= 1000;i++){
            sum += i;
        }
        System.out.println("sum="+sum);
    }
    public void cal02(int n){
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum += i;
        }
        System.out.println("cal02计算结果为："+sum);
    }
    public void getSum01(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int n1 = myScanner.nextInt();
        System.out.println("请输入第二个数：");
        int n2 = myScanner.nextInt();
        System.out.println("gS01两数之和为："+(n1+n2));
    }
    public int getSum02( int num1,int num2) {//栈：getSum02空间
        int sum = num1 + num2;
        return sum;
    }
}
//JVM使用方法内存分析
//public static void main(String[] args)//栈：main空间
//Person p1 = new Person();//堆：对象
//int return_sum = p1.getSum02(1,2);//跳转至自定义方法并顺序赋值->=30
//System.out.println("return_sum=" + return_sum);//结束程序释放main空间

//public int getSum02( int num1,int num2)
//栈：getSum02空间：num1->10，num2->20
//int sum = num1 + num2;//栈：gS02：sum->30
//return sum;//结果返回至调用的方法，并释放gS02空间


//test3：输出二维数组
class Ct06Test3{
    public  static void main(String[] args){
        int[][] arr ={{0,0,1},{1,1,1},{1,1,3}};
        MyTools tool = new MyTools();
        tool.output(arr);
    }
}
class MyTools{
    public void output(int[][] arr){
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[i].length;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

//Test4：成员方法最多一个返回值，利用数组返回多个值
class Ct06Test4 {
    public static void main(String[] args) {
        AA a = new AA();
        int[] res = a.getSumAndSub(1, 4);
        System.out.println("两数之和为" + res[0]);
        System.out.println("两数之差为" + res[1]);}
}
class AA{
    public int[] getSumAndSub(int n1,int n2){
        int[] arr = new int[2];
        arr[0] = n1 + n2;
        arr[1] = n1 - n2;
        return arr;
    }
}

//Test5：
//1.判断一个数是奇数odd还是偶数even，返回boolean
//2.根据行、列、字符打印 对应行数和列数的字符（4，4，#）
class Ct06Test5{
    public static void main(String[] args){
        BB b1 = new BB();
        boolean res = b1.oddOrEven(2);
        if(res == true){
            System.out.println("这个数是奇数");
        }
        else {
            System.out.println("这个数是偶数" );
        }
        BB b2 = new BB();
        b2.print(4,4,'#');
    }
}
class BB{
    public boolean oddOrEven(int n){
        if(n % 2 != 0){
            return true;
        }
        else{
            return false;
        }
        //return n % 2 != 0 ? true:false;//三元运算符
        //return n % 2 != 0;//关系运算符输出boolean
    }
    public void print(int row,int col,char c){
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

//Test6：copyPerson，复制一个Person对象
class Ct06Test6{
    public static void main(String[] args){
        PersonTest6 p1 = new PersonTest6();
        p1.age = 22;
        p1.name = "卢诗宁";
        PersonTest6 p2 = new PersonTest6();
        p2 = p2.copyPerson(p1);
        System.out.println("p1信息如下："+p1.name+p1.age);
        System.out.print("p2信息如下:" + p2.name + p2.age);
    }
}
class PersonTest6{
    String name;
    int age;
    public PersonTest6 copyPerson(PersonTest6 p) {
        PersonTest6 p2 = new PersonTest6();
        p2.name = p.name;
        p2.age = p.age;
        return p2;
    }
}

//test7；递归方法




