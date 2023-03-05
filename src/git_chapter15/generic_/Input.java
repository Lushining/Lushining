package generic_;

import java.util.ArrayList;
/**
 * @author Lusion
 * @version 1.0
 */
//ArrayList添加3个Dog对象(name,age),getXxx输出属性
/*AL<generic_.Dog> al = new AL<generic_.Dog>();    #规定集合的数据类型(向下转型)
  ①不使用泛型：Dog类->Object集合->Dog类
  ②使用泛型：generic_.Dog->Dog集合->dog
 */
public class Input {
    public static void main(String[] args) {
        ArrayList<Dog> arraylist = new ArrayList<Dog>();
        arraylist.add(new Dog("旺财",10));
        arraylist.add(new Dog("发财",9));
        arraylist.add(new Dog("来福",8));
        for (Dog dog : arraylist) {
            System.out.println(dog.getName()+"-"+dog.getAge());
        }
        //for (Object o : arraylist) {  #增强for循环(局部变量:数组)
        //    generic_.Dog dog = (generic_.Dog)o;         #向下转型
        //    System.out.println(dog.getName()+"-"+dog.getAge());
        //}
    }
}
class Dog{
    String name;
    int age;
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
}
class Cat{
    String name;
    int age;
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public int getAge() {return age;}
}

