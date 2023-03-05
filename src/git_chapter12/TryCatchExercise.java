import java.util.Scanner;
/**
 * @author Lusion
 * @version 1.0
 */
//获取整数：输入的不是整数则提示反复输入直至输入一个整数
/*1.定义输入与接收：new Scanner；int num
  2.建立循环(true)：获得int(没有异常)则break
  3.异常控制(数据格式不正确)：Integer.parseInt(myScanner.next())
 */
public class TryCatchExercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("请输入一个整数：");
            try {
                num = Integer.parseInt(myScanner.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入有误");
            }
        }while(true);
        System.out.println("获取整数，程序结束");
    }
}
