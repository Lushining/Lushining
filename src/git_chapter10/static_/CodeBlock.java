package static_;

public class CodeBlock {
    public static void main(String[] args) {
        //1.加载类信息时调用：
        //1.1创建对象时调用
        Movie m1 = new Movie("满江红");
        System.out.println("====================");
        //1.2创建子类对象时先加载父类
        new Director("满江红",60,"张艺谋");
        System.out.println("====================");
        //1.3通过类名访问静态成员
        //2.static代码块加载类信息时只执行一次，
        //3.普通代码块创建对象时不限次数，但与调用类成员无关
        System.out.println(Cat.age);
        System.out.println("====================");
        System.out.println(Cat.age);
        System.out.println("====================");
        //4.创建对象时的调用顺序：静态代码块->普通代码块->构造器
        A a = new A();
        System.out.println("====================");
        //6.创建子类对象的调用顺序:静态(父->子)->父类(普通->构造器)->子类(普通->构造器)
        BB bb = new BB();

    }
}
class Movie{
    private String name;
    private double price;
    {
        System.out.println("Movie普通代码块");
    }
    public Movie(String name) {
        System.out.println("staticexcise.Movie(name)构造器");
        this.name = name;

    }
    public Movie(String name, double price) {
        System.out.println("staticexcise.Movie(name,price)构造器");
        this.name = name;
        this.price = price;
    }
}
class Director extends Movie{
    private String director;
    public Director(String name, double price, String director) {
        super(name, price);
        this.director = director;
        System.out.println("Director构造器");
    }
}
class Cat {
    public static int age=1;
    {
        System.out.println("staticexcise.Cat 普通代码块");
    }
    static{
        System.out.println("staticexcise.Cat 静态代码块");
    }
}
class A{
    private static int n1 = getN1();
    private int 呢 = getN2();
    {
        System.out.println("staticexcise.A 普通代码块1");
    }
    static{
        System.out.println("staticexcise.A 静态代码块1");
    }
    {
        System.out.println("staticexcise.A 普通代码块2");
    }
    static{
        System.out.println("staticexcise.A 静态代码块2");
    }
    public A() {
        System.out.println("staticexcise.A 构造器");
    }
    public int getN2(){
        System.out.println("普通属性初始化");
        return 200;
    }
    public static int getN1(){
        System.out.println("静态属性初始化");
        return 100;
    }
}
class AA{
    {
        System.out.println("父类 普通代码块");
    }
    static{
        System.out.println("父类 静态代码块");
    }

    public AA() {
        System.out.println("父类 构造器");
    }
}
class BB extends AA{
    {
        System.out.println("子类 普通代码块");
    }
    static{
        System.out.println("子类 静态代码块");
    }

    public BB() {
        System.out.println("子类 构造器");
    }
}