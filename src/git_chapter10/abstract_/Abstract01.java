package abstract_;
public class Abstract01 {
    public static void main(String[] args) {
        Common amy = new Common("Amy", 1, 1000);
        Manager bob = new Manager("Bob", 2, 2000,20000);
        amy.work();
        bob.work();
    }
}
abstract class Employee{
    private String name;
    private int id;
    private double salary;
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public abstract void work();
}
class Common extends Employee{
    public Common(String name, int id, double salary) {
        super(name, id, salary);
    }
    public void work(){
        System.out.println("普通员工"+getName()+"正在工作中");
    }
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void work(){
        System.out.println("经理"+getName()+"正在工作中");
    }
}