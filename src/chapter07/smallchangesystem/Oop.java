package chapter07.smallchangesystem;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

//面向对象编程：
//1.各个功能对应一个方法：details income outcome exit
//2.菜单(主方法)中访问各个功能(方法)
public class Oop {
    //定义属性（变量）
    boolean loop = true;
    String details = "======零钱通明细======\n";
    Scanner scanner = new Scanner(System.in);
    String choose;
    String project = "";
    double money = 0;
    double balance = 0;
    Date date = null;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    //1.显示菜单
    public void menu(){
        do {
            System.out.println("======零钱通菜单======");
            System.out.println("\t\t1.明细");
            System.out.println("\t\t2.入账");
            System.out.println("\t\t3.支出");
            System.out.println("\t\t4.退出");
            System.out.println("请输入您想访问的项目（1-4）：");
            choose = scanner.next();
            switch (choose){
                case "1":
                    this.details();
                    break;
                case "2":
                    this.income();
                    break;
                case "3":
                    this.outcom();
                    break;
                case "4":
                    this.exit();
                    break;
            }
        }while (loop);
    }
    //2.显示明细
    public void details(){
        System.out.println(details);
    }
    //3.入账
    public void income(){
        System.out.println("======零钱通入账======");
        System.out.print("项目：");
        project = scanner.next();
        System.out.print("入账金额：");
        money = scanner.nextDouble();
        //接收不正确的金额则给出提示并退出
        if(money <= 0){
            System.out.println("收益金额必须大于0");
            return;     //break退出循环；return跳出方法
        }
        balance += money;
        date = new Date();  //获取当前日期
        details += project+"\t+"+money+"\t"+sdf.format(date)+"\t"+balance+"\n";
    }
    //4.支出
    public void outcom(){
        System.out.println("======零钱通支出======");
        System.out.print("项目：");
        project = scanner.next();
        System.out.print("支出金额：");
        money = scanner.nextDouble();
        if(money <= 0 || money > balance){
            System.out.println("支出金额必须为0-"+balance);
            return;
        }
        balance -= money;
        date = new Date();  //获取当前日期
        details += project+"\t-"+money+"\t"+sdf.format(date)+"\t"+balance+"\n";
    }
    //5.退出
    public void exit(){
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
            System.out.println("您已退出程序");
        }
    }
}
