package homework_;
//异常处理机制：B C D
/*1.func()：t-f(抛出异常)：顺序执行输出B->返回异常->退出程序
  2.e->catch：处理异常输出C
  3.处理异常：顺序执行try代码，输出D
 */
/**
 * @author Lusion
 * @version 1.0
 */
public class Work03 {
    public static void main(String[] args) {
        try{
            func();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void func(){
        try{
            throw new RuntimeException();
        }
        finally {
            System.out.println("B");
        }
    }
}
