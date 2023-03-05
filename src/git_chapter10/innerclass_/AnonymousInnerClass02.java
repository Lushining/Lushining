package innerclass_;
public class AnonymousInnerClass02 {
    public static void main(String[] args) {
        //匿名内部类(对象)可直接作为参数
        method(new A02() {
            @Override
            public void show() {
                System.out.println("重写A02.show()");
            }
        });
    }
    public static void method(A02 a){

        a.show();
    }
}
interface A02{
    void show();
}