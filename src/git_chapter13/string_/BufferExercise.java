package string_;

import java.util.Scanner;

/**
 * @author Lusion
 * @version 1.0
 */
//������Ʒ���ƺͼ۸�,��ӡ<����> <�۸�> /n <> <>
/*С����ǰÿ��λ��һ��","
  1.ת��(ʹ��SB��insert����)��S->SB(������/append����)
  2.��λС���㣺index = sb.indexOf()
  3.С����ǰ��λ��index - 3��
  4.���룺StringBuffer.insert(index,"")
  5.ÿ��λ(ѭ��)��
  ��.substring()��ȡ��������->ѭ������(.length/3)-1
  ��(i=index-3;i>3;i-=3)
 */
public class BufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("��������Ʒ��");
        String name = scanner.next();
        System.out.println("������۸�");
        String str = scanner.next();
        StringBuffer price = new StringBuffer(str);
        int index = price.indexOf(".");
//        str = str.substring(0,index);   //��ȡС����ǰ���ַ���
//        for (int i = 0;i < (str.length()/3)-1;i++){
//            index -= 3;
//            price.insert(index,",");
//        }
        for (int i = index-3;i > 3 ;i -= 3){
            price.insert(i,",");
        }

        System.out.println("��Ʒ��"+"��Ʒ�۸�");
        System.out.println(name+"\t"+price);
    }
}
