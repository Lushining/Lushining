package util;

public class TestUtility {
    public static void main(String[] args) {
        System.out.println("�����룺");
        //��ȡ�ַ��������Ȳ�����3,��������ѭ��
        String s1 = Utility.readString(3);
        System.out.println("s="+s1);
        System.out.println("�����룺");
        //��ȡ�ַ��������Ȳ�����3,��������ѭ��;��ֱ�ӻس����Ĭ��ֵ
        String s2 = Utility.readString(3,"enter");
        System.out.println("s="+s2);
    }
}
