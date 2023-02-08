package chapter07.object;

public class ToString {
    public static void main(String[] args) {
        Monster m1 = new Monster("小怪物","巡山",0);
        System.out.println(m1.toString());
    }
}
class Monster{
    private String name;
    private String job;
    private double salary;
    public Monster(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }
    public String toString(){
        return "Monster{"+name+"\t"+job+"\t"+(salary+"") +"}";
    }
}
