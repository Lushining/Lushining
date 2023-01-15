//work01
public class work01{
    public static void main(String[] args){
        int n1 = 13;
        int n2 = 17;
        int n3 = n1 + n2;
        System.out.println("n3=" + n3);//n3=30
        int n4 = 38;
        int n5 = n4 - n3;//n5=8
        System.out.println("n5=" + n5 );
    }
}

//work02:使用char分别保存\n 1 等字符并打印输出
class work02{
    public static void main(String[] args){
        char a = '\n';
        char b = '1';
        char c = 1;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println((int)c); 
    }
}
//work03：保存两本书名/两个性别/两本书的价格，用+拼接看效果。
class work03{
    public static void main(String[] args){
        String a1 = "半生缘";
        String a2 = "小团圆";
        char b1 = '男';
        char b2 = '女';
        double c1 = 10.0;
        double c2 = 20.0;
        System.out.println(a1 + a2); //字符串拼接
        System.out.println(b1 + b2); //char+char=int
        System.out.println(c1 + c2); //double
    }
}

/*work04：
  姓名 年龄 成绩 性别 爱好
  xx   xx  xx   xx   xx
  1)变量储存
  2)使用+
  3)添加转义字符以一条语句输出
*/
class work04{
    public static void main(String[] args){
        String a = "卢诗宁";
        byte b = 22;
        byte c = 100;
        char d = '女';
        String e = "阅读";
        char x = '\t';
        System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+
        a + x + b + x + c + x + d + x + e); //输出信息可以换行
    }
}