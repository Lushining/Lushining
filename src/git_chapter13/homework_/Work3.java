package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
//输入Han Shun Ping，打印Ping,Han.S
/*1.分割得列表：spilt(" ")
  2.格式化输出：format(%s,%s.%c)
  3.中间单词首字母：charAt(0)->toUppercase
  4.优化：!=null;length==3
 */
public class Work3 {
    public static void main(String[] args) {
        String name = "Willian Jefferson Clinton";
        print(name);
    }
    public static void print(String name){
        if (name == null){
            System.out.println("数据不能为空，请重新输入");
            return;
        }
        String[] arr = name.split(" ");
        if (arr.length != 3){
            System.out.println("格式有误，请重新输入");
            return;
        }
        String format = String.format("%s,%s.%c",arr[2],arr[0],arr[1].toUpperCase().charAt(0));
        System.out.println(format);
    }
}
