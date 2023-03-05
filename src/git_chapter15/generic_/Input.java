package generic_;

import java.util.ArrayList;
/**
 * @author Lusion
 * @version 1.0
 */
//ArrayList���3��Dog����(name,age),getXxx�������
/*AL<generic_.Dog> al = new AL<generic_.Dog>();    #�涨���ϵ���������(����ת��)
  �ٲ�ʹ�÷��ͣ�Dog��->Object����->Dog��
  ��ʹ�÷��ͣ�generic_.Dog->Dog����->dog
 */
public class Input {
    public static void main(String[] args) {
        ArrayList<Dog> arraylist = new ArrayList<Dog>();
        arraylist.add(new Dog("����",10));
        arraylist.add(new Dog("����",9));
        arraylist.add(new Dog("����",8));
        for (Dog dog : arraylist) {
            System.out.println(dog.getName()+"-"+dog.getAge());
        }
        //for (Object o : arraylist) {  #��ǿforѭ��(�ֲ�����:����)
        //    generic_.Dog dog = (generic_.Dog)o;         #����ת��
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

