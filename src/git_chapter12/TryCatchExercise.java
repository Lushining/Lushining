import java.util.Scanner;
/**
 * @author Lusion
 * @version 1.0
 */
//��ȡ����������Ĳ�����������ʾ��������ֱ������һ������
/*1.������������գ�new Scanner��int num
  2.����ѭ��(true)�����int(û���쳣)��break
  3.�쳣����(���ݸ�ʽ����ȷ)��Integer.parseInt(myScanner.next())
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("������һ��������");
            try {
                num = Integer.parseInt(myScanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("��������");
            }
        }while(true);
        System.out.println("��ȡ�������������");
    }
}
