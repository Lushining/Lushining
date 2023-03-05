package interface_;
//类：连接并重写接口的抽象方法
public class Phone implements Usb{
    @Override
    public void start() {
        System.out.println("手机开始工作");
    }
    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
