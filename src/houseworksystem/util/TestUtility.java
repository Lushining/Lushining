package util;

public class TestUtility {
    public static void main(String[] args) {
        System.out.println("请输入：");
        //读取字符串，长度不大于3,否则无限循环
        String s1 = Utility.readString(3);
        System.out.println("s="+s1);
        System.out.println("请输入：");
        //读取字符串，长度不大于3,否则无限循环;若直接回车输出默认值
        String s2 = Utility.readString(3,"enter");
        System.out.println("s="+s2);
    }
}
