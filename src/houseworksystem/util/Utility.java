package util;

import java.util.*;

/**
 *���ܣ�����������ã��������������û�����
 */
public class Utility {
    //��̬����
    private static Scanner scanner = new Scanner(System.in);

    /**
     * ���ܣ���ȡ��������Ĳ˵�ѡ�1-5��
     * @return 1-5
     */
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3'
                    && c != '4' && c != '5'){
                System.out.println("ѡ����������������");
            }else break;
        }
        return c;
    }
    /**
     * ���ܣ���ȡ�����һ���ַ�����������ѭ����
     * @retur ������ַ�
     */
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }
    /**
     * ���ܣ���ȡ�����һ���ַ����س��򷵻�Ĭ��ֵ
     * @return ������ַ���Ĭ��ֵ
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length() == 0)?defaultValue : str.charAt(0);
    }
    /**
     * ���ܣ���ȡ��������ͣ�Ҫ�󳤶�С��5
     * @return ����
     */
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(5,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("��������������ȷ��");}
        }
        return n;
    }
    /**
     * ���ܣ���ȡ�����һ�����ͣ��س��򷵻�Ĭ��ֵ
     * @return ������ַ���Ĭ��ֵ
     * @param defaultValue ָ��Ĭ��ֵ
     */
    public static int readInt(int defaultValue){
        int n;
        for(;;){
            String str = readKeyBoard(5,true);
            if(str.equals("")){
                return defaultValue;
            }
            //�쳣����
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("��������������ȷ��");}
        }
        return n;
    }
    /**
     * ���ܣ���ȡ�����ָ�������ַ���
     * @param limit ���Ƶĳ���
     * @return ����
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }
    /**
     * ���ܣ���ȡ�����ָ�������ַ�����Ĭ��ֵ,ֱ�ӻس��򷵻�Ĭ��ֵ
     * @param limit ���Ƶĳ���
     * @param defaultValue ָ��Ĭ��ֵ
     * @return ָ�������ַ�����Ĭ��ֵ
     */
    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.equals("")?defaultValue:str;
    }
    /**
     * ���ܣ���ȡ���������ȷ��ѡ��
     * @return Y��N
     */
    public static char readConfirmSelection(){
        System.out.println("ɾ���޷��ָ������ٴ�ȷ��(Y/N)");
        char c;
        for(;;){    //����ѭ��
            //�����յ����ַ�ת��Ϊ��д
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("ѡ��������������� ");}
        }
        return c;
    }
    /**
     * ���ܣ�����Ϊ�ջ����limit��������ʾ�������룻
     * @param limit ���Ƶĳ���
     * @param blankReturn �Ƿ�����ֱ�ӻس�
     * @return
     */
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";   //����һ���ַ���
        //hasNextLine()�ж��Ƿ�����һ��(��������)��hasNext()�ж��Ƿ��зǿ��ַ�
        while (scanner.hasNextLine()){
            //��ȡ��һ�е�����
            line = scanner.nextLine();
            //line.length=0��������/ֱ�ӻس�
            if(line.length() == 0){
                //���blanketReturn=true�����Է��ؿ��ַ���
                if(blankReturn) return line;
                //���blanketReturn=false�������ܿ��ַ�����������������
                else continue;
            }
            //���˵õ���ȷ�ĳ��ȣ���������ѭ��
            if(line.length() < 1 || line.length() > limit){
                System.out.println("���Ȳ��ܴ���"+limit+"����������������룺");
                continue;
            }
            break;
        }
        return line;
    }
}
