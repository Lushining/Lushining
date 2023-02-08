package chapter07.poly.array;

public class PolyArray {
    public static void main(String[] args) {
        //1.创建五个对象统一放在一个数组:定义父类(编译),保存子类与父类(运行)
        Person[] persons = new Person[5];
        persons[0] = new Person("Amy",18);
        persons[1] = new Student("Bob",18,88);
        persons[2] = new Student("Cindy",17,77);
        persons[3] = new Teacher("Dobby",35,5000);
        persons[4] = new Teacher("Eric",54,8000);
        //2.调用各自的say方法(方法重写):动态绑定机制,定位运行类型的方法
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i].say());
        //3.调用子类特有方法:判断运行类型+向下转型
            if(persons[i] instanceof Student){
                System.out.println(((Student)persons[i]).study());
            }
            else if(persons[i] instanceof Teacher){
                System.out.println(((Teacher) persons[i]).teach());
            }
        }





    }
}
