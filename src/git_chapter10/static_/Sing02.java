package static_;

public class Sing02 {
    public static void main(String[] args) {
        //1.��ͨ�������������Աʱ�����½����󲻵��ù�����
        System.out.println(Boyfriend.n);
        System.out.println("====================");
        //2.��������ʱ�ŵ��ù�����,����Ĭ��ֵ
        //2.1��һ�λ�ö����½�����(���ù�����)
        System.out.println(Boyfriend.getInstance());
        System.out.println("====================");
        //2.2�ڶ��λ�ö��󣺷��ض���(�����ù�����)
        System.out.println(Boyfriend.getInstance());
    }
}
class Boyfriend{
    private String name;
    private static Boyfriend b;
    public static int n = 1;
    private Boyfriend(String name){
        System.out.println("������������");
        this.name = name;
    }
    public static Boyfriend getInstance(){
        if (b == null) {    //Ĭ�ϴ���һ������
            b = new Boyfriend("Bob");
        }
        return b;
    }
    @Override
    public String toString() {
        return "staticexcise.Boyfriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
