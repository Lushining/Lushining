package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*1.show方法抛出异常-进入catch：输出B
  2.顺序执行finally：输出C
  3.已处理异常-程序继续：输出D
 */
public class Work04 {
    public static void main(String[] args) {
        try{
            show();
            System.out.println("A");
        }catch (Exception e){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }
        System.out.println("D");
    }
    public static void show() throws Exception{
        throw new Exception();
    }
}
