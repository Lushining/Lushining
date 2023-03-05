package interface_;

public class PolyArray {
    public static void main(String[] args) {
        UsbArr[] arr = new UsbArr[2];
        arr[0] = new CameraArr();
        arr[1] = new PhoneArr();
        //遍历数组重写方法
        for (int i = 0; i < arr.length; i++) {
            arr[i].work();
            //向下转型实现类的特殊方法
            if (arr[i] instanceof PhoneArr){
                ((PhoneArr) arr[i]).call();
            }
        }
    }
}
interface UsbArr{
    void work();
}
class CameraArr implements UsbArr{
    @Override
    public void work() {
        System.out.println("相机正在工作");
    }
}
class PhoneArr implements UsbArr{
    public void call(){
        System.out.println("手机打电话");
    }
    @Override
    public void work() {
        System.out.println("手机正在工作");
    }
}