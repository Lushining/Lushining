package chapter07.object;

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person("Amy",18,'女');
        Person p2 = new Person("Amy",18,'女');
    //1.直接使用:顺序查找使用Object类的equals方法,比较引用类型地址
    //2.重写方法:Person类的equals方法,判断对象内容是否相等;
        System.out.println(p1.equals(p2));
    }
}
class Person{
    private String name;
    private int age;
    private char gender;
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //多态参数:向上转型
    public boolean equals(Object obj){
        //1.比较同一个对象则返回true
        if(this == obj){
            return true;
        }
        //2.比较两个Person对象
        if(obj instanceof Person){
        //3.向下转型,访问Person属性(编译类型决定)
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
