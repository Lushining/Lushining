package chapter07.poly.parameter;

public class Employee {
    private String name;
    private double salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    public double getAnnual(){
        return salary*12;
    }
}

class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println(getName()+"正在工作");
    }
    public double getAnnual(){
        return getSalary()*12;
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
    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public void manage(){
        System.out.println(getName()+"正在管理");
    }
    public double getAnnual(){
        return super.getAnnual()+bonus;
    }
}

