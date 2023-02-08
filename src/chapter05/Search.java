package chapter05;

//test1：顺序查找
/*1.四个人猜数游戏，键入任意一个名称，判断是否包含；
  2.包含则提示找到，并给出下标值
  3.使用标识符帮助判断
 */
import java.util.Scanner;
public class Search {
    public static void main(String[] args){
        String[] arr ={"白眉鹰王","金毛狮王","紫衫龙王","青翼蝠王"};
        System.out.println("请输入您的名称：");
        Scanner myScanner = new Scanner(System.in);
        String name = myScanner.next();
        int index = -1;
        for(int i = 0;i < arr.length;i++) {
            if (arr[i].equals(name)) {
                System.out.println("已找到用户" + name);
                System.out.println("您的下标为：" + i);
                index = i;
                break;
            }
        }
        if(index == -1){
            System.out.println("抱歉，未找到您的用户名");
        }
    }
}
//test2：对有序数组进行二分查找
/*{1,8,10,89,1000,1234}
1.输入一个数判断是否存在，有则求出下标值
2.没有则提示“没有这个数”
*/
