package static_;

public class Main {
    private static int n1;
    private int n2;
    public static void m1(){}
    public void m2(){}
    public static void main(String[] args) {
        //1.直接调用静态成员，创建对象调用非静态成员
        System.out.println(n1);
        m1();
        System.out.println( new Main().n2);
        new Main().m2();
        //2.动态传入参数
        for (int i = 0; i < args.length; i++) {
            System.out.println("args["+i+"]="+args[i]);
        }

    }
}
