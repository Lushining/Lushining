package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
//����Han Shun Ping����ӡPing,Han.S
/*1.�ָ���б�spilt(" ")
  2.��ʽ�������format(%s,%s.%c)
  3.�м䵥������ĸ��charAt(0)->toUppercase
  4.�Ż���!=null;length==3
 */
public class Work3 {
    public static void main(String[] args) {
        String name = "Willian Jefferson Clinton";
        print(name);
    }
    public static void print(String name){
        if (name == null){
            System.out.println("���ݲ���Ϊ�գ�����������");
            return;
        }
        String[] arr = name.split(" ");
        if (arr.length != 3){
            System.out.println("��ʽ��������������");
            return;
        }
        String format = String.format("%s,%s.%c",arr[2],arr[0],arr[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
