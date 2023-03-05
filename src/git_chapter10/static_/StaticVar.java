package static_;

public class StaticVar {
    public static void main(String[] args) {
        Child amy = new Child("Amy");
        amy.join();
        Child bob = new Child("Bob");
        bob.join();
        System.out.println("��Ϸ������"+Child.count);
        System.out.println("��Ϸ������"+amy.count);
        System.out.println("��Ϸ������"+bob.count);
    }
}
class Child{
    //static��������������ж��������(������ռ�)
    public static int count;
    private String name;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"��������Ϸ");
        count++;
    }
}

//
/*JVM�ڴ������
1.��������Ϣ������class�ļ���ĩβ���������
  *���贴�����󣬾Ϳ���ͨ����������
2.��������ջ����->�ѿռ��ַ->������������(amy)
                         ->�����ѿռ�(count)
 */

