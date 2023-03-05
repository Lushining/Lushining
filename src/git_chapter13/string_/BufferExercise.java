package string_;

import java.util.Scanner;

/**
 * @author Lusion
 * @version 1.0
 */
//输入商品名称和价格,打印<名称> <价格> /n <> <>
/*小数点前每三位加一个","
  1.转换(使用SB的insert方法)：S->SB(构造器/append方法)
  2.定位小数点：index = sb.indexOf()
  3.小数点前三位：index - 3；
  4.插入：StringBuffer.insert(index,"")
  5.每三位(循环)：
  ①.substring()截取整数部分->循环次数(.length/3)-1
  ②(i=index-3;i>3;i-=3)
 */
public class BufferExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品名");
        String name = scanner.next();
        System.out.println("请输入价格");
        String str = scanner.next();
        StringBuffer price = new StringBuffer(str);
        int index = price.indexOf(".");
//        str = str.substring(0,index);   //截取小数点前的字符串
//        for (int i = 0;i < (str.length()/3)-1;i++){
//            index -= 3;
//            price.insert(index,",");
//        }
        for (int i = index-3;i > 3 ;i -= 3){
            price.insert(i,",");
        }

        System.out.println("商品名"+"商品价格");
        System.out.println(name+"\t"+price);
    }
}
