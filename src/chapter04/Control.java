package  chapter04;
import java.util.Scanner;
//test1:break��ת
class ControlTest1{
    public static void main(String[] args){
        //1.��ǩ��ʹ��
        label1://��ѭ��
        for(int j = 0;j < 4;j++){
            label2://��ѭ��
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    break label1;//������ѭ������������ѭ��
                  //break(label2)��������ѭ����������ѭ��
                }
            System.out.println("i=" + i);
            }
        }
        //2.1-100���ڵ�����ͣ��󵱺͵�һ�δ���20�ĵ�ǰ����
        int sum = 0;
        int now = 0;
        for(int a = 1;a <= 100;a++){
            sum += a;
            if(sum > 20){
                now = a;
                break;
            }
        }
        System.out.println("ѭ������,��ǰ��Ϊ��" + now);
        //3.���λ����½��֤��
        //�û���Ϊ���棬����Ϊ666��ʾ��½�ɹ���������ʾʣ��Ļ��������
        //1.���ñ�����chance������(Scanner)�û���(name)������(secret)
        Scanner myScanner = new Scanner(System.in);
        int chance = 3;
        String name = " ";
        String secret = " ";
        for(int b =1;b <= 3; b++){
            System.out.println("�������û�����");
            name = myScanner.next();
            System.out.println("���������룺");
            secret = myScanner.next();
            //���ַ�������ȱȽϣ�String2.equals(String1)
            //�����ַ���д��ǰ�棺�����ָ��
            if("����".equals(name) && "666".equals(secret)){ 
                break;
            }
            chance--; 
            System.out.println("��ʣ" + chance + "�λ���");
        }
        System.out.println("���ѳɹ���¼��");
    }
}

//test2:continue��ת
class ControlTest2{
    public static void main(String[] args){
        //1.��ǩ��ʹ��
        label1://��ѭ��
        for(int j = 0;j < 4;j++){
            label2://��ѭ��
            for(int i = 0;i < 10;i++){
                if(i == 2){
                    continue label1;//��ת����ѭ��j++����ִ��
                  //break(label2)����ת����ѭ��i++����ִ��
                }
            System.out.println("i=" + i);
            }
        }
    }
}