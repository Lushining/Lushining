package chapter07.homework;
//1.Person数组保存三个对象（toString直接输出内容）
//2.按照age从大到小冒泡排序:getAge();
//3.按照name长度排序:getName().length
public class Work01 {
    public static void main(String[] args) {
        Person[] persons = new Person[3];
        persons[0] = new Person("Amy",18,"student");
        persons[1] = new Person("Bobo",55,"teacher");
        persons[2] = new Person("cindy",45,"cleaner");
        System.out.println("======初始信息如下======");
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);//默认调用toString方法
        }
        System.out.println("======age从大到小排序======");
        Person temp1 = null;
        for(int i = 0;i < persons.length-1;i++){
            for(int j = 0;j < persons.length-1-i;j++){
                if(persons[j].getAge() < persons[j+1].getAge()){
                    temp1 = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp1;
                }
            }
        }
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }

        System.out.println("====name长度从小到大排序====");
        Person temp2 = null;
        for(int i = 0;i < persons.length-1;i++){
            for(int j = 0;j < persons.length-1-i;j++){
                if(persons[j].getName().length() > persons[j+1].getName().length()) {
                    temp2 = persons[j];
                    persons[j] = persons[j + 1];
                    persons[j + 1] = temp2;
                }
            }
        }
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]);
        }
    }
}
class Person{
    private String name;
    private int age;
    private String job;
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }

}
