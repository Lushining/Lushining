package rentapp;

import view.View;

//1.程序入口
//2.创建对象，并调用方法显示主菜单
public class RentApp {
    public static void main(String[] args) {
        View view = new View();
        view.mainMenu();
    }
}
