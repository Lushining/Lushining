package homework_;
/**
 * @author Lusion
 * @version 1.0
 */
//�����ַ������жϴ�д/Сд��ĸ/���ָ���
/*1.toCharArray()
  2.unicode
  3.�Ż���str����
 */
public class Work4 {
    public static void main(String[] args) {
        String str = "Lsn123456";
        judge(str);
    }
    public static void judge(String str){
        if (str==null){
            System.out.println("���ݲ�Ϊ��");
            return;
        }
        int upperNum = 0;
        int lowerNum = 0;
        int digitalNum = 0;
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>'A' && arr[i]<'Z'){
                upperNum++;
            }
            if (arr[i]>'a' && arr[i]<'z'){
                lowerNum++;
            }if (arr[i]>'0' && arr[i]<'9'){
                digitalNum++;
            }
        }
        System.out.println("upperNum="+upperNum+"\tlowerNum="+
                lowerNum+"\tdigitalNum="+digitalNum);

    }

}
