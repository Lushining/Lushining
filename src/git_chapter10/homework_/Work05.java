package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*
1.接口类Vehicles{}，接口work()
2.类Horse/Boat：实现接口
3.类factory：有两个方法分别获得Horse和Boat(static直接调用)
4.类Person：属性name/Vehicles,构造器
5.实例化Person：唐僧走路骑马，过河乘船
  *将具体要求封装为一个方法
   ①获得交通工具：Factory
   ②获得工作方法：通过更换对象重写work
  *构造器直接赋值
   ①过滤构造器传入的vehicle对象(instanceOf)
  *优化：同一批马，不同新船
   ①单例设计模式(饿汉式)
6.拓展：过火焰山使用扇子
 */
public class Work05 {
    public static void main(String[] args) {
        Person p = new Person("唐僧", null);
        p.river();
        p.road();
        p.fireMountain();
    }
}

interface Vehicles{
    void work();
}
class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("小白龙走大路");}
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("大乌龟过大河");}
}
class Fan implements Vehicles{
    @Override
    public void work() {
        System.out.println("铁扇过火焰山");
    }
}
class Factory{
    private Factory() {}
    private static Horse horse = new Horse();
    public static Horse getHorse(){
        return horse;
    }
    public static Boat getBoat(){
        return new Boat();
    }
    private static Fan fan = new Fan();
    public static Fan fan(){
        return fan;
    }
}
class Person{
    private String name;
    private Vehicles vehicles;
    public Person(String name, Vehicles vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }
    public void road(){
        //多态接口
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
    public void river(){
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
            //接口的多态
        }
        vehicles.work();
    }
    public void fireMountain(){
        if (!(vehicles instanceof Fan)){
            vehicles = Factory.fan();
        }
        vehicles.work();
    }
}