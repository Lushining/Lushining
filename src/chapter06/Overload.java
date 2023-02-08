package chapter06;

//test1：类Methods中定义三个重载方法m
public class Overload {
    public static void main(String[] args){
        Methods methods = new Methods();
        methods.m(2);
        methods.m(1,2);
        methods.m("a");
        methods.max(1,2);
        methods.max(1.1,2.2);
        methods.max(4,2,3);


    }
}
class Methods{
    public void m(int n){
        System.out.println("该数的平方="+n*n);
    }
    public void m(int a,int b){
        System.out.println("两数的乘积="+a*b);

    }
    public void m (String c){
        System.out.println("该字符串为："+c);
    }
    public void max(int n1,int n2) {
        if (n1 > n2) {
            System.out.println("max="+n1);
        } else {
            System.out.println("max="+n2);
        }
    }
    public void max(double m1,double m2){
        if (m1 > m2) {
            System.out.println("max="+m1);
        } else {
            System.out.println("max="+m2);
        }
    }
    public void max(double o1,double o2,double o3){
        System.out.println("max="+((o1>o2?o1:o2)>o3?(o1>o2?o1:o2):o3));
    }
}

//可变参数:返回姓名+（2，3，5）门课成绩和
class VarParameter{
    public static void main(String[] args){
        VarMethods varm =new VarMethods();
        varm.nameAndScore("卢诗宁",78.8,99,87);
    }
}
class VarMethods{
    public void nameAndScore(String name,double... score){
        double sum = 0;
        for(int i =0;i < score.length;i++){
            sum += score[i];
        }
        System.out.println("姓名："+name);
        System.out.println("成绩："+sum);
    }
}

