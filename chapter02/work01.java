//work01
public class work01{
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

//work02:ʹ��char�ֱ𱣴�\n 1 ���ַ�����ӡ���
class work02{
    public static void main(String[] args){
        char a = '\n';
        char b = '1';
        char c = 1;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println((int)c); 
    }
}
//work03��������������/�����Ա�/������ļ۸���+ƴ�ӿ�Ч����
class work03{
    public static void main(String[] args){
        String a1 = "����Ե";
        String a2 = "С��Բ";
        char b1 = '��';
        char b2 = 'Ů';
        double c1 = 10.0;
        double c2 = 20.0;
        System.out.println(a1 + a2); //�ַ���ƴ��
        System.out.println(b1 + b2); //char+char=int
        System.out.println(c1 + c2); //double
    }
}

/*work04��
  ���� ���� �ɼ� �Ա� ����
  xx   xx  xx   xx   xx
  1)��������
  2)ʹ��+
  3)���ת���ַ���һ��������
*/
class work04{
    public static void main(String[] args){
        String a = "¬ʫ��";
        byte b = 22;
        byte c = 100;
        char d = 'Ů';
        String e = "�Ķ�";
        char x = '\t';
        System.out.println("����\t����\t�ɼ�\t�Ա�\t����\n"+
        a + x + b + x + c + x + d + x + e); //�����Ϣ���Ի���
    }
}