package chapter07;

import java.util.Scanner;

public class Extend {
    public static void main(String[] args) {
//        //1.创建父类对象,调用父类方法
//        Student p1 = new Student();
//        p1.name = "jack1";
//        p1.age = 11;
//        p1.setGrade(91);//通过公共方法跨类访问属性
//        System.out.println(p1.info());
//        Student p2 = new Student("jack2",12,92);
//        System.out.println(p2.info());
//        System.out.println("==============");
//        //2.创建子类对象,调用子类与父类的方法;
//        //2.1创建子类对象时,默认调用父类的无参构造器创建对象
//        Pupil p3 = new Pupil("jack3",13,93);
//        System.out.println(p3.testing());
//        System.out.println(p3.info());
//        System.out.println("==============");
        //2.2或通过super(参数)指定父类的构造器以创建对象
        Graduate g1 = new Graduate();
        System.out.println(g1.testing());
        System.out.println(g1.info());
        Graduate g2 = new Graduate("smith2",22,98);
        System.out.println(g2.testing());
        System.out.println(g2.info());
        //2.3super()必须放在构造器第一行,与this()不共用
    }
}
class Student{
    public String name;
    public int age;
    private double grade;

    public Student() {
        System.out.println("正在调用父类的无参构造器");
    }
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        setGrade(grade);
        System.out.println("正在调用父类的指定构造器");
    }
    public void setGrade(double grade) {
        if(grade >= 0 && grade <= 100) {
            this.grade = grade;
        }else{
            System.out.println("成绩(0-100),默认0.0,请重新确认");
            this.grade = 0;
        }
    }
    public String info(){
        System.out.println("请输入您的身份(老师/学生):");
        Scanner scanner = new Scanner(System.in);
        String person = scanner.next();
        if("老师".equals(person)) {
            return name+"的数学成绩为"+grade;
        }else{
            System.out.println("你无权查看学生成绩");
            return name+"的数学成绩保密";
        }
    }

}
class Pupil extends Student {
    public Pupil(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        setGrade(grade);
    }
    public String testing(){
        return name + "正在考小学数学";
    }
}
class Graduate extends Student{
    public Graduate(String name, int age, double grade) {
//        this.name = name;
//        this.age = age;
//        setGrade(grade);
        super(name,age,grade);
    }
    public Graduate(){
        super("smith",22,99);
    }
    public String testing() {
        return name + "正在考大学数学";
    }
}


