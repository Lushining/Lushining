package innerclass_;
public class Exercise {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("��������");
            }
        });
        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("�Ͽ�������");
            }
        });
    }

}
interface Bell{
    void ring();
}
class Phone{
    public void clock(Bell bell){
        bell.ring();
    }
}
