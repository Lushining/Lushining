package interface_;
//�ࣺ���Ӳ���д�ӿڵĳ��󷽷�
public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("�ֻ���ʼ����");
    }
    @Override
    public void stop() {
        System.out.println("�ֻ�ֹͣ����");
    }
}
