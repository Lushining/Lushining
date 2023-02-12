package chapter07.homework;
//1.提高复用性：相同属性与方法->父类，特有->子类，部分相同->重写
//2.多态数组
//3.多态参数
public class Work08 {
    public static void main(String[] args) {
        //1.方法重写
        Teacher08 t = new Teacher08("张飞", '男', 30, 5);
        Student s = new Student("小明", '男', 15, "00023102");
        t.say();
        s.say();
        //2.多态数组：父类编译，保存子类/父类
        Person08[] persons = new Person08[4];
        persons[0] = new Student("Amy", '女', 15, "00023100");
        persons[1] = new Student("Bob", '男', 14, "00023101");
        persons[2] = new Teacher08("Cindy", '女', 35, 10);
        persons[3] = new Teacher08("Dobby", '女', 45, 20);
        System.out.println("======排序结果如下======");
        Work08 work08 = new Work08();
        work08.sort(persons);
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]); //自动调用toString方法
        }
        System.out.println("======test方法输出如下======");
        //3.多态参数:形参父类，实参子类；
        for(int i = 0;i < persons.length;i++){
            System.out.println(work08.test(persons[i]));
        }

    }
        //冒泡排序：年龄从大到小
    public void sort(Person08[] persons){
        for(int i = 0;i < persons.length - 1;i++){
            for(int j = 0;j < persons.length - 1 - i;j++){
                if(persons[j].getAge() < persons[j+1].getAge()){
                    Person08 temp = null;
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    //公有重写/特有向下转型
    public String test(Person08 p){
        if(p instanceof Student){
            return ((Student) p).study();
        }else if (p instanceof Teacher08){
            return ((Teacher08) p).teach();
        }else{
            return "do nothing";
        }
    }

}
class Person08{
    private String name;
    private char sex;
    private int age;
    public Person08(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public String play(){
        return name+"爱玩";
    }
    public void say(){
        System.out.println("姓名："+name);
        System.out.println("年龄"+age);
        System.out.println("性别"+sex);
    }

    @Override
    public String toString() {
        return "Person08{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}
class Student extends Person08{
    private String atu_id;
    public Student(String name, char sex, int age, String atu_id) {
        super(name, sex, age);
        this.atu_id = atu_id;
    }
    public String study(){
        return getName()+"承诺会好好学习";
    }
    @Override
    public String play() {
        return super.play()+"足球";
    }

    @Override
    public void say() {
        System.out.println("学生信息如下：");
        super.say();
        System.out.println("学号："+atu_id+"\n"+this.study()+"\n"+this.play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "atu_id='" + atu_id + '\'' +
                '}'+super.toString();
    }

}
class Teacher08 extends Person08{
    private int work_age;
    public Teacher08(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public String teach(){
        return getName()+"承诺会认真教学";
    }

    @Override
    public String play() {
        return super.play()+"象棋";
    }
    public void say() {
        System.out.println("老师信息如下：");
        super.say();
        System.out.println("工龄："+work_age+"\n"+this.teach()+"\n"+this.play());
    }

    @Override
    public String toString() {
        return "Teacher08{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
