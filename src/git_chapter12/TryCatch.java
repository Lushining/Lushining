/**
 * @author Lusion
 * @version 1.0
 */
//1.try是否发生异常：跳过try->catch；顺序try->跳过catch
//2.多catch择一：子类在前，父类在后，只就近执行一个
public class TryCatch {
    public static void main(String[] args) {
        try {
            Person p = new Person();
            p = null;
            System.out.println("空指针异常:"+p.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1/n2;
            System.out.println("算数异常："+res);
        } catch (NullPointerException e) {
            System.out.println("空指针异常："+e.getMessage());
        }catch(ArithmeticException e){
            System.out.println("算数异常="+e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
class Person{
    private String name;
    public String getName() {
        return name;
    }
}
