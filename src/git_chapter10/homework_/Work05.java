package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*
1.�ӿ���Vehicles{}���ӿ�work()
2.��Horse/Boat��ʵ�ֽӿ�
3.��factory�������������ֱ���Horse��Boat(staticֱ�ӵ���)
4.��Person������name/Vehicles,������
5.ʵ����Person����ɮ��·�������ӳ˴�
  *������Ҫ���װΪһ������
   �ٻ�ý�ͨ���ߣ�Factory
   �ڻ�ù���������ͨ������������дwork
  *������ֱ�Ӹ�ֵ
   �ٹ��˹����������vehicle����(instanceOf)
  *�Ż���ͬһ������ͬ�´�
   �ٵ������ģʽ(����ʽ)
6.��չ��������ɽʹ������
 */
public class Work05 {
    public static void main(String[] args) {
        Person p = new Person("��ɮ", null);
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
        System.out.println("С�����ߴ�·");}
}
class Boat implements Vehicles{
    @Override
    public void work() {
        System.out.println("���ڹ�����");}
}
class Fan implements Vehicles{
    @Override
    public void work() {
        System.out.println("���ȹ�����ɽ");
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
        //��̬�ӿ�
        if (!(vehicles instanceof Horse)) {
            vehicles = Factory.getHorse();
        }
        vehicles.work();
    }
    public void river(){
        if (!(vehicles instanceof Boat)) {
            vehicles = Factory.getBoat();
            //�ӿڵĶ�̬
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