package homework_;
//匿名内部类
/**
 * @author Lusion
 * @version 1.0
 */
public class Work03 {
    public static void main(String[] args) {
        Cellphone p = new Cellphone();
        //匿名内部类直接传参并完成方法重写
        p.testWork(new Calculate() {
            @Override
            public int work(int n1, int n2) {
                return n1+n2;
            }
        },1,2);
        p.testWork(new Calculate() {
            @Override
            public int work(int n1, int n2) {
                return n1*n2;
            }
        },1,2);
    }

}
interface Calculate{
    int work(int n1,int n2);
}
class Cellphone{
    //调用work方法:通过对象/传参调用类成员
    public void testWork(Calculate c,int n1,int n2){
        double result = c.work(n1,n2);//动态绑定运行类型
        System.out.println("result="+result);
    }
}