package view;
import house.House;
import service.Service;
import util.Utility;

import java.util.Scanner;
/*界面层：
1.显示主菜单；
2.接受输入完成选择
3.调用业务层编写对应方法完成具体操作
 */
public class View {
/*mainMenu():显示菜单，完成选择
  1.显示界面：do...while(loop)
  2.完成选择：switch(scanner choose)
 */
   private boolean loop = true;
   private Scanner scanner = new Scanner(System.in);
   private int choose;
    public void mainMenu(){
        do {
            System.out.println("==========房屋出租系统==========");
            System.out.println("\t\t\t1 新增房源");
            System.out.println("\t\t\t2 查找房源");
            System.out.println("\t\t\t3 删除房屋");
            System.out.println("\t\t\t4 修改信息");
            System.out.println("\t\t\t5 房屋列表");
            System.out.println("\t\t\t6 退   出");
            System.out.print ("请选择(1-6):");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    list();
                    break;
                case 6:
                    exit();
                    break;}
        }while(loop);
        System.out.println("==========成功退出系统==========");
    }

/*list()：打印房屋列表
  1.接收列表：创建Service对象，调用业务方法；House[] houses = service.list();
  2.遍历输出：自动调用toString()
 */
    Service service = new Service(10);
    public void list(){
        System.out.println("----------房屋列表----------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");
        House[] houses = service.list();
        for(int i = 0;i < houses.length;i++){
            if(houses[i] == null){
                break;}
            System.out.println(houses[i]);}
        System.out.println("----------完成列表----------");
    }
/*boolean add(House newHouse)：新增房屋
  1.接收用户输入
  2.创建一个新对象
  3.添加新对象并自动分配id
 */
    public void add(){
        System.out.println("----------添加房屋----------");
        System.out.print("姓名:");
        String name = scanner.next();
        System.out.print("电话:");
        String number = scanner.next();
        System.out.print("地址:");
        String address = scanner.next();
        System.out.print("月租:");
        int fare = scanner.nextInt();
        System.out.print("状态(未出租/已出租):");
        String situation = scanner.next();
        House newHouse = new House(0,name,number,address,fare,situation);
        service.add(newHouse);
        System.out.println("----------完成添加----------");
    }
/*delete()：删除房屋
1.接受输入：delId，confirmChoice
2.过滤输入：-1退出
3.确认提醒：循环至输出Y/N
4.确认删除：Y->业务方法(false/true)
 */
    public void delete() {
        System.out.println("----------删除房源----------");
        System.out.print("请输入待删除的房屋编号(-1退出)：");
        int delId = scanner.nextInt();
        if (delId == -1) {
            System.out.println("----------放弃删除----------");
            return;}    //表示结束一个方法
//        char choice = Utility.readConfirmSelection();    //Y/N
        System.out.println("删除无法恢复，请再次确认(Y/N)");
        String choice;
        for(;;){
            choice = scanner.next().toUpperCase();//转换成大写
            if(choice.equals("Y") || choice.equals("N")){
                break;
            }else{
                System.out.println("选择错误,请重新输入");
            }
        }
        if(choice.equals("Y")){    //业务层：真正进行删除
            if (service.delete(delId)){
                System.out.println("成功删除编号为"+delId+"的房屋信息");
            }
        }else{
            System.out.println("----------放弃删除----------");
        }
    }
//完善退出系统：增加确认提醒
    public void exit(){
        char delChoice = Utility.readConfirmSelection();
        if (delChoice == 'Y'){
            loop = false;
        }
    }
/*查找房屋
1.接受输入：searchId
2.输出对象：->业务方法
 */
    public void search(){
        System.out.println("----------查找房源----------");
        System.out.print("请输入您想查找的房屋id：");
        int searchId = new Scanner(System.in).nextInt();
        House house = service.search(searchId);
        if (house != null) {
            System.out.println(house);
        }
        System.out.println("很抱歉，该房屋不存在");
        System.out.println("----------完成查找----------");
    }
/*修改信息
1.接受输入：upId选择对象  -1退出
2.定位对象：->业务方法
3.接受输入：显示将被修改的对象信息
4.完成修改：setter&getter->模型层
 */
    public void update(){
        System.out.println("----------修改信息----------");
        System.out.print("请选择待修改的房屋编号(-1):");
        int upId = new Scanner(System.in).nextInt();
        if (upId == -1){
            System.out.println("----------放弃修改----------");
            return;
        }
        House house = service.search(upId);
        if (house == null){
            System.out.println("很抱歉，该房屋不存在");
            return;
        }
        System.out.print("姓名("+house.getName()+"):");
        //若直接回车，表示不修改信息，直接返回默认值
        String upName = Utility.readString(5,house.getName());
        //若有输入，则进行修改
        if (upName != null) {
            house.setName(upName);
        }
        System.out.print("电话("+house.getNumber()+"):");
        String upNum = new Scanner(System.in).next();
        house.setNumber(upNum);
        System.out.print("地址("+house.getAddress()+"):");
        String upAdr = new Scanner(System.in).next();
        house.setAddress(upAdr);
        System.out.print("租金("+house.getFare()+"):");
        int upFare = new Scanner(System.in).nextInt();
        house.setFare(upFare);
        System.out.print("状态("+house.getSituation()+"):");
        String upSit = new Scanner(System.in).next();
        house.setSituation(upSit);
        System.out.println("----------完成修改----------");
    }
}




