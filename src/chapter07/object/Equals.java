package chapter07.object;

public class Equals {
    public static void main(String[] args) {
        Person p1 = new Person("Amy",18,'Ů');
        Person p2 = new Person("Amy",18,'Ů');
    //1.ֱ��ʹ��:˳�����ʹ��Object���equals����,�Ƚ��������͵�ַ
    //2.��д����:Person���equals����,�ж϶��������Ƿ����;
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
    //��̬����:����ת��
    public boolean equals(Object obj){
        //1.�Ƚ�ͬһ�������򷵻�true
        if(this == obj){
            return true;
        }
        //2.�Ƚ�����Person����
        if(obj instanceof Person){
        //3.����ת��,����Person����(�������;���)
            Person p = (Person) obj;
            return this.name.equals(p.name) && this.age == p.age && this.gender == p.gender;
        }
        return false;
    }
}
