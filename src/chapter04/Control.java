package  chapter04;
import java.util.Scanner;
//test1:break跳转
class ControlTest1{
    public static void main(String[] args){
        //1.标签的使用
        label1://外循环
        for(int j = 0;j < 4;j++){
            label2://内循环
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    break label1;//跳出外循环，结束两个循环
                  //break(label2)；跳出内循环，继续外循环
                }
            System.out.println("i=" + i);
            }
        }
        //2.1-100以内的数求和，求当和第一次大于20的当前数；
        int sum = 0;
        int now = 0;
        for(int a = 1;a <= 100;a++){
            sum += a;
            if(sum > 20){
                now = a;
                break;
            }
        }
        System.out.println("循环结束,当前数为：" + now);
        //3.三次机会登陆验证：
        //用户名为丁真，密码为666提示登陆成功，否则提示剩余的机会次数；
        //1.设置变量：chance、键入(Scanner)用户名(name)和密码(secret)
        Scanner myScanner = new Scanner(System.in);
        int chance = 3;
        String name = " ";
        String secret = " ";
        for(int b =1;b <= 3; b++){
            System.out.println("请输入用户名：");
            name = myScanner.next();
            System.out.println("请输入密码：");
            secret = myScanner.next();
            //对字符串的相等比较：String2.equals(String1)
            //具体字符串写在前面：避免空指针
            if("丁真".equals(name) && "666".equals(secret)){ 
                break;
            }
            chance--; 
            System.out.println("仅剩" + chance + "次机会");
        }
        System.out.println("您已成功登录！");
    }
}

//test2:continue跳转
class ControlTest2{
    public static void main(String[] args){
        //1.标签的使用
        label1://外循环
        for(int j = 0;j < 4;j++){
            label2://内循环
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    continue label1;//跳转到外循环j++继续执行
                  //break(label2)；跳转到内循环i++继续执行
                }
            System.out.println("i=" + i);
            }
        }
    }
}