package chapter07;

import java.util.Arrays;

//1.ͬһ����������ͬ���࣬��ͬ������ͬ����
/*2.����:package <����>  //����һ����,�������import
    ������://������Զ���������
    ͬ��ֱ�ӵ���,��ͬ��import/<����>.<����>����*/
//3.�����淶:��ĸ�����»���С��;���ֲ���ͷ,�޹ؼ���;
//4.���ð�:java.lang  //���赼��Ĭ��ʹ��Math.abs()/PI
public class Package {
    public static void main(String[] args) {
        int[]arr={1,3,4,2,5};
        Arrays.sort(arr);
        for(int i = 0;i < arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
