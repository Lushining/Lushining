package chapter04;
/*˼·����������Ϊ��+�������
  1.����Ϊ�򣺲��������ʵ��
  2.����������->�������Ż�����
*/
import java.util.Scanner;
//test1��forѭ��
//��ӡ1~100��������9�ı�����������ͳ�Ƹ������ܺ�
public class Cycle{
    public static void main(String[] args){
        int count = 0;
        int sum = 0;
        int max = 200;//�ɸ����������
        int number = 7;//�ɸ����������
        for(int i = 1 ; i <= max ; i++){
            if(i % number == 0){
                System.out.println("�������У�"+i);
                count++;
                sum += i;    
            }
        }
        System.out.println("��������"+ count +"��");
        System.out.println("�����������ĺ�Ϊ"+ sum);
        //������б��ʽ
        int n = 5;
        for(int i = 0;i <= n;i++){
        //"+"&'+':�ַ���/���� 
        System.out.println(i + "+" + (n-i) + "=" + n);
        }
    }
}
//test2��whileѭ��
class CycleTest2{
    public static void main(String[] args){
        //1-m�ܱ�n����������ͳ�Ƹ������ܺ�
        int i = 1;
        int m =100;
        int n = 3;
        int count = 0;
        int sum = 0;
        while(i <= m){
            if(i % n == 0){
                System.out.println("�������У�" + i);
                count++;
                sum += i;
            }  
            i++;
        }
        System.out.println("count=" + count);
        System.out.println("sum=" + sum);
        //a-b֮�����е�ż��
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
//test3do..whileѭ��

class CycleTest3{
    public static void main(String[] args){
        //1.��ӡ1-100
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }while(i <= 100);
        //����1-100�ĺ�
        int a = 1;
        int b = 0;
        do{
            b += a;
            a++;
        }while(a <= 100);
        System.out.println(b);
        //3.ͳ��m-n�ܱ�x�������ܱ�y�����ĸ���
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

        //4.������������Ǯ��һֱ����ֱ��˵��Ǯ
        //ѭ����䣺��+�ش�
        //�ش��ü����������
        char answer = ' ';
        do{
            System.out.println("�㻹Ǯ��?y/n");
            Scanner myScanner = new Scanner(System.in);
            answer = myScanner.next().charAt(0);
            if(answer != 'y'){
                System.out.println("��һ��");
            }
        }while(answer != 'y');
        System.out.println("�յ�Ƿ���ηŹ�����");   
    }
}
// test4������ѭ��
//1.ͳ��������ɼ���ÿ�����ˣ������ƽ���ֺ����а༶ƽ����(����ɼ�)����ͳ�Ƽ�������
/*
1.1�������������(Scanner),�ɼ�(grade),�ܳɼ�(sum/generalSum)��ƽ����(sum/5,generalSunm/15)
1.2��ѭ�����������(b=1,b<=5)ѧ���ɼ�->�ܳɼ�(sum += grade)��ƽ����(sum/5)
1.3��ѭ�����������༶(a=1,a<=3)���ܳɼ���ƽ����(generalSum/5)
1.4ͳ�Ƽ����������������(passNum/generalPassNum)������(if{passNum++;})
1.5�Ż����������class=3 student5��
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
                System.out.println("�������" + a + "�����" + b +"��ѧ���ɼ���");
                double grade = myScanner.nextDouble();
                if(grade >= 60){
                    passNum++;
                }
                sum += grade;
            }
            System.out.println(a + "���ܳɼ�Ϊ��" + sum);
            System.out.println(a + "��ƽ����Ϊ��" + (sum / 5));
            System.out.println(a + "�༰������Ϊ��" + passNum);
            generalSum += sum;
            generalPassNum += passNum;
        }    
        System.out.println("�����༶�ܳɼ�ΪΪ��" + (generalSum));
        System.out.println("�����༶��ƽ����Ϊ��" + (generalSum / 15));
        System.out.println("�����༶�ܵļ�������Ϊ��" + generalPassNum);

    }
}

//test5��ӡ������������������ʾ������ӡ������
class CycleTest5{
    public static void main(String[] args){
        int num = 3;
        //1.��ӡһ������:for(ÿ��num��)
        for(int m=1;m <= num;m++){
            for(int n=1;n <= num;n++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2.��ӡ�����������
        //for��i��ʾ��i��-�������
        //for��j��ʾ"*"�ĸ���(j=i)-ͬ�����
        for(int i = 1;i <= num;i++){
            for(int j=1;j <= i;j++){
                System.out.print("*");//ͬ�����
            }
            System.out.println();//�������
        }
        //3.��ӡ������������
        //a��ʾ����
        //b��ʾ��" "�ĸ�����b=(num-a)
        //c��ʾ"*"�ĸ�����c=a*2-1
        for(int a = 1;a <= num;a++){
            for(int b=1;b <=(num - a);b++){
                System.out.print(" ");
            }
            for(int c=1;c <=(a * 2 -1);c++){
                System.out.print("*");
            }
            System.out.println();
        }
        //4.��ӡ���Ľ�����
        //x��ʾ����
        //y��ʾ��" "�ĸ�����y=(num-x)
        //z��ʾ���"*"��λ�ã�
        //��ǰ(num-1)�㣺��λ��ĩλ(z == 1 || z=x*2-1)
        //�����һ��(z)��ȫ�����*

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

//test6 :��ӡ�žų˷���
/*
1.a*b=c
2.��ѭ��(b)��for(b)-ͬ�����
3.��ѭ��(a)��for(a)-�������
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

