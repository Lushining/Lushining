package chapter07.homework;
//1.父类Teacher，子类重写introduce方法
//2.初始化一个Teacher对象调用方法；
public class Work02 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Amy",55,"教授",25000,1.3);
        teacher.introduce();
    }

}
class Teacher{
    private String name;
    private int age;
    private String post;
    private double salary;
    private double level;
    public Teacher(String name, int age, String post, double salary, double level) {
        this.name = name;
        this.age = age;
        this.post = post;
        this.salary = salary;
        this.level = level;
    }
    public void introduce(){
        System.out.println("name="+name+"\tage="+age+"\tpost="+
                post+ "\tsalary="+salary+"\tlevel="+level);
    }
}
class Professor extends Teacher{
    public Professor(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }
    @Override
    public void introduce() {
        System.out.println("教授信息如下");
        super.introduce();
    }
}

class AssPro extends Teacher{
    public AssPro(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    public void introduce() {
        System.out.println("副教授信息如下：");
        super.introduce();
    }
}

class Lecture extends Teacher{
    public Lecture(String name, int age, String post, double salary, double level) {
        super(name, age, post, salary, level);
    }

    public void introduce() {
        System.out.println("讲师信息如下：");
        super.introduce();
    }
}
