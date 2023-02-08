package chapter07;
//冒泡排序
public class Idea {
    public static void main(String[] args){
        int[] arr = {3,1,5,4,2};
        MyTools tool = new MyTools();
        System.out.println("======原数组======");
        for(int i = 0;i < arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        tool.bool(arr);
        System.out.println("======新数组======");
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
class MyTools{
    String name;

    public void bool(int[] arr){
        for(int j = 0;j <arr.length -1;j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }
}
