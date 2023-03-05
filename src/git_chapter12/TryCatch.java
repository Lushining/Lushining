/**
 * @author Lusion
 * @version 1.0
 */
//1.try�Ƿ����쳣������try->catch��˳��try->����catch
//2.��catch��һ��������ǰ�������ں�ֻ�ͽ�ִ��һ��
public class TryCatch {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            p = null;
            System.out.println("��ָ���쳣:"+p.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
            System.out.println("�����쳣��"+res);
        } catch (NullPointerException e) {
            System.out.println("��ָ���쳣��"+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("�����쳣="+e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class Person{
    private String name;
    public String getName() {
        return name;
    }
}
