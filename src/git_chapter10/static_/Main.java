package static_;

public class Main {
    private static int n1;
    private int n2;
    public static void m1(){}
    public void m2(){}
    public static void main(String[] args) {
        //1.ֱ�ӵ��þ�̬��Ա������������÷Ǿ�̬��Ա
        System.out.println(n1);
        m1();
        System.out.println( new Main().n2);
        new Main().m2();
        //2.��̬�������
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]="+args[i]);
        }

    }
}
