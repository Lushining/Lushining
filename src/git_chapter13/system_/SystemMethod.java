package system_;
import java.util.Arrays;
/**
 * @author Lusion
 * @version 1.0
 */
/*static方法
  1.退出当前程序：exit(0)
  2.复制数组元素：arraycopy(src,srcPos,dest,destPos,length)
  3.返回时间差：currentTimeMillions()     //vs1979-1-1
  4.垃圾回收：gc()   //gc()触发回收->Object.finalize()回收前调用方法
 */
public class SystemMethod {
    public static void main(String[] args) {
        //1.exit
        System.out.println("=====退出当前程序=====");
        System.out.println("start");
//        System.exit(0);
        System.out.println("end");
        //2.arraycopy(src,srcPos,dest,destPos,length)
        System.out.println("=====数组拷贝=====");
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[3];    //默认{0,0,0}
        //@param src        source array
        //@param srcPos     start position
        //@param dest       destination array
        //@param destPos    start position
        //@param length     the number of elements to be copied
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));
        //3.currentTimeMillions()
        System.out.println("=====返回时间差毫秒数=====");

    }
}
