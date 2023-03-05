package generic_;

import java.util.*;

/**
 * @author Lusion
 * @version 1.0
 */
//泛型在HashSet/HashMap的使用
/*1.创建三个学生对象
  2.放入HashSet
  3.放入HashMap，要求Key是String name;Value是学生对象
  4.使用两种方式遍历

 */
public class ClassExercise {
    public static void main(String[] args) {
        System.out.println("======遍历HashSet======");
        HashSet<Student> students1 = new HashSet<Student>();
        students1.add(new Student("amy",18));
        students1.add(new Student("Bob",19));
        students1.add(new Student("Cindy",20));
        for (Student s : students1){
            System.out.println(s);
        }
        System.out.println("======遍历HashMap======");
        HashMap<String,Student> students2 = new HashMap();
        students2.put("amy",new Student("amy",18));
        students2.put("Bob",new Student("Bob",19));
        students2.put("Cindy",new Student("Cindy",20));
        Set<Map.Entry<String,Student>> entries = students2.entrySet();
        Iterator<Map.Entry<String,Student>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String,Student> next = iterator.next();
            System.out.println(next.getValue());
        }
    }
}
class Student{
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    @Override
    public String toString() {
        return "generic_.Student{" + name + ',' + age + '}';
    }
}

