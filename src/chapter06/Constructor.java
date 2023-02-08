package chapter06;
public class Constructor {
    public static void main(String[] args){
        //创建对象时自动调用构造器初始化属性；允许重载构造方法；
        CPerson cp1 = new CPerson("卢诗宁",22);
        System.out.println("====调用第一个构造器的结果====");
        System.out.println("用户名："+cp1.name);
        System.out.println("年龄  ："+cp1.age);
        CPerson cp2 = new CPerson("卢诗蓝");
        System.out.println("====调用第二个构造器的结果====");
        System.out.println("用户名："+cp2.name);
        System.out.println("年龄  ："+cp2.age);
        //默认无参构造器，自定义后覆盖更新
        CPerson cp3 = new CPerson();
        System.out.println("====调用无参构造器====");
        System.out.println("用户名："+cp3.name);
        System.out.println("年龄  ："+cp3.age);
        CPerson cp4 = new CPerson(18,"Lulu");
        System.out.println("====调用this关键字====");
        System.out.println("用户名："+cp4.name);
        System.out.println("年龄  ："+cp4.age);
    }
}
class CPerson{
    //默认初始化(null/0)；指定初始化：int age = 20;
    String name;
    int age;
    //构造器赋值
    public CPerson(String pName,int pAge){
        name = pName;
        age = pAge;
    }
    //构造器重载(同名不同形参列表)
    public CPerson(String pName) {
        name = pName;
    }
    //默认/定义无参构造器
    public CPerson(){
        age = 18;
    }
    public CPerson(int age,String name){
        //name = name：局部变量=局部变量-->默认属性值(0/null)
        this.name = name;  //属性=局部变量-->实参赋值
        this.age = age;
    }
}
//JVM内存形式：
/*Person p = new Person("a",20);
  //1.方法区加载类信息-堆开辟对象空间(地址)
  //2.变量初始化：默认(0/null)-指定(90/null)-构造器(a/20)
      构造器赋值：常量池(str值-地址)->栈(str地址/常量)
  //3.对象地址返回栈对象名
  class Person{
      int age = 90;
      String name;
      Person(String n,int a){
          name = n;
          age = a;
      }
  }
*/
