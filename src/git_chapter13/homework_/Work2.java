package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*1.�������register(S S S)��������
  2.�������룺
    a.�û�������
    b.���볤��&&ȫ���֣�boolean isDigital()
    c.@��.ǰ��indexOf()
  *Stringȫ�����֣�toCharArray() -> char�ı���������(==)
  3.ע�����ѣ�try-catch
  4.�Ż�����ָ���쳣
 */
public class Work2 {
    public static void main(String[] args) {
        String name = null;
        String pwd = "123456";
        String email = "amy@qq.com";
        try {
            register(name,pwd,email);
            System.out.println("��ϲ��ע��ɹ�");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("�ܱ�Ǹע��ʧ��");
        }
    }
    public static void register(String name,String pwd,String email){
        if(name == null || pwd == null || email == null){
            throw new RuntimeException("��Ϣ��������Ϊ��");
        }
        if (!(name.length() >=2 && name.length() <= 4)){
            throw new RuntimeException("�û�������2-4");
        }
        if (!(isDigital(pwd) && pwd.length() == 6)){
            throw new RuntimeException("�û��������Ϊ�����ҳ���Ϊ6");
        }
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");        //���򷵻����������򷵻�-1
        if (!(index1 > 0 && index1 < index2)){
            throw new RuntimeException("�û�������Ҫ@��.ǰ");
        }
    }
    public static boolean isDigital(String pwd){
        char[] arr = pwd.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if (arr[i] < '0' || arr[i] > '9'){return false;}
        }
        return true;
    }
}
