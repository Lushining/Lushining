package chapter02;
//work01
public class Hw02{
    public static void main(String[] args){
        int n1 = 13;
        int n2 = 17;
        int n3 = n1 + n2;
        System.out.println("n3=" + n3);//n3=30
        int n4 = 38;
        int n5 = n4 - n3;//n5=8
        System.out.println("n5=" + n5 );
    }
}

//work02:char�ı�����һ�����������Խ��м�������ת����unicode���������
class Hw02t2{
    public static void main(String[] args){
        char a = '\n';
        char b = '1';
        char c = 1;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println((int)c); 
    }
}
//work03
class Hw02t3{
    public static void main(String[] args){
        String a1 = "my";
        String a2 = "name";
        char b1 = 'a';
        char b2 = 'b';
        double c1 = 10.0;
        double c2 = 20.0;
        System.out.println(a1 + a2); //�ַ������
        System.out.println(b1 + b2); //char+char=int
        System.out.println(c1 + c2); //double����������Ϊdouble���������ȷС����
    }
}

/*work04��
  ���� ���� �ɼ�  �Ա� ����
  xx   xx  xx   xx   xx
*/
class Hw02t4{
    public static void main(String[] args){
        String a = "¬ʫ��";
        byte b = 22;
        byte c = 100;
        char d = 'Ů';
        String e = "�㽭";
        char x = '\t';
        System.out.println("����\t����\t?�ɼ�\t�Ա�\t����\n"+
        a + x + b + x + c + x + d + x + e);
    }
}