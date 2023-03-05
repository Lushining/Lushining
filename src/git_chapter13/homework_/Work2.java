package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*1.构造对象：register(S S S)接受输入
  2.过滤输入：
    a.用户名长度
    b.密码长度&&全数字：boolean isDigital()
    c.@在.前：indexOf()
  *String全是数字：toCharArray() -> char的本质是数字(==)
  3.注册提醒：try-catch
  4.优化：空指针异常
 */
public class Work2 {
    public static void main(String[] args) {
        String name = null;
        String pwd = "123456";
        String email = "amy@qq.com";
        try {
            register(name,pwd,email);
            System.out.println("恭喜你注册成功");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("很抱歉注册失败");
        }
    }
    public static void register(String name,String pwd,String email){
        if(name == null || pwd == null || email == null){
            throw new RuntimeException("信息参数不能为空");
        }
        if (!(name.length() >=2 && name.length() <= 4)){
            throw new RuntimeException("用户名长度2-4");
        }
        if (!(isDigital(pwd) && pwd.length() == 6)){
            throw new RuntimeException("用户密码必须为数字且长度为6");
        }
        int index1 = email.indexOf("@");
        int index2 = email.indexOf(".");        //有则返回索引，无则返回-1
        if (!(index1 > 0 && index1 < index2)){
            throw new RuntimeException("用户邮箱需要@在.前");
        }
    }
    public static boolean isDigital(String pwd){
        char[] arr = pwd.toCharArray();
        for(int i = 0;i < arr.length;i++){
            if (arr[i] < '0' || arr[i] > '9'){return false;}
        }
        return true;
    }
}
