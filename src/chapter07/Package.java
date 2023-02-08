package chapter07;

import java.util.Arrays;

//1.同一个包不允许同名类，不同包允许同名类
/*2.设置:package <包名>  //顶行一个包,后接数个import
    调用类://已完成自动导入设置
    同包直接调用,不同包import/<包名>.<类名>调用*/
//3.命名规范:字母数字下划线小点;数字不开头,无关键字;
//4.常用包:java.lang  //无需导入默认使用Math.abs()/PI
public class Package {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,5};
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
