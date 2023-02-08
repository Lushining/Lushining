package chapter05;
public class Sort {
    //test1：冒泡排序法练习{24，69，80，57，13}从小到大排序
    /*1.定义变量：arr max temp
      2.分析循环：比较+数据交换->第i大的数->倒数第i位arr[len-i]--内循环
                外循环次数(len-1)，内循环-比较次数(len-1-i)
      3.分析过滤：
     */
    public static void main(String[] args) {
        int[] arr = {24,69,80,57,13};
        int temp = 0;
        int len = arr.length;
        label1:
        for(int k = 0;k < len - 1;k++){
            lable2:
            for(int i = 0;i < len - 1 - k;i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];//数组交换
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.print("第"+(k+1)+"轮排序的结果为：" );
            lable3:
            for(int j = 0 ;j < len;j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}
