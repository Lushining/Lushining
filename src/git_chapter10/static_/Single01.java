package static_;

public class Single01 {
    public static void main(String[] args) {
//        //无论创建多少实例，均指向同一个对象
//        staticexcise.GirlFriend gf1 = staticexcise.GirlFriend.getInstance();
//        System.out.println(gf1);
//        staticexcise.GirlFriend gf2 = staticexcise.GirlFriend.getInstance();
//        System.out.println(gf2);
//        System.out.println(gf1 == gf2);
//        System.out.println("===================");
        //饿汉式率先创建对象:仅调用类成员时，已率先使用构造器创建了对象
        System.out.println(GirlFriend.n);
    }
}
//只能有一个女朋友：Girlfriend类只有一个对象
class GirlFriend{
    private String name;
    public static int n = 1;
    private static GirlFriend a = new GirlFriend("Amy");
    private GirlFriend(String name){
        System.out.println("构造器被调用");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return a;
    }
}