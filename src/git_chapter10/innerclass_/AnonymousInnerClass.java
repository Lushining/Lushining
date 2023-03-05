package innerclass_;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.method();
    }
}
class Outer02{
    private int n1 = 10;
    public void method(){
/*1.基于接口的匿名内部类
1.1定义：直接创建类与对象并分配类名(通过变量引用方法/直接引用)
1.2编译类型(接口A)=运行类型(自动分配名称的匿名内部类Outer02$1)
1.3使用：匿名内部类只能使用一次，对象一直存在
 */
        A a1 = new A(){
            public void cry(){
                System.out.println("重写方法：A.cry()");
            }
        };
        a1.cry();
        a1.cry();
        //new Outer02$1();错误
        System.out.println("A的运行类型为"+a1.getClass());
        System.out.println("====================");
        new A(){
            public void cry(){
                System.out.println("匿名内部类的接口重写方法：A.cry()");
            }
        }.cry();
        System.out.println("====================");

/*2.基于类的匿名内部类
2.1类型：有类体{}--编译类型(B)=运行类型(Outer02$3)
        无类体{}--编译与运行类型都是B
2.2重写：普通类--可选择性重写方法
        抽象类--必须重写方法
2.3构造器：
 */
        B b1 = new B(20){
            @Override
            public void test() {
                System.out.println("匿名内部类重写方法B.test()");
            }
        };
        System.out.println("B的运行类型为"+b1.getClass());
        b1.test();
        System.out.println("====================");
        B b2 = new B(20){};
        System.out.println("B的运行类型为"+b2.getClass());
        b1.test();
        System.out.println("====================");
        B b3 = new B(20);
        System.out.println("B的运行类型为"+b3.getClass());
        System.out.println("====================");
        C c = new C() {
            @Override
            void eat() {
                System.out.println("重写抽象类C的方法C.eat()");
            }
        };
    }
}

interface A{
    public void cry();
}
class B{
    private int n2;
    public B(int n2) {
        this.n2 = n2;
    }
    public void test(){}
}
abstract class C{
    abstract void eat();
}
