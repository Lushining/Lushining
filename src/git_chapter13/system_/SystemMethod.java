package system_;
import java.util.Arrays;
/**
 * @author Lusion
 * @version 1.0
 */
/*static����
  1.�˳���ǰ����exit(0)
  2.��������Ԫ�أ�arraycopy(src,srcPos,dest,destPos,length)
  3.����ʱ��currentTimeMillions()     //vs1979-1-1
  4.�������գ�gc()   //gc()��������->Object.finalize()����ǰ���÷���
 */
public class SystemMethod {
    public static void main(String[] args) {
        //1.exit
        System.out.println("=====�˳���ǰ����=====");
        System.out.println("start");
//        System.exit(0);
        System.out.println("end");
        //2.arraycopy(src,srcPos,dest,destPos,length)
        System.out.println("=====���鿽��=====");
        int[] arr1 = {1,2,3};
        int[] arr2 = new int[3];    //Ĭ��{0,0,0}
        //@param src        source array
        //@param srcPos     start position
        //@param dest       destination array
        //@param destPos    start position
        //@param length     the number of elements to be copied
        System.arraycopy(arr1,0,arr2,0,3);
        System.out.println(Arrays.toString(arr2));
        //3.currentTimeMillions()
        System.out.println("=====����ʱ��������=====");

    }
}
