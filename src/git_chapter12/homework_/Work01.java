package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*����������(main(String[] args))�����������������г�������
  1.�����±�Խ���쳣��������������
  2.���ݸ�ʽ�쳣����������
  3.�����쳣��������Ϊ0
 */
public class Work01 {
    public static void main(String[] args) {
        try {
            //1.����Խ���쳣(��֤��������)��������������
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("������������");
            }
            //2.���ݸ�ʽ�쳣������ת��Ϊ����
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            //3.�����쳣����������Ϊ��
            int res = cal(n1,n2);
            System.out.println("������ȷ���õ������"+res);
        } catch (NumberFormatException e){
            System.out.println("��ʽ����ȷ����Ҫ��������");
        } catch (ArithmeticException e){
            System.out.println("������Ϊ��");
        }

    }
    public static int cal(int n1,int n2){
        return n1/n2;
    }
}
