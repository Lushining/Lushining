package arrays_;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Lusion
 * @version 1.0
 */
public class Bubble {
    public static void main(String[] args) {
        int[] arr = {1,-1,8,0,20};
        System.out.println("======冒泡排序======");
        bubble(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("======冒泡结合接口排序======");
        newBubble(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int i1 = (Integer) o1;
                int i2 = (Integer) o2;
                return i2-i1;   //i1-i2：i1 > i2则交换
            }
        });
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        for(int i = 0; i < arr.length-1 ; i++){
            for (int j = 0;j < arr.length-1-i;j++){
                if (arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void newBubble(int[] arr, Comparator c){
        int temp;
        for(int i = 0; i < arr.length-1 ; i++){
            for (int j = 0;j < arr.length-1-i;j++){
                //排序结果由c.compare(arr[j],arr[j+1])的返回值决定；
                if (c.compare(arr[j],arr[j+1])>0){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

}
