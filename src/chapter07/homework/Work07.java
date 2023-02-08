package chapter07.homework;
//重写Object类的equals方法
public class Work07 {
    public static void main(String[] args) {
        Doctor doc1 = new Doctor("Amy",33,"住院医师",'女',6000);
        Doctor doc2 = new Doctor("Amy",30,"住院医师",'女',6000);
        System.out.println(doc1.equals(doc2));

    }
}
class Doctor{
    private String name;
    private int age;
    private String job;
    private char gender;
    private double salary;

    public Doctor(String name, int age, String job,
                  char gender, double salary) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.salary = salary;
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Doctor) {
            Doctor doc = (Doctor)obj;
            return this.name.equals(doc.name)&&this.age==doc.age&&
                    this.job.equals(doc.job)&&this.gender==doc.gender
                    &&this.salary==doc.salary;
        } else {
            return false;
        }
    }
}
