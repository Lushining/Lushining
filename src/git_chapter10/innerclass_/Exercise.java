package innerclass_;
public class Exercise {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("Æð´²À²£¡£¡");
            }
        });
        phone.clock(new Bell() {
            @Override
            public void ring() {
                System.out.println("ÉÏ¿ÎÀ²£¡£¡");
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
