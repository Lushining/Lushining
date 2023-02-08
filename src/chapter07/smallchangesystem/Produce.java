package chapter07.smallchangesystem;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/*
1.编写菜单并给出相应提示;
  1.1无限循环do{}while()先执行一次:loop=true->4=false->退出
  1.2选择菜单(1-4)并提示：用户键入(choose)+switch分支
2.显示明细(detail)：数组、对象、字符串拼接√
3.输入收支信息：
  3.1设置变量：项目project+金额money+时间date(Date+SDF)+余额(+/-=money)
  3.2拼接收支信息到明细(+=detail)
4.优化
  4.1退出时，提示“你确定要退出吗？y/n"，无限循环直到输入正确的y/n
  4.2输入收支金额时：判断金额是否合理比能够给出提示
 */
public class Produce {
    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String choose;
        String project = "";
        double money = 0;
        double balance = 0;
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String details = "======零钱通明细======\n";

        do {
            System.out.println("======零钱通菜单======");
            System.out.println("\t\t1.明细");
            System.out.println("\t\t2.入账");
            System.out.println("\t\t3.支出");
            System.out.println("\t\t4.退出");
            System.out.print("请输入您要访问的项目(1-4):");
            choose = scanner.next();
            switch (choose){
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("======零钱通入账======");
                    System.out.print("项目：");
                    project = scanner.next();
                    System.out.print("入账金额：");
                    money = scanner.nextDouble();
                    //接收不正确的金额则给出提示并退出
                    if(money <= 0){
                        System.out.println("收益金额必须大于0");
                        break;
                    }
                    balance += money;
                    date = new Date();  //获取当前日期
                    details += project+"\t+"+money+"\t"+sdf.format(date)+"\t"+balance+"\n";
                    break;
                case "3":
                    System.out.println("======零钱通支出======");
                    System.out.print("项目：");
                    project = scanner.next();
                    System.out.print("支出金额：");
                    money = scanner.nextDouble();
                    if(money <= 0 || money > balance){
                        System.out.println("支出金额必须为0-"+balance);
                        break;
                    }
                    balance -= money;
                    date = new Date();  //获取当前日期
                    details += project+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance+"\n";
                    break;
                case "4":
                    //1.过滤y+n，否则无限循环“您确定要退出吗?(y/n)”
                    //2.过滤y/n：y退出，n回到菜单
                    String choice = "";
                    while(true) {
                        System.out.print("您确定要退出吗?(y/n)");
                        choice = scanner.next();
                        if (choice.equals("y") || choice.equals("n")) {
                            break;
                        }
                    }
                    if(choice.equals("y")){
                        loop = false;
                    }
                    break;
                default:
                    System.out.println("您的输入有误，请重新确认！");
                }
        }while(loop);
        System.out.println("======项目已退出======");

    }

}
