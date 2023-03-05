package generic_;

/**
 * @author Lusion
 * @version 1.0
 */
//泛型的应用：声明类/实例化时指定具体类型
/*1.属性
  2.方法的返回值
  3.参数
 */
public class Instance {
    public static void main(String[] args) {
        Person<String> p = new Person<>("卢诗宁");
        p.info();
        Person<Integer> i = new Person<>(100);
        i.info();
    }
}
class Person<E>{
    E s;    //
    public Person(E s) {this.s = s;}
    public E f(){
        return s;
    }
    public void info(){
        System.out.println(s.getClass());//返回运行类型
    }
}
