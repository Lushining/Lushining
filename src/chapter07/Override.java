package chapter07;
//Person:
public class Override {
    public static void main(String[] args) {
        //创建父类对象并输出信息
        PersonO amy = new PersonO("Amy", 18);
        System.out.println("=====Person信息如下=====");
        System.out.println(amy.say());
        //创建子类对象并输出信息
        StudentO bob = new StudentO("Bob", 20, 001, 99);
        System.out.println("=====Student信息如下=====");
        System.out.println(bob.say());
    }
}
class PersonO{
    private String name;
    private int age;
    //通过构造器访问,无视封装(setXxx过滤条件)
    public PersonO(String name,int age){
        this.name=name;
        this.age=age;
    };
    public String say(){
        return "name="+name+"\tage="+age;
    }
}
class StudentO extends PersonO{
    private int id;
    private double score;

    public StudentO(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }
    //方法重写:名称与形参相同,返回一致或继承,访问权限不缩小
    //super:直接访问父类
    public String say(){
        return super.say()+"\tid="+id+"\tscore="+score;
    }
}

