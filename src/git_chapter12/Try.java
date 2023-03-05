/**
 * @author Lusion
 * @version 1.0
 */
public class Try {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;
        try {
            int res = n1 / n2;
        } catch (Exception e) {
            e.printStackTrace();//堆栈跟踪
            System.out.println(e.getMessage());//输出异常信息
        }
        System.out.println("continue...");
    }

}
