package chapter05;

public class Array2 {
    public static void main(String[] args){
        //输出一个二维数组
        int[] line1 = {0,0,0,0,0,0};
        int[] line2 = {0,0,1,0,0,0};
        int[] line3 = {0,2,0,3,0,0};
        int[] line4 = {0,0,0,0,0,0};
        int[][] square = {line1,line2,line3,line4};
        for(int i = 0;i < square.length;i++){
            for(int j = 0;j < square[i].length;j++){
                System.out.print(square[i][j] + "\t");
            }
            System.out.println();
        }
        //二维数组的列不确定
        int[][] arr = new int[3][];//创建一维数组但未开辟内存空间
        for(int m = 0;m < arr.length;m++) {
            arr[m] = new int[m+1];//给一维数组开辟内存空间
            for(int n = 0 ;n < arr[m].length;n++){
                arr[m][n] = n + 1;
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
//test2：二维数组求和
class Array2Test2{
    public static void main(String[] args){
        int arr[][] = {{4,6},{1,4,5,7},{-2}};
        int sum = 0;
        for(int m = 0;m < arr.length;m++){
            for(int n = 0;n < arr[m].length;n++){
                sum += arr[m][n];
            }
        }
        System.out.println("sum=" + sum);
    }
}
//test3：打印杨辉三角形
class  Array2Test3{
    public static void main(String[] args){
        int[][] arr = new int[10][];//创建二维数组
        for(int i = 0;i < arr.length;i++) {
            arr[i] = new int[i + 1];//开辟一维空间,第几个数组就有几个元素
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;//首位末位均为1
                }
                else {//从第三行(i=2)开始,除了首位末位的赋值
                    arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
                }
            }
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr[m].length; n++) {
                System.out.print(arr[m][n] + "\t");
            }
            System.out.println();
        }
    }
}
