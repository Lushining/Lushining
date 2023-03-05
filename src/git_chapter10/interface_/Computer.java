package interface_;
//test：通过接口调用类的具体方法
public class Computer {
    public void work(Usb usb){
        usb.start();
        usb.stop();
    }
    public static void main(String[] args) {
        Camera camera = new Camera();
        Phone phone = new Phone();
        Computer computer = new Computer();
        computer.work(phone);
        computer.work(camera);
    }
}
