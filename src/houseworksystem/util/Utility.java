package util;

import java.util.*;

/**
 *功能：工具类的作用：处理各种情况的用户输入
 */
public class Utility {
    //静态属性
    private static Scanner scanner = new Scanner(System.in);

    /**
     * 功能：读取键盘输入的菜单选项（1-5）
     * @return 1-5
     */
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str = readKeyBoard(1,false);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3'
                    && c != '4' && c != '5'){
                System.out.println("选择有误，请重新输入");
            }else break;
        }
        return c;
    }
    /**
     * 功能：读取输入的一个字符（否则无限循环）
     * @retur 输入的字符
     */
    public static char readChar(){
        String str = readKeyBoard(1,false);
        return str.charAt(0);
    }
    /**
     * 功能：读取输入的一个字符，回车则返回默认值
     * @return 输入的字符或默认值
     */
    public static char readChar(char defaultValue){
        String str = readKeyBoard(1,true);
        return (str.length() == 0)?defaultValue : str.charAt(0);
    }
    /**
     * 功能：读取输入的整型，要求长度小于5
     * @return 整数
     */
    public static int readInt(){
        int n;
        for(;;){
            String str = readKeyBoard(5,false);
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入有误，请重新确认");}
        }
        return n;
    }
    /**
     * 功能：读取输入的一个整型，回车则返回默认值
     * @return 输入的字符或默认值
     * @param defaultValue 指定默认值
     */
    public static int readInt(int defaultValue){
        int n;
        for(;;){
            String str = readKeyBoard(5,true);
            if(str.equals("")){
                return defaultValue;
            }
            //异常处理
            try{
                n = Integer.parseInt(str);
                break;
            }catch (NumberFormatException e){
                System.out.println("输入有误，请重新确认");}
        }
        return n;
    }
    /**
     * 功能：读取输入的指定长度字符串
     * @param limit 限制的长度
     * @return 整数
     */
    public static String readString(int limit){
        return readKeyBoard(limit,false);
    }
    /**
     * 功能：读取输入的指定长度字符串或默认值,直接回车则返回默认值
     * @param limit 限制的长度
     * @param defaultValue 指定默认值
     * @return 指定长度字符串或默认值
     */
    public static String readString(int limit,String defaultValue){
        String str = readKeyBoard(limit,true);
        return str.equals("")?defaultValue:str;
    }
    /**
     * 功能：读取键盘输入的确认选项
     * @return Y或N
     */
    public static char readConfirmSelection(){
        System.out.println("删除无法恢复，请再次确认(Y/N)");
        char c;
        for(;;){    //无限循环
            //将接收到的字符转换为大写
            String str = readKeyBoard(1,false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入 ");}
        }
        return c;
    }
    /**
     * 功能：输入为空或大于limit长度则提示重新输入；
     * @param limit 限制的长度
     * @param blankReturn 是否允许直接回车
     * @return
     */
    private static String readKeyBoard(int limit,boolean blankReturn){
        String line = "";   //定义一个字符串
        //hasNextLine()判断是否还有下一行(包括空行)；hasNext()判断是否还有非空字符
        while (scanner.hasNextLine()){
            //读取下一行的输入
            line = scanner.nextLine();
            //line.length=0：无输入/直接回车
            if(line.length() == 0){
                //如果blanketReturn=true，可以返回空字符串
                if(blankReturn) return line;
                //如果blanketReturn=false，不接受空字符串，必须输入内容
                else continue;
            }
            //过滤得到正确的长度，否则无限循环
            if(line.length() < 1 || line.length() > limit){
                System.out.println("长度不能大于"+limit+"输入错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }
}
