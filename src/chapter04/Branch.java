package chapter04;
//test1����֧���������䣬����18�����"�������"
import java.util.Scanner;
public class Branch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������������䣺");
        int age = myScanner.nextInt();
        if(age>18){
        System.out.println("��ϲ������ˣ�");
        }
        System.out.println("�������...");
    } 
}
//test2˫��֧���������"���ź����㻹δ����..."
class Test2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("��������������");
        int age = myScanner.nextInt();
        if(age>18){
            System.out.println("��ϲ������ˣ�");
        }
        else{
            System.out.println("���ź��㻹δ����...");
        }
        System.out.println("�������...");
    } 
}
//test3����֧��˫��֧
class Test3 {
    public static void main(String[] args){
    /*
    1.��������double����ֵ
      �жϵ�һ��������10.0���ҵڶ���С��20.0����ӡ������
    */
        double a = 15;
        double b = 16;
        if(a > 10.0 && b < 20.0){
         System.out.println("a+b ="+ (a + b));
        }
    /*
    2.��������int���жϺ��Ƿ��ܱ�3��5����
    */
        int c = 15;
        int d = 20;
        int e = c + d;
        if(e % 3 == 0 && e % 5 == 0){
            System.out.println("??????????3??5????");
        }
        else{
            System.out.println("????????????3??5????");
        }
    /*
    3.�ж�����Ƿ�Ϊ����
      ���꣺��4��������100����/��400����
    */
        int year =2023;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("����������");
        }
        else{
            System.out.println("���겻������");
        }
    } 
}
/*test4:���֧
  �����������������û���
  1.100->���ü���
  2.(80.99]->��������
  3.[60,80)->����һ��
  4.����->���ò�����
  5.���벻Ϊ������"hello"->�쳣�������
*/
class Test4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�������������û�����(1-100)��");
        int score = myScanner.nextInt();
        if(score >=1 && score <= 100){
            if(score == 100){
                System.out.println("���ü���");
            }
            else if(score >80 && score <= 99){
                System.out.println("��������");
            }
            else if(score >=60 && score <= 80){
                System.out.println("����һ��");
            }
            else{
                System.out.println("���ò�����");
            }
        }
        else{
            System.out.println("������������������ȷ��...");
        }
    }
}
//test5Ƕ�׷�֧
/*���ֱ���
  1.�����ɼ�>8.0�����������������ʾ��̭
  2.???????????????????????
  3.??????????????????????
*/
class Test5{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�ഺ�������ĳ����ɼ�");
        double score = myScanner.nextDouble();
        if(score > 8.0){
            System.out.println("��ϲ���ѳɹ��������");
            //String->char
            System.out.println("�����������Ա�");
            char gender = myScanner.next().charAt(0);
            if(gender == '��'){
                System.out.println("��������������");
            }
            else if(gender == 'Ů'){
                System.out.println("�������ΪŮ����");
            }
            else{
                System.out.println("������������������ȷ��...");
            }
        }
        else{
            System.out.println("���ź�������̭��...");
        }
    }
}
//test6Ƕ�׷�֧
/*���ݵ��������·ݺ������ӡƱ��Ŷ
1.����(4-10):
  ����(18-60):60
  ��ͯ(<18):1/2
  ����(>60):1/3
2.����������40������20
*/   
class Test6{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�����뵱ǰ����");
        int month = myScanner.nextInt();
        if(month >= 4 && month <= 10){
            System.out.println("��ǰΪ����");
            System.out.println("��������������");
            int age = myScanner.nextInt();
            if(age < 18){
                System.out.println("����Ʊ��Ϊ30Ԫ");
            }
            else if(age >= 18 & age <= 60){
                System.out.println("����Ʊ��Ϊ60Ԫ");
            }
            else if(age > 60){
                System.out.println("����Ʊ��Ϊ20Ԫ");
            }
        }
        else if((month >= 1 && month < 4) || (month > 10 && month <=12)){
            System.out.println("��ǰΪ����");
            System.out.println("��������������");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("����Ʊ��Ϊ40Ԫ");
            }
            else{
                System.out.println("����Ʊ��Ϊ20Ԫ");
            }
        }
        else{
            System.out.println("������������������ȷ��...");
        }
    }
}
//test7switch��֧
/*
1.?����һ���ַ���a,b,c,d,e,f,g
2.a->����һ��b->���ڶ�....
3.�����û�������ʾ��Ӧ��Ϣ
*/
class Test7{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ���ַ�(a-g)");
        char receive = myScanner.next().charAt(0);
        switch(receive){
            case 'a':
            System.out.println("����һ");
            break;
            case 'b':
            System.out.println("���ڶ�");
            break;
            case 'c':
            System.out.println("������");
            break;
            case 'd':
            System.out.println("������");
            break;
            case 'e':
            System.out.println("������");
            break;
            case 'f':
            System.out.println("������");
            break;
            case 'g':
            System.out.println("������");
            break;
            default:
            System.out.println("������������������ȷ��...");
            break;
        }
        System.out.println("����������˳�swith");

    }
}
//test8:switch
//Сдcharת����д��ֻת��a-e,�������other
class Test8{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("������һ��Сд�ַ�(a-e)");
    char small = myScanner.next().charAt(0);
    switch(small){
        case 'a':
            System.out.println("A");
            break;
        case 'b':
            System.out.println("B");
            break;
        case 'c':
            System.out.println("C");
            break;
        case 'd':
            System.out.println("D");
            break;
        case 'e':
            System.out.println("E");
            break;
        default:
            System.out.println("other");
    }
    System.out.println("����������˳�switch...");
    }
}
//test9Ƕ�׷�֧��˫��֧+switch
//ѧ���ɼ�>60����ϸ�60������60������ϸ�������ɼ�������100
class Test9{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("���������ĳɼ�(0-100)");
        double score = myScanner.nextDouble();
        //case�ĳ���ֵ�������ͱ���Ϊ��byte/short/int/char/enum/String
        if(score >= 0 && score <=100){
            switch((int)score/60){
                case 1:
                    System.out.println("???");
                    break;
                case 0:
                    System.out.println("?????");
                    break;
            }
        }
        else{
        System.out.println("������������������ȷ��...");
        }
    }
}
//test10Ƕ�׷�֧��switch+˫��֧
//��ӡ�·������ļ��ڣ���(3/4/5),��(6/7/8),��(9/10/11),��(12/1/2)
class Test10{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("�����뵱ǰ����(0-12)��");
        int month = myScanner.nextInt();
        if(month >=1 && month <=12){
            switch(month){
                //case��ͬ����ֵͬ����ɺϲ�
                case 3:
                case 4:
                case 5:
                    System.out.println("����");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("�ļ�");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("�＾");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("����");
                    break;
            }
        }
        else{
            System.out.println("������������������ȷ��...");
        }
    }
}
