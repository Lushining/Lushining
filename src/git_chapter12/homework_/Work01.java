package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*接收命令行(main(String[] args))的两个整数参数进行除法运算
  1.数组下标越界异常：接收两个参数
  2.数据格式异常：整数参数
  3.算数异常：除数不为0
 */
public class Work01 {
    public static void main(String[] args) {
        try {
            //1.数组越界异常(验证参数个数)：输入两个参数
            if (args.length != 2){
                throw new ArrayIndexOutOfBoundsException("参数个数有误");
            }
            //2.数据格式异常：参数转化为整数
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            //3.算数异常：除数不能为零
            int res = cal(n1,n2);
            System.out.println("程序正确，得到结果："+res);
        } catch (NumberFormatException e){
            System.out.println("格式不正确，需要输入整数");
        } catch (ArithmeticException e){
            System.out.println("除数不为零");
        }

    }
    public static int cal(int n1,int n2){
        return n1/n2;
    }
}
