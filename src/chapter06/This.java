package chapter06;
public class This {
//this使用细节:只能在类的方法中使用
//1.访问变量：①区分属性与局部变量：this.<> == 属性;②重名就近访问
//2.成员方法：this.<>();
//3.构造器：this()  #必须为第一条语句，且只仅在构造器中使用
    public static void main(String[] args) {
        T t = new T(18,"a");
        System.out.println("就近访问如下：" + t.name + " " + t.age);//访问属性，未被构造器修改

        T t1 = new T();//访问无参构造器
        t1.info1();
        System.out.println("info1最终信息如下："  + t1.name);//属性被修改

        T t2 = new T();
        t2.f2();
    }
}
class T{
    String name = "person";
    int age = 100;
    public T(int age,String name){
        name = name;  //局部变量=局部变量，属性不变
        age = age;
        System.out.println("自定义info如下："+name + " " + age);//就近访问输入的实参
        System.out.println("属性info如下：" +this.name+" "+this.age);//访问属性
    }
    public void info1(){
        //属性与局部变量可重名，就近访问原则
        name = "dog";  // 修改属性
        System.out.println("info1更新信息如下："+name);
        name = "cat";
        System.out.println("info2更新信息如下："+name);
    }
    public void f1(){
        System.out.println("f1()方法");
    }
    public void f2(){
        System.out.println("f2()方法");
        //2.调用成员方法：调用本类的f1()
        f1();
        this.f1();
    }
    public T(){
        this("amy",6);
        System.out.println("无参构造器");
    }
    public T(String name,int age){
        System.out.println("传参构造器");
    }
}

//this练习题：
//定义Info类，包含gender,height属性
//提供compare方法。判断是否相等;性别身高相同则返回true
class ThisTest{
    public static void main(String[] args){
        Info info1 = new Info('女',175);
        boolean res = info1.compare('女',173);
        System.out.println("两人信息是否一致？"+res);
    }
}
class Info{
    char gender;
    double height;
    public Info(char gender,double height){
        this.gender = gender;
        this.height = height;
    }
    public boolean compare(char gender,double height) {
        if (this.gender == gender & this.height == height) {
            return true;
        } else {
            return false;
        }
    }
}
/*public boolean compare(Info i){
    return this.gender.equals(i.gender) && this.height == i.height
  //new i1/i2；i1.compare(i2);
*/


