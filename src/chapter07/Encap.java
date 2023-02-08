package chapter07;

import java.util.Scanner;

//test1:
/*
1.name/age/salary;禁止查看age/salary
2.合理验证设置的年龄:合理则设置,否则默认
3.age∈[1,120],name长度[2,6]
 */
public class Encap {
    public static void main(String[] args) {
        System.out.println("====通过封装显示信息如下====");
        Person person = new Person();
        person.setName("Amyisamy");//过滤姓名:姓名有误
        person.setAge(22);
        person.setSalary(20000);
        System.out.println(person.info());
//        System.out.println(person.getSalary());
        //通过构造器给属性赋值,无视过滤条件,年龄不受限制
        Person bob = new Person("bob",2000, 15000);
        System.out.println("====通过构造器显示信息如下====");
        System.out.println(bob.info());
//        System.out.println(bob.getSalary());
        //构造器配合封装赋值,受过滤条件制约,年龄为默认值
        System.out.println("====构造器配合封装显示信息如下====");
        Person jack = new Person(200, "Amy", 2200);
        System.out.println(jack.info());
    }
}

class Person{
    public String name;
    private int age = 20; //默认年龄
    private double salary;
    //构造器
    public Person() {
    }
    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public Person(int age,String name,double salary){
        setAge(age);
        setName(name);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        }else{
            System.out.println("姓名需要在2-6个字符之间,请重新输入");
            this.name = "姓名有误";
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age >1 && age < 120) {
            this.age = age;
        }
        else{
            System.out.println("年龄需要在1-120之间,给予默认值20");
            this.name = "姓名有误";
        }
    }
    public double getSalary() {
        System.out.println("请输入密码:");
        Scanner scanner = new Scanner(System.in);
        int secret = scanner.nextInt();
        if(secret == 123456) {
            return salary;
        }else{
            System.out.println("密码错误,拒绝访问");
            return 0;
        }
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //输出信息
    public String info(){
        return "name:"+name+"\tage:"+age+"\tsalary:"+salary;
    }
}

//test2:Account&AccountTest
/*
1.姓名:长度[2,4];余额>20;密码6位;
2.若不满足则给出提示信息并赋予默认值
 */
class AccountTest{
    public static void main(String[] args) {
        Account lusion = new Account("Lusion", 5000, "123456");
        System.out.println(lusion.getName());
        System.out.println(lusion.getMoney());
        System.out.println(lusion.getSecret());
    }
}
class Account{
    public String name;
    private double money;
    private String secret;

    public Account(String name, double money, String secret) {
        setName(name);
        setMoney(money);
        setSecret(secret);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >=2 && name.length() <= 4) {
            this.name = name;
        }else{
            System.out.println("姓名限定为2-4个字符,默认值姓名有误");
            this.name = "姓名有误";
        }
    }
    public double getMoney() {
        return money;
    }
    public void setMoney(double money) {
        if(money > 20) {
            this.money = money;
        }
        else{
            System.out.println("余额必须大于20元,默认值0.0");
        }
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        if(secret.length() == 6) {
            this.secret = secret;
        }else{
            System.out.println("密码必须为6位,默认值密码有误");
            this.secret = "密码有误";
        }
    }
}