package innerclass_;

public class ClassFormat {     //外部其他类

}
class Outer{    //外部类
    private int n = 100;
    public void m(){
        System.out.println("方法m1");
    }
    public Outer(int n) {
        this.n = n;
    }
    {
        System.out.println("代码块");
    }
    class Inner{}   //内部类
}
