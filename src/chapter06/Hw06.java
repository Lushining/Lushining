package chapter06;
//test1:����
/*1.1�������飺
  ������A01����max��ʵ�����double�������ֵ;
  �Ż�1��ȷ�������г���  #ָ�����Ϊ��װ��Double(double/null)
  �Ż�2��ȷ�����鲻Ϊ��  #����(������������)�ɸ�ֵnull
*/
//1.2������ң�
/*������A02����find�������ַ������鲢�������������Ҳ�������-1
  ϸ��1������index�����жϲ����Ƿ�ɹ�
  ϸ��2���ַ���������жϣ�String1.equals(String2)
  �Ż�1��find(String findStr,String[] arr)  //�β��б��������
  �Ż�2����׳��(����!=null/{})
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
            System.out.println("������������������ȷ��...");
        }

        A02 a02 = new A02();
        String[] arr2 = {"a","b","c","d"};
        int res2 = a02.find(arr2);
        if(res2 != -1) {
            System.out.println("index=" + res2);
        }else{
            System.out.println("�Ҳ������ַ���");
        }
    }
}
class A01{
    //��װ��Double
    public Double max(double[] arr){
        if(arr != null && arr.length > 0){
            double max = arr[0];
            for(int i = 1;i <arr.length;i++){
                if(arr[i] > max){
                    max = arr[i];
                }
            }
            return max;//doubleֵ
        }
        else{
            return null;
        }
    }
}
class A02{
    public int find(String[] arr){
        int index = -1;
        System.out.println("��������Ҫ��ѯ���ַ�����");
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

//test2:��������ʼ�����ԡ���Ա������this��������
/*����ĳ����ļ۸�:�۸�>150/100->150/100�����򲻱�
  ϸ�ڣ��޲η���עֱ�ӷ������ԣ�name == this.name��
 */
class Hw06Test2{
    public static void main(String[] args){
        Book book1 = new Book("��������",800);
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

//test3:���鸴�ƣ���������鷵��������(�����¿ռ�->������ֵ)
class Hw06Test3{
    public static void main(String[] args){
        int[] oldArr = {1,2,3,4,5};
        A03 a03 = new A03();
        int[] newArr = a03.copyArr(oldArr);
        System.out.println("����������");
        for(int i = 0;i < newArr.length;i++){
            System.out.print(oldArr[i]+" ");
        }
        System.out.println();
        System.out.println("����������");
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

//test4:����Բ���ܳ������
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
//test5:�ĸ�������Ͳ����(����Ϊ���򱨴�)
//ϸ�ڣ���װ�������
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
            System.out.println("���棺��������Ϊ��");
            return null;
        }
        else{
            return num1/num2;
        }
    }
}
class Hw06Test6{
    public static void main(String[] args) {
        Dog dog = new Dog("С��","��ɫ",3);
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

//��������new Test().count1  #�Ѵ����ռ䲻����ջ��ַ��������������
//test7:
class Hw06Test7{
    public static void main(String[] args){
        Music music = new Music("�����ٽ������",180);
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
        System.out.println("Ϊ�����Ÿ�����"+name);
    }
    public void getInfo(){
        System.out.println("����"+name+"ʱ��"+times);
    } //return "����"+name+"ʱ��"+times����String��
}

//Test8��
//1.���������أ�ͬ����ͬ�β��б�(��������/˳��/����)
//2.���������ã�this���ù�����(�ڹ�������ʹ���ұ���Ϊ��һ�����)
class Hw06Test8{
    public static void main(String[] args){
        Employee p1 = new Employee("Amy",'Ů',35,
                "�ܾ���",25000);
        Employee p2 = new Employee("lily",'��',58);
        Employee p3 = new Employee("����",3500);
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

//test9:��������Ϊ�������ݸ�����
/*
1.Circle��
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
            c.change(i);//���÷����޸�����
            //c.radius = i ֱ���޸�����
            c.findArea();
            System.out.println(i + "\t" + c.findArea());
        }
    }
}

//test10����Һ͵��Բ�ȭ�����Ʊ�����������ʾ��Ӯ�嵥�����ջ�ʤ���
/*
��д�ࣺ
1.�����������ҳ�ȭ��������Գ�ȭ�������������(1)����ʤ����(0)
2.��Ա��������Ҽ����ȭ������������������ȭ�������������жϣ�����������������ʤ��������+����
�����������������
1.����������������������ս��(��ʤ����)
          ��Ӯ�嵥(��ά�����¼�����������������Գ�ȭ���)
          �������(һά�����¼�������)
2.ѭ���������²���
3.������
��ά�����¼�������ȭ�����һά�����¼ÿ�ֱ��������������ս��
 */
class Hw06Test10{
    public static void main(String[] args){
    //��������
        Tom t = new Tom();
    //�����������
        int gameCount = 2;
    //��¼���ձ������
        int winCount = 0;
    //��ά���������Һ͵��Եĳ�ȭ�����
        int[][] arrOut = new int [gameCount][3];
        int j = 0;
    //һά���������Ӯ�����
        String[] arrRes = new String [gameCount];
    //ѭ����ȭ����
        for(int i = 0;i < gameCount;i ++){
            //��ȡ��������Һ͵��Եĳ�ȭ�����д���ά����
            arrOut[i][j+1]=t.tom();
            arrOut[i][j+2]=t.computer();
            arrOut[i][j] = t.gameNum();
            //��ȡ���ֱ��������д��һά����
            arrRes[i]=t.res();
            //���ÿһ��Ӯ�����
            System.out.println("===========================");
            System.out.println("����\t��ҳ�ȭ\t���Գ�ȭ\t��Ӯ���");
            System.out.println(t.gameNum+"\t"+t.tom+"\t\t"+t.computer+"\t\t"+t.res());
            System.out.println("===========================");

        }
        //������ս��
        System.out.println("����\t��ҳ�ȭ\t���Գ�ȭ\t��Ӯ���");
        //��ӡ��ά���飺��ʾ�������ȭ���
        for(int m = 0;m < arrOut.length;m++){
            for(int n = 0;n < arrOut[m].length;n++){
                System.out.print(arrOut[m][n]+"\t\t");
            }
            //��ӡһά���飺��ʾ�������
            System.out.print(arrRes[m]);
            System.out.println();
        }
        for(int x = 0;x < arrRes.length;x++) {
            winCount = t.winNum(arrRes[x]);
        }
        System.out.println("������ʤ"+winCount+"��");
    }
}
class Tom{
    //��ҳ�ȭ����
    int tom;
    //���Գ�ȭ����
    int computer;
    //��������
    int gameNum=0;
    //��һ�ʤ����
    int winNum=0;
    public int computer(){
        Random r = new Random();
        computer = r.nextInt(3);//[0,3)
        return computer;
    }
    public int tom(){
        System.out.println("���ȭ(0-ȭͷ,1-����,2-��)��");
        Scanner myScanner = new Scanner(System.in);
        tom = myScanner.nextInt();
        if(tom > 2 || tom <0){
            System.out.println("������������");
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





