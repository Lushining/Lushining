package chapter07.homework;

import com.sun.deploy.util.Waiter;

public class Work04 {
    public static void main(String[] args) {
        //month不划入构造器，通过set灵活赋值(默认12)
        Peasant amy = new Peasant("Amy", 1500, 12);
        Teacher04 bob = new Teacher04("Bob", 4000,10,200,50 );
        Scientist cindy = new Scientist("Cindy", 6000, 15, 50000);
        amy.annualSalary();
        bob.annualSalary();
        cindy.annualSalary();
    }

}
class Worker04{
    private String name;
    private double monthSal;
    private int month = 12;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public double getMonthSal() {
        return monthSal;
    }
    public void setMonthSal(double monthSal) {
        this.monthSal = monthSal;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public Worker04(String name, double monthSal, int month) {
        this.name = name;
        this.monthSal = monthSal;
        this.month = month;
    }
    public void annualSalary(){
        System.out.println(name+"的全年总工资为"+month*monthSal);
    }
}
class Peasant extends Worker04{
    public Peasant(String name, double monthSal, int month) {
        super(name, monthSal, month);
    }
    public void annualSalary(){
        System.out.print("农民");
        super.annualSalary();
    }
}
class Teacher04 extends Worker04{
    private double classSal;
    private int classDate;

    public Teacher04(String name, double monthSal, int month, double classSal, int classDate) {
        super(name, monthSal, month);
        this.classSal = classSal;
        this.classDate = classDate;
    }

    public void annualSalary(){
        System.out.println("老师"+getName()+"的全年工资是"+
                (classDate*classSal+getMonth()*getMonthSal()));
    }
}
class Scientist extends Worker04{
    private double bonus;
    public Scientist(String name, double monthSal, int month, double bonus) {
        super(name, monthSal, month);
        this.bonus = bonus;
    }
    public void annualSalary(){
        System.out.println("科学家"+getName()+"的全年工资是"+
                (bonus+getMonth()*getMonthSal()));
    }
}

