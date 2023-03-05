package arrays_;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Lusion
 * @version 1.0
 */
/*static����
  1.�������Arrays.toString(arr)
  2.��������Arrays.sort(arr,new Comparable(){��д����})
  3.�������Arrays.binarySearch(arr,num)  #�������飬���򷵻�-(index+1)
  4.���鸴��Arrays.copyOf(arr,length)     #length>0��>arr.length�򲹿�
  5.�������Arrays.fill(arr,num)          #�Ƚ�+�滻
  6.��ȱȽ�Arrays.equals(arr1,arr2)
  7.����ת����Arrays.asList               #List<Integer> list = ...
  *List(�ӿ�),����Array(C)�ľ�̬�ڲ���ArraysList
 */
public class ArraysMethod {
    public static void main(String[] args) {
        System.out.println("======����ǰ======");
        //1.�������鲢[]���أ�toString
        Integer[] arr = {1,-1,7,0,89};
        System.out.println(Arrays.toString(arr));
        //2.1���򷵻����飺sort()��Ĭ�ϴ�С����
        System.out.println("======�����======");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //2.2�������������ڲ���ʵ��Comparator�ӿ�
        System.out.println("======��������======");
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     //return int>0 �� true:false
            }
        });
//        Arrays.sort(arr, new Comparator() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                Integer i1 = (Integer) o1;
//                Integer i2 = (Integer) o2;
//                return i2-i1;
//            }
//        });
        System.out.println(Arrays.toString(arr));
        //3.���ֲ����������飺binarySearch(arr,<>)
        //���򷵻� -(low+1),low==�����������ڵ�����λ��
        System.out.println("======��������======");
        Integer[] integers = {1,2,3,4,5};
        int index = Arrays.binarySearch(integers,0);
        System.out.println(index);
        //4.��������Ԫ�أ�copyOf(arr,num)
        //num>0,>arr.length�򲹿�
        System.out.println("======��������======");
        Integer[] newArr1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr1));
        Integer[] newArr2 = Arrays.copyOf(arr,arr.length-1);
        System.out.println(Arrays.toString(newArr2));
        Integer[] newArr3 = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr3));
        //5.�������(�Ƚ�+�滻)��fill(array,num)
        Integer[] num = new Integer[]{1,2,3};
        Arrays.fill(num,99);
        System.out.println("======�������======");
        System.out.println(Arrays.toString(num));
        //6.��ȱȽϣ�equals(arr,arr2)
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {1,2,3};
        System.out.println("======��ȱȽ�======");
        boolean res = Arrays.equals(arr1,arr2);
        System.out.println("res="+res);
        //7.�б�ת����asList()
        System.out.println("======ת���б�======");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("list="+list);
        System.out.println("list��������"+list.getClass());
    }
}
