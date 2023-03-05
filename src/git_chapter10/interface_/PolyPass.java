package interface_;
public class PolyPass {
    public static void main(String[] args) {
        //向上转型
        AA eg1 = new CC();
        BB eg2 = new CC();
    }
}
interface AA{}
interface BB{}
//interface BB extends AA{}
class CC implements AA,BB{}
