package chapter02;
//work01
public class Hw02{
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

//work02:char的本质是一个整数，可以进行计算最终转换成unicode编码输出；
class Hw02t2{
    public static void main(String[] args){
        char a = '\n';
        char b = '1';
        char c = 1;
        System.out.println(a); 
        System.out.println(b); 
        System.out.println((int)c); 
    }
}
//work03
class Hw02t3{
    public static void main(String[] args){
        String a1 = "my";
        String a2 = "name";
        char b1 = 'a';
        char b2 = 'b';
        double c1 = 10.0;
        double c2 = 20.0;
        System.out.println(a1 + a2); //字符串相加
        System.out.println(b1 + b2); //char+char=int
        System.out.println(c1 + c2); //double的运算必须均为double才能输出精确小数；
    }
}

/*work04：
  姓名 年龄 成绩  性别 籍贯
  xx   xx  xx   xx   xx
*/
class Hw02t4{
    public static void main(String[] args){
        String a = "卢诗宁";
        byte b = 22;
        byte c = 100;
        char d = '女';
        String e = "浙江";
        char x = '\t';
        System.out.println("姓名\t年龄\t?成绩\t性别\t籍贯\n"+
        a + x + b + x + c + x + d + x + e);
    }
}