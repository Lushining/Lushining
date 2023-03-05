package final_;

public class Final {
    public static void main(String[] args) {
        new Circle1().square(1);
    }
}
//1.计算圆的面积，要求圆周率3.14，使用三种方式赋值
class Circle1{  //普通属性赋值
    private int r;
    //1.定义时赋值
    private final double Rate1 = 3.14;
    //2.代码块赋值
    private final double Rate2;
    {
        Rate2 = 3.14;
    }
    //3.构造器赋值
    private final double Rate3;
    public Circle1() {
        Rate3 = 3.14;
    }
    public void square(int r){
        System.out.println(r*r*Rate1);
    }
}
class Circle2{  //静态属性赋值
    private static int r;
    private final static double PI1 = 3.14;
    private final static double PI2;
    static {
        PI2 = 3.14;
    }
}

