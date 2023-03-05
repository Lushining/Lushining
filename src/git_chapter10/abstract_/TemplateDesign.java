package abstract_;
public class TemplateDesign {
    public static void main(String[] args) {
        A a = new A();
        a.calculateTime();
        B b = new B();
        b.calculateTime();

    }
}
abstract class Top{
    public abstract void job();
    public void calculateTime(){
        long start = System.currentTimeMillis();
        job();
        //��ȡ����ʱ��
        long end = System.currentTimeMillis();
        System.out.println("ִ��ʱ��Ϊ��"+(end-start));
    }
}
class A extends Top{
    public void job(){
        long num = 0;
        for (long i = 0; i < 100000; i++) {
            num += i;
        }
    }
//    public void job(){
//        //��ȡ��ʼʱ��(ms)
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 0; i < 100000; i++) {
//            num += i;
//        }
//        //��ȡ����ʱ��
//        long end = System.currentTimeMillis();
//        System.out.println("ִ��ʱ��Ϊ��"+(end-start));
//    }
}
class B extends Top{
    public void job() {
        long num = 0;
        for (long i = 0; i < 100000; i++) {
            num += (2 * i);
        }
    }
//    public void job(){
//        //��ȡ��ʼʱ��(ms)
//        long start = System.currentTimeMillis();
//        long num = 0;
//        for (long i = 0; i < 100000; i++) {
//            num += (2*i);
//        }
//        //��ȡ����ʱ��
//        long end = System.currentTimeMillis();
//        System.out.println("ִ��ʱ��Ϊ��"+(end-start));
//    }
}
