package chapter07.poly.array;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String say(){
        return "name="+name+"\tage="+age;
    }
}
class Student extends Person{
    private double score;
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        this.score = score;
    }
    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }
    public String say(){
        return super.say()+"\tscore="+score;
    }
    public String study(){
        return getName()+"应该努力学习";
    }
}
class Teacher extends Person{
    private double salary;
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    public String say(){
        return super.say()+"\tsalary="+salary;
    }
    public String teach(){
        return getName()+"应该认真教学";
    }
}