package chapter06;
//test1:数组
/*1.1遍历数组：
  定义类A01方法max，实现输出double数组最大值;
  优化1：确保数组有长度  #指定输出为包装类Double(double/null)
  优化2：确保数组不为空  #数组(引用数据类型)可赋值null
*/
//1.2数组查找：
/*定义类A02方法find，查找字符串数组并返回索引；若找不到返回-1
  细节1：定义index变量判断查找是否成功
  细节2：字符串的相等判断：String1.equals(String2)
  优化1：find(String findStr,String[] arr)  //形参列表替代键入
  优化2：健壮性(数组!=null/{})
 */
import java.util.Scanner;
import java.util.Random;
public class Hw06 {
    public static void main(String[] args){
        A01 a01 = new A01();
        double[] arr1 = {1,2.2,3,4.4};
        Double res1 = a01.max(arr1);
        if(res1 != null) {
            System.out.println("max=" + res1);
        }else{
            System.out.println("您的输入有误，请重新确认...");
        }

        A02 a02 = new A02();
        String[] arr2 = {"a","b","c","d"};
        int res2 = a02.find(arr2);
        if(res2 != -1) {
            System.out.println("index=" + res2);
        }else{
            System.out.println("找不到该字符串");
        }
    }
}
class A01{
    //包装类Double
    public Double max(double[] arr){
        if(arr != null && arr.length > 0){
            double max = arr[0];
            for(int i = 1;i <arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;//double值
        }
        else{
            return null;
        }
    }
}
class A02{
    public int find(String[] arr){
        int index = -1;
        System.out.println("请输入想要查询的字符串：");
        Scanner myScanner = new Scanner(System.in);
        String in = myScanner.next();
        for(int i = 0;i <arr.length;i++){
            if(in.equals(arr[i])){
                index = i;
            }
        }
        return index;
    }
}

//test2:构造器初始化属性、成员方法、this访问属性
/*更改某本书的价格:价格>150/100->150/100，否则不变
  细节：无参方法注直接访问属性（name == this.name）
 */
class Hw06Test2{
    public static void main(String[] args){
        Book book1 = new Book("哈利波特",800);
        book1.info();
        book1.updatePrice();
        book1.info();
    }
}
class Book{
    String name;
    double price;
    public Book(String name,double price){
        this.name = name;
        this.price = price;
    }
    public void updatePrice() {
        if (price > 150) {
            price = 150;
        } else if (price > 100) {
            price = 100;
        }
    }
    public void info(){
        System.out.println("name="+name + "  price="+price);
    }
}

//test3:数组复制，输入旧数组返回新数组(开辟新空间->遍历赋值)
class Hw06Test3{
    public static void main(String[] args){
        int[] oldArr = {1,2,3,4,5};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("旧数组如下");
        for(int i = 0;i < newArr.length;i++){
            System.out.print(oldArr[i]+" ");
        }
        System.out.println();
        System.out.println("新数组如下");
        for(int i = 0;i < newArr.length;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}
class A03{
    public int[] copyArr(int[] arr1){
        int[] arr2 = new int[arr1.length];
        for(int i = 0;i < arr2.length;i++){
            arr2[i] = arr1[i];
        }
        return arr2;
    }
}

//test4:计算圆的周长与面积
class Hw06Test4{
    public static void main(String[] args){
        Circle circle = new Circle(3);
        System.out.println("parameter="+circle.parameter());
        System.out.println("area="+circle.area());
    }
}
class Circle{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
    public double parameter(){
        return 2*Math.PI*radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}
//test5:四个方法求和差乘商(除数为零则报错)
//细节：包装类的运用
class Hw06Test5{
    public static void main(String[] args) {
        Cale cale = new Cale(1,0);
        System.out.println("sum="+cale.sum());
        System.out.println("difference="+cale.difference());
        System.out.println("multiple="+cale.multiple());
        if(cale.division() != null) {
            System.out.println("division=" + cale.division());
        }
    }
}
class Cale{
    double num1;
    double num2;
    public Cale(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double sum(){
        return num1+num2;
    }
    public double difference(){
        return num1-num2;
    }
    public double multiple(){
        return num1*num2;
    }
    public Double division(){
        if(num2 == 0) {
            System.out.println("警告：除数不能为零");
            return null;
        }
        else{
            return num1/num2;
        }
    }
}
class Hw06Test6{
    public static void main(String[] args) {
        Dog dog = new Dog("小黄","黄色",3);
        dog.show();
    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name,String color,int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("name="+name);
        System.out.println("color="+color);
        System.out.println("age="+age);
    }
}

//匿名对象：new Test().count1  #堆创建空间不返回栈地址，语句结束则销毁
//test7:
class Hw06Test7{
    public static void main(String[] args){
        Music music = new Music("向天再借五百年",180);
        music.play();
        music.getInfo();
    }
}
class Music{
    String name;
    int times;
    public Music(String name,int times){
        this.name = name;
        this.times = times;
    }
    public void play(){
        System.out.println("为您播放歌曲："+name);
    }
    public void getInfo(){
        System.out.println("歌曲"+name+"时长"+times);
    } //return "歌曲"+name+"时长"+times；（String）
}

//Test8：
//1.构造器重载：同名不同形参列表(参数个数/顺序/类型)
//2.构造器复用：this调用构造器(在构造器中使用且必须为第一条语句)
class Hw06Test8{
    public static void main(String[] args){
        Employee p1 = new Employee("Amy",'女',35,
                "总经理",25000);
        Employee p2 = new Employee("lily",'男',58);
        Employee p3 = new Employee("保洁",3500);
    }
}
class Employee{
    String name;
    char gender;
    int age;
    String position;
    double wage;
    public  Employee(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public  Employee(String position,double wage){
        this.position=position;
        this.wage=wage;
    }
    public Employee(String name, char gender,int age,
                    String position,double wage){
        this(name,gender,age);
        this.position=position;
        this.wage=wage;
    }
}

//test9:将对象作为参数传递给方法
/*
1.Circle类
 */
class Hw06Test9{
    public static void main(String[] args){
        NewCircle c1 = new NewCircle(3);
        System.out.println("area="+c1.findArea());

        NewCircle c2 = new NewCircle();
        PassObject p = new PassObject();
        p.printAreas(c2,5);
    }
}
class NewCircle {
    double radius;
    public NewCircle(){}
    public NewCircle(double radius) {
        this.radius = radius;
    }
    public double findArea() {
        return Math.PI * radius * radius;
    }
    public void change(double radius){
        this.radius = radius;
    }
}
class PassObject{
    public void printAreas(NewCircle c,int times){
        System.out.print("Radius\tArea");
        System.out.println();
        for(double i = 1;i <= times;i++){
            c.change(i);//调用方法修改属性
            //c.radius = i 直接修改属性
            c.findArea();
            System.out.println(i + "\t" + c.findArea());
        }
    }
}

//test10：玩家和电脑猜拳，限制比赛局数，显示输赢清单与最终获胜结果
/*
编写类：
1.定义参数：玩家出拳情况、电脑出拳情况、比赛局数(1)、获胜次数(0)
2.成员方法：玩家键入出拳情况；电脑随机产生出拳情况；比赛结果判断；比赛局数自增；获胜次数过滤+自增
主方法：创建类对象
1.定义参数：比赛局数、最终结果(获胜次数)
          输赢清单(二维数组记录比赛局数、玩家与电脑出拳情况)
          比赛结果(一维数组记录比赛结果)
2.循环比赛更新参数
3.输出结果
二维数组记录局数与出拳情况；一维数组记录每轮比赛结果；输出最终结果
 */
class Hw06Test10{
    public static void main(String[] args){
    //创建对象
        Tom t = new Tom();
    //定义比赛次数
        int gameCount = 2;
    //记录最终比赛结果
        int winCount = 0;
    //二维数组接收玩家和电脑的出拳情况；
        int[][] arrOut = new int [gameCount][3];
        int j = 0;
    //一维数组接收输赢情况；
        String[] arrRes = new String [gameCount];
    //循环猜拳比赛
        for(int i = 0;i < gameCount;i ++){
            //获取局数与玩家和电脑的出拳情况并写入二维数组
            arrOut[i][j+1]=t.tom();
            arrOut[i][j+2]=t.computer();
            arrOut[i][j] = t.gameNum();
            //获取三轮比赛结果并写入一维数组
            arrRes[i]=t.res();
            //输出每一局赢的情况
            System.out.println("===========================");
            System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
            System.out.println(t.gameNum+"\t"+t.tom+"\t\t"+t.computer+"\t\t"+t.res());
            System.out.println("===========================");

        }
        //输出最终结果
        System.out.println("局数\t玩家出拳\t电脑出拳\t输赢情况");
        //打印二维数组：显示局数与出拳情况
        for(int m = 0;m < arrOut.length;m++){
            for(int n = 0;n < arrOut[m].length;n++){
                System.out.print(arrOut[m][n]+"\t\t");
            }
            //打印一维数组：显示比赛结果
            System.out.print(arrRes[m]);
            System.out.println();
        }
        for(int x = 0;x < arrRes.length;x++) {
            winCount = t.winNum(arrRes[x]);
        }
        System.out.println("您共获胜"+winCount+"次");
    }
}
class Tom{
    //玩家出拳类型
    int tom;
    //电脑出拳类型
    int computer;
    //比赛次数
    int gameNum=0;
    //玩家获胜次数
    int winNum=0;
    public int computer(){
        Random r = new Random();
        computer = r.nextInt(3);//[0,3)
        return computer;
    }
    public int tom(){
        System.out.println("请出拳(0-拳头,1-剪刀,2-布)：");
        Scanner myScanner = new Scanner(System.in);
        tom = myScanner.nextInt();
        if(tom > 2 || tom <0){
            System.out.println("您的输入有误");
        }
        return tom;
    }
    public String res(){
        if(tom == 0 && computer == 1){
            return "you won";
        }
        else if(tom == 1 && computer == 2){
            return "you won";
        }
        else if(tom == 1 && computer == 0){
            return "you won";
        }
        else if(tom == computer){
            return "a tie";
        }
        else{
            return "you failed";
        }
    }
    public int gameNum(){
        return ++gameNum;
    }
    public int winNum(String res){
        if(res.equals("you won")){
            winNum++;
        }
        return winNum;
    }
}





