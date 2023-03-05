package homework_;
//static
/**
 * @author Lusion
 * @version 1.0
 */
public class Work01 {
    public static void main(String[] args) {
        System.out.println(Frock.getNextNum());
        System.out.println(Frock.getNextNum());
        Frock f1 = new Frock();
        System.out.println("f1="+f1.getSerialNum());
        Frock f2 = new Frock();
        System.out.println("f2="+f2.getSerialNum());
        Frock f3 = new Frock();
        System.out.println("f3="+f3.getSerialNum());

    }
}
class Frock{
    private static int currentNum = 100000;
    private int serialNum;
    public static int getNextNum(){
        return currentNum += 100;
    }
    public int getSerialNum() {
        return serialNum;
    }
    public Frock() {
        this.serialNum = getNextNum();
    }
}