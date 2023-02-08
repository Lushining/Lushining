package chapter05;
/*判断
1.String strs[] = {'a','b','c'};F:char->String
2.String[] strs ={"a","b","c"};T
3.String strs[] =new String{"a","b","c"};F:String[]->String
 4.String strs[] =new String[]{"a","b","c"};T
 5.String strs[] =new String[3]{"a","b",”c“};F
 */
//test1:升序数组插入元素仍为升序:定位->扩容->赋值
import java.util.Scanner;
public class Hw05 {
    public static void main(String[] args){
        int[] arr = {10,12,45,90};
        int insert = 23;
        int index = 0;
        for(int i = 0;i < arr.length;i++){
            if(insert < arr[i]){
                index = i ;
                break;
            }
            index = arr.length;
        }
        System.out.println(insert + "应插入第" + index + "位");
        int[] arr2 = new int[arr.length + 1];
//方法一：j = index时输入insert；
//       j != index时依次输入(arr2[j]=arr[j1])->j1++
//        for(int j = 0,j1 = 0;j < arr2.length;j++) {
//            if (j != index) {
//                arr2[j] = arr[j1];
//                j1++;
//            }
//            else  {
//                arr2[j] = insert;
//            }
//        }
//方法二：</=/>
        for(int j = 0;j < arr2.length;j++) {
            if(j < index){
                arr2[j] = arr[j];
            }
            else if(j == index){
                arr2[j] = insert;
            }
            else if(j > index){
                arr2[j] = arr[j - 1];
            }
        }

        arr = arr2;
        System.out.println("====新数组为====");
        for(int k = 0;k < arr.length;k++){
            System.out.print(arr[k] + "\t");
        }
    }
}
//test2:1.随机生成10个整数(1-100)保存到数组
//        随机生成一个数：Math.random()=(0.0,1.0)
//      2.倒序打印
//      3.求平均值、最大值和最大值的下标
//      4.查找其中是否有8
class Hw05t2{
    public static void main(String[] args){
        int[] arr = new int[10];
        for(int i = 0;i < arr.length;i++){
            arr[i] = (int)(Math.random()*100) + 1;
        }
        System.out.println("====随机生成的数组如下====");
        for(int j = 0;j < arr.length;j++){
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        System.out.println("====倒序打印得到数组====");
        for(int k = 0;k < arr.length;k++){
            System.out.print(arr[arr.length-1-k]+"\t");
        }

        double sum = 0;
        for(int m = 0;m < arr.length;m++){
            sum += arr[m];
        }
        System.out.println();
        System.out.println("sum="+sum);
        System.out.println("average="+(sum/arr.length));

        int max = arr[0];
        int index = 0;
        for(int n = 0;n < arr.length;n++){
            if(max < arr[n]){
                max = arr[n];
                index = n;
            }
        }
        System.out.println("max="+max);
        System.out.println("max_index="+index);

        int num = 8;
        int search = -1;
        for(int s = 0;s < arr.length;s++){
            if(arr[s] == num){
                search = s;
                System.out.println("第"+(search+1)+"个数为8");
                break;
            }
        }
        if(search == -1){
            System.out.println("该数组不存在8");
        }
    }
}

//test3:冒泡排序从小到大:数组交换(内)+轮次(外)
class Hw05t3{
    public static void main(String[] args){
        int[] arr = {20,-1,89,2,890,7};
        for(int j = 0;j < arr.length-1;j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("====排序后结果为====");
        for(int k = 0;k < arr.length;k++){
            System.out.print(arr[k] + "\t");
        }
    }
}