package view;
import house.House;
import service.Service;
import util.Utility;

import java.util.Scanner;
/*����㣺
1.��ʾ���˵���
2.�����������ѡ��
3.����ҵ����д��Ӧ������ɾ������
 */
public class View {
/*mainMenu():��ʾ�˵������ѡ��
  1.��ʾ���棺do...while(loop)
  2.���ѡ��switch(scanner choose)
 */
   private boolean loop = true;
   private Scanner scanner = new Scanner(System.in);
   private int choose;
    public void mainMenu(){
        do {
            System.out.println("==========���ݳ���ϵͳ==========");
            System.out.println("\t\t\t1 ������Դ");
            System.out.println("\t\t\t2 ���ҷ�Դ");
            System.out.println("\t\t\t3 ɾ������");
            System.out.println("\t\t\t4 �޸���Ϣ");
            System.out.println("\t\t\t5 �����б�");
            System.out.println("\t\t\t6 ��   ��");
            System.out.print ("��ѡ��(1-6):");
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
        System.out.println("==========�ɹ��˳�ϵͳ==========");
    }

/*list()����ӡ�����б�
  1.�����б�����Service���󣬵���ҵ�񷽷���House[] houses = service.list();
  2.����������Զ�����toString()
 */
    Service service = new Service(10);
    public void list(){
        System.out.println("----------�����б�----------");
        System.out.println("���\t\t����\t\t�绰\t\t��ַ\t\t����\t\t״̬(δ����/�ѳ���)");
        House[] houses = service.list();
        for(int i = 0;i < houses.length;i++){
            if(houses[i] == null){
                break;}
            System.out.println(houses[i]);}
        System.out.println("----------����б�----------");
    }
/*boolean add(House newHouse)����������
  1.�����û�����
  2.����һ���¶���
  3.����¶����Զ�����id
 */
    public void add(){
        System.out.println("----------��ӷ���----------");
        System.out.print("����:");
        String name = scanner.next();
        System.out.print("�绰:");
        String number = scanner.next();
        System.out.print("��ַ:");
        String address = scanner.next();
        System.out.print("����:");
        int fare = scanner.nextInt();
        System.out.print("״̬(δ����/�ѳ���):");
        String situation = scanner.next();
        House newHouse = new House(0,name,number,address,fare,situation);
        service.add(newHouse);
        System.out.println("----------������----------");
    }
/*delete()��ɾ������
1.�������룺delId��confirmChoice
2.�������룺-1�˳�
3.ȷ�����ѣ�ѭ�������Y/N
4.ȷ��ɾ����Y->ҵ�񷽷�(false/true)
 */
    public void delete() {
        System.out.println("----------ɾ����Դ----------");
        System.out.print("�������ɾ���ķ��ݱ��(-1�˳�)��");
        int delId = scanner.nextInt();
        if (delId == -1) {
            System.out.println("----------����ɾ��----------");
            return;}    //��ʾ����һ������
//        char choice = Utility.readConfirmSelection();    //Y/N
        System.out.println("ɾ���޷��ָ������ٴ�ȷ��(Y/N)");
        String choice;
        for(;;){
            choice = scanner.next().toUpperCase();//ת���ɴ�д
            if(choice.equals("Y") || choice.equals("N")){
                break;
            }else{
                System.out.println("ѡ�����,����������");
            }
        }
        if(choice.equals("Y")){    //ҵ��㣺��������ɾ��
            if (service.delete(delId)){
                System.out.println("�ɹ�ɾ�����Ϊ"+delId+"�ķ�����Ϣ");
            }
        }else{
            System.out.println("----------����ɾ��----------");
        }
    }
//�����˳�ϵͳ������ȷ������
    public void exit(){
        char delChoice = Utility.readConfirmSelection();
        if (delChoice == 'Y'){
            loop = false;
        }
    }
/*���ҷ���
1.�������룺searchId
2.�������->ҵ�񷽷�
 */
    public void search(){
        System.out.println("----------���ҷ�Դ----------");
        System.out.print("������������ҵķ���id��");
        int searchId = new Scanner(System.in).nextInt();
        House house = service.search(searchId);
        if (house != null) {
            System.out.println(house);
        }
        System.out.println("�ܱ�Ǹ���÷��ݲ�����");
        System.out.println("----------��ɲ���----------");
    }
/*�޸���Ϣ
1.�������룺upIdѡ�����  -1�˳�
2.��λ����->ҵ�񷽷�
3.�������룺��ʾ�����޸ĵĶ�����Ϣ
4.����޸ģ�setter&getter->ģ�Ͳ�
 */
    public void update(){
        System.out.println("----------�޸���Ϣ----------");
        System.out.print("��ѡ����޸ĵķ��ݱ��(-1):");
        int upId = new Scanner(System.in).nextInt();
        if (upId == -1){
            System.out.println("----------�����޸�----------");
            return;
        }
        House house = service.search(upId);
        if (house == null){
            System.out.println("�ܱ�Ǹ���÷��ݲ�����");
            return;
        }
        System.out.print("����("+house.getName()+"):");
        //��ֱ�ӻس�����ʾ���޸���Ϣ��ֱ�ӷ���Ĭ��ֵ
        String upName = Utility.readString(5,house.getName());
        //�������룬������޸�
        if (upName != null) {
            house.setName(upName);
        }
        System.out.print("�绰("+house.getNumber()+"):");
        String upNum = new Scanner(System.in).next();
        house.setNumber(upNum);
        System.out.print("��ַ("+house.getAddress()+"):");
        String upAdr = new Scanner(System.in).next();
        house.setAddress(upAdr);
        System.out.print("���("+house.getFare()+"):");
        int upFare = new Scanner(System.in).nextInt();
        house.setFare(upFare);
        System.out.print("״̬("+house.getSituation()+"):");
        String upSit = new Scanner(System.in).next();
        house.setSituation(upSit);
        System.out.println("----------����޸�----------");
    }
}




