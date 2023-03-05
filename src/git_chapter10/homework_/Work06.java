package homework_;
//�ڲ���
/**
 * @author Lusion
 * @version 1.0
 */
public class Work06 {
    public static void main(String[] args) {
        Car car1 = new Car(-10);
        Car car2 = new Car(20);
        Car car3 = new Car(50);
        //1.��Ա�ڲ��ࣺͨ���ⲿ����󴴽��ڲ���ʵ��
        Car.Air air1 = car1.new Air();
        air1.flow();
        Car.Air air2 = car2.new Air();
        air2.flow();
        Car.Air air3 = car3.new Air();
        air3.flow();
        System.out.println("====================");
        //2.��̬�ڲ��ֱࣺ�Ӵ����ڲ������
        new Car2.Air2(-10).flow();
        new Car2.Air2(10).flow();
        new Car2.Air2(50).flow();
        System.out.println("====================");
        //3.���������������ʶ���(��̬/��ͨ)
        new Car(-10).get1().flow();
        Car2.get2(-10).flow();
    }
}
class Car{
    private double temperature;
    public Car(double temperature) {this.temperature = temperature;}
    public Car(){}
    public double getTemperature() {
        return temperature;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    class Air{
        public void flow(){
            if (temperature > 40){
                System.out.println("���ڴ����");
            } else if (temperature < 0) {
                System.out.println("���ڴ�ů��");
            }else {
                System.out.println("���ڹرտյ�");
            }
        }
    }
    public Air get1(){
        return new Air();
    }
}
class Car2{
    private static double temperature;
    static class Air2{
        public Air2(double temperature) {
            Car2.temperature = temperature;
        }
        public Air2(){}
        public void flow(){
            if (temperature > 40){
                System.out.println("���ڴ����");
            } else if (temperature < 0) {
                System.out.println("���ڴ�ů��");
            }else {
                System.out.println("���ڹرտյ�");
            }
        }
    }
    public static Air2 get2(double temperature){
        return new Air2(temperature);
    }
}
