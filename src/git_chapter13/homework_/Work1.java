package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
/*String反转：abcdef->aedcbf
  1.截取子字符串：String.substring
  2.子字符串反转
    ①获得数组：.toArrayChar()
    ②数组反转：交换元素(temp)/新数组逆向遍历
  3.获得完整字符串
    ①返回子字符串：char[]->String：遍历+contact()
    ②替换：.replace()
 */

public class Work1 {
    public static void main(String[] args) {
        String s = "abcdef";
        System.out.println(reserve(s,1,4));
    }
    public static String reserve(String s,int start,int end){
        String newS = s.substring(start,end+1);     //截取子字符串
        char[] str = newS.toCharArray();            //获取数组
        char temp ;
        for (int i = 0; i < str.length/2; i++) {    //数组反转
            temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        String newStr ="";                             //char[]->String
        for (int i = 0; i < str.length; i++) {
            newStr = newStr.concat(str[i]+"");
        }
        String res = s.replace(newS,newStr);
        return res;
    }
}
