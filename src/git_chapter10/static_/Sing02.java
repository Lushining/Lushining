package static_;

public class Sing02 {
    public static void main(String[] args) {
        //1.仅通过类名访问类成员时，不新建对象不调用构造器
        System.out.println(Boyfriend.n);
        System.out.println("====================");
        //2.创建对象时才调用构造器,给予默认值
        //2.1第一次获得对象：新建对象(调用构造器)
        System.out.println(Boyfriend.getInstance());
        System.out.println("====================");
        //2.2第二次获得对象：返回对象(不调用构造器)
        System.out.println(Boyfriend.getInstance());
    }
}
class Boyfriend{
    private String name;
    private static Boyfriend b;
    public static int n = 1;
    private Boyfriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static Boyfriend getInstance(){
        if (b == null) {    //默认创建一个对象
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
