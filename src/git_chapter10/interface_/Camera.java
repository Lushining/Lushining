package interface_;
public class Camera implements Usb{
    @Override
    public void start() {
        System.out.println("�����ʼ����");
    }
    @Override
    public void stop() {
        System.out.println("�����������");
    }
}
