package chapter04;
//test1单分支：输入年龄，大于18则输出"你成年了"
import java.util.Scanner;
public class Branch {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的年龄：");
        int age = myScanner.nextInt();
        if(age>18){
        System.out.println("恭喜你成年了！");
        }
        System.out.println("程序继续...");
    } 
}
//test2双分支：否则输出"很遗憾，你还未成年..."
class Test2 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的年龄");
        int age = myScanner.nextInt();
        if(age>18){
            System.out.println("恭喜你成年了！");
        }
        else{
            System.out.println("很遗憾你还未成年...");
        }
        System.out.println("程序继续...");
    } 
}
//test3单分支与双分支
class Test3 {
    public static void main(String[] args){
    /*
    1.声明两个double并赋值
      判断第一个数大于10.0，且第二个小于20.0，打印两数和
    */
        double a = 15;
        double b = 16;
        if(a > 10.0 && b < 20.0){
         System.out.println("a+b ="+ (a + b));
        }
    /*
    2.定义两个int，判断和是否能被3和5整除
    */
        int c = 15;
        int d = 20;
        int e = c + d;
        if(e % 3 == 0 && e % 5 == 0){
            System.out.println("??????????3??5????");
        }
        else{
            System.out.println("????????????3??5????");
        }
    /*
    3.判断年份是否为闰年
      闰年：被4整除不被100整除/被400整除
    */
        int year =2023;
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("今年是闰年");
        }
        else{
            System.out.println("今年不是闰年");
        }
    } 
}
/*test4:多分支
  键盘输入马保国的信用积分
  1.100->信用极好
  2.(80.99]->信用优秀
  3.[60,80)->信用一般
  4.其他->信用不及格
  5.输入不为整数："hello"->异常处理机制
*/
class Test4{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的信用机积分(1-100)：");
        int score = myScanner.nextInt();
        if(score >=1 && score <= 100){
            if(score == 100){
                System.out.println("信用极好");
            }
            else if(score >80 && score <= 99){
                System.out.println("信用优秀");
            }
            else if(score >=60 && score <= 80){
                System.out.println("信用一般");
            }
            else{
                System.out.println("信用不及格");
            }
        }
        else{
            System.out.println("您的输入有误，请重新确认...");
        }
    }
}
//test5嵌套分支
/*歌手比赛
  1.初赛成绩>8.0，进入决赛，否则提示淘汰
  2.???????????????????????
  3.??????????????????????
*/
class Test5{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("青春输入您的初赛成绩");
        double score = myScanner.nextDouble();
        if(score > 8.0){
            System.out.println("恭喜您已成功进入决赛");
            //String->char
            System.out.println("请输入您的性别");
            char gender = myScanner.next().charAt(0);
            if(gender == '男'){
                System.out.println("你的组别是男子组");
            }
            else if(gender == '女'){
                System.out.println("您的组别为女子组");
            }
            else{
                System.out.println("您的输入有误，请重新确认...");
            }
        }
        else{
            System.out.println("很遗憾您被淘汰了...");
        }
    }
}
//test6嵌套分支
/*根据淡旺季的月份和年龄打印票价哦
1.旺季(4-10):
  成人(18-60):60
  儿童(<18):1/2
  老人(>60):1/3
2.淡季：成人40；其他20
*/   
class Test6{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入当前季节");
        int month = myScanner.nextInt();
        if(month >= 4 && month <= 10){
            System.out.println("当前为旺季");
            System.out.println("请输入您的年龄");
            int age = myScanner.nextInt();
            if(age < 18){
                System.out.println("您的票价为30元");
            }
            else if(age >= 18 & age <= 60){
                System.out.println("您的票价为60元");
            }
            else if(age > 60){
                System.out.println("您的票价为20元");
            }
        }
        else if((month >= 1 && month < 4) || (month > 10 && month <=12)){
            System.out.println("当前为淡季");
            System.out.println("请输入您的年龄");
            int age = myScanner.nextInt();
            if(age >= 18 && age <= 60){
                System.out.println("您的票价为40元");
            }
            else{
                System.out.println("您的票价为20元");
            }
        }
        else{
            System.out.println("您的输入有误，请重新确认...");
        }
    }
}
//test7switch分支
/*
1.?接收一个字符：a,b,c,d,e,f,g
2.a->星期一，b->星期二....
3.根据用户输入显示相应信息
*/
class Test7{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个字符(a-g)");
        char receive = myScanner.next().charAt(0);
        switch(receive){
            case 'a':
            System.out.println("星期一");
            break;
            case 'b':
            System.out.println("星期二");
            break;
            case 'c':
            System.out.println("星期三");
            break;
            case 'd':
            System.out.println("星期四");
            break;
            case 'e':
            System.out.println("星期五");
            break;
            case 'f':
            System.out.println("星期六");
            break;
            case 'g':
            System.out.println("星期天");
            break;
            default:
            System.out.println("您的输入有误，请重新确认...");
            break;
        }
        System.out.println("程序结束，退出swith");

    }
}
//test8:switch
//小写char转换大写，只转换a-e,其他输出other
class Test8{
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    System.out.println("请输入一个小写字符(a-e)");
    char small = myScanner.next().charAt(0);
    switch(small){
        case 'a':
            System.out.println("A");
            break;
        case 'b':
            System.out.println("B");
            break;
        case 'c':
            System.out.println("C");
            break;
        case 'd':
            System.out.println("D");
            break;
        case 'e':
            System.out.println("E");
            break;
        default:
            System.out.println("other");
    }
    System.out.println("程序结束，退出switch...");
    }
}
//test9嵌套分支：双分支+switch
//学生成绩>60输出合格60，低于60输出不合格；且输入成绩不大于100
class Test9{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的成绩(0-100)");
        double score = myScanner.nextDouble();
        //case的常量值数据类型必须为：byte/short/int/char/enum/String
        if(score >= 0 && score <=100){
            switch((int)score/60){
                case 1:
                    System.out.println("???");
                    break;
                case 0:
                    System.out.println("?????");
                    break;
            }
        }
        else{
        System.out.println("您的输入有误，请重新确认...");
        }
    }
}
//test10嵌套分支：switch+双分支
//打印月份所属的季节：春(3/4/5),夏(6/7/8),秋(9/10/11),冬(12/1/2)
class Test10{
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入当前季节(0-12)：");
        int month = myScanner.nextInt();
        if(month >=1 && month <=12){
            switch(month){
                //case不同常量值同输出可合并
                case 3:
                case 4:
                case 5:
                    System.out.println("春季");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("夏季");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("秋季");
                    break;
                case 12:
                case 1:
                case 2:
                    System.out.println("冬季");
                    break;
            }
        }
        else{
            System.out.println("您的输入有误请重新确认...");
        }
    }
}
