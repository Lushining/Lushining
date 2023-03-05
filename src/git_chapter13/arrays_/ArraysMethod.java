package arrays_;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Lusion
 * @version 1.0
 */
/*static方法
  1.数组遍历Arrays.toString(arr)
  2.数组排序Arrays.sort(arr,new Comparable(){重写方法})
  3.数组查找Arrays.binarySearch(arr,num)  #有序数组，无则返回-(index+1)
  4.数组复制Arrays.copyOf(arr,length)     #length>0，>arr.length则补空
  5.数组填充Arrays.fill(arr,num)          #比较+替换
  6.相等比较Arrays.equals(arr1,arr2)
  7.集合转换：Arrays.asList               #List<Integer> list = ...
  *List(接口),返回Array(C)的静态内部类ArraysList
 */
public class ArraysMethod {
    public static void main(String[] args) {
        System.out.println("======排序前======");
        //1.遍历数组并[]返回：toString
        Integer[] arr = {1,-1,7,0,89};
        System.out.println(Arrays.toString(arr));
        //2.1排序返回数组：sort()，默认从小到大
        System.out.println("======排序后======");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //2.2定制排序：匿名内部类实现Comparator接口
        System.out.println("======定制排序======");
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;     //return int>0 ？ true:false
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
        //3.二分查找正序数组：binarySearch(arr,<>)
        //无则返回 -(low+1),low==按照排序所在的索引位置
        System.out.println("======二分搜索======");
        Integer[] integers = {1,2,3,4,5};
        int index = Arrays.binarySearch(integers,0);
        System.out.println(index);
        //4.复制数组元素：copyOf(arr,num)
        //num>0,>arr.length则补空
        System.out.println("======复制数组======");
        Integer[] newArr1 = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr1));
        Integer[] newArr2 = Arrays.copyOf(arr,arr.length-1);
        System.out.println(Arrays.toString(newArr2));
        Integer[] newArr3 = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(newArr3));
        //5.数组填充(比较+替换)：fill(array,num)
        Integer[] num = new Integer[]{1,2,3};
        Arrays.fill(num,99);
        System.out.println("======填充数组======");
        System.out.println(Arrays.toString(num));
        //6.相等比较：equals(arr,arr2)
        Integer arr1[] = {1,2,3};
        Integer arr2[] = {1,2,3};
        System.out.println("======相等比较======");
        boolean res = Arrays.equals(arr1,arr2);
        System.out.println("res="+res);
        //7.列表转换：asList()
        System.out.println("======转换列表======");
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("list="+list);
        System.out.println("list运行类型"+list.getClass());
    }
}
