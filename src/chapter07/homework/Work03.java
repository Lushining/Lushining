package chapter07.homework;
//通过继承实现员工工资打印
public class Work03 {
    public static void main(String[] args) {
        Worker worker = new Worker("Amy",200,28,1);
        Manager manager = new Manager("Bob",300,25,1.2);
        //创建对象时奖金不确定，需后期输入
        manager.setBonus(1000);
        System.out.println(worker.totalSalary());
        System.out.println(manager.totalSalary());
    }
}
class Employee{
    private String name;
    private double salary;
    private int date;
    private double level;
    public double getSalary() {
        return salary;
    }
    public int getDate() {
        return date;
    }
    public double totalSalary(){
        return date*salary*level;
    }
    public Employee(String name, double salary, int date, double level) {
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.level = level;
    }
}
class Manager extends Employee{
    private double bonus;
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, int date, double level) {
        super(name, salary, date, level);
    }
    public double totalSalary(){
        return getBonus()+super.totalSalary();
    }
}

class Worker extends Employee{
    public Worker(String name, double salary, int date, double level) {
        super(name, salary, date, level);
    }

    public double totalSalary(){
        return super.totalSalary();
    }
}
