package homework_;
//局部内部类：属性重名时就近访问或指定访问(类名.this.成员名)
/**
 * @author Lusion
 * @version 1.0
 */
public class Work04 {
    public static void main(String[] args) {
        //1.属性重名时就近访问；
        //2.指定访问外部类属性
        A a = new A();
        a.say();
    }
}
class A{
    private String name = "Amy";
    public void say(){
        class B{
            private String name = "Bob";
            public void show(){
                System.out.println(name+" "+A.this.name);
            }
        }
        B b = new B();
        b.show();
    }
}

