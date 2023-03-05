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
/*1.���ڽӿڵ������ڲ���
1.1���壺ֱ�Ӵ���������󲢷�������(ͨ���������÷���/ֱ������)
1.2��������(�ӿ�A)=��������(�Զ��������Ƶ������ڲ���Outer02$1)
1.3ʹ�ã������ڲ���ֻ��ʹ��һ�Σ�����һֱ����
 */
        A a1 = new A(){
            public void cry(){
                System.out.println("��д������A.cry()");
            }
        };
        a1.cry();
        a1.cry();
        //new Outer02$1();����
        System.out.println("A����������Ϊ"+a1.getClass());
        System.out.println("====================");
        new A(){
            public void cry(){
                System.out.println("�����ڲ���Ľӿ���д������A.cry()");
            }
        }.cry();
        System.out.println("====================");

/*2.������������ڲ���
2.1���ͣ�������{}--��������(B)=��������(Outer02$3)
        ������{}--�������������Ͷ���B
2.2��д����ͨ��--��ѡ������д����
        ������--������д����
2.3��������
 */
        B b1 = new B(20){
            @Override
            public void test() {
                System.out.println("�����ڲ�����д����B.test()");
            }
        };
        System.out.println("B����������Ϊ"+b1.getClass());
        b1.test();
        System.out.println("====================");
        B b2 = new B(20){};
        System.out.println("B����������Ϊ"+b2.getClass());
        b1.test();
        System.out.println("====================");
        B b3 = new B(20);
        System.out.println("B����������Ϊ"+b3.getClass());
        System.out.println("====================");
        C c = new C() {
            @Override
            void eat() {
                System.out.println("��д������C�ķ���C.eat()");
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
