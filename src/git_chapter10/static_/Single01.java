package static_;

public class Single01 {
    public static void main(String[] args) {
//        //���۴�������ʵ������ָ��ͬһ������
//        staticexcise.GirlFriend gf1 = staticexcise.GirlFriend.getInstance();
//        System.out.println(gf1);
//        staticexcise.GirlFriend gf2 = staticexcise.GirlFriend.getInstance();
//        System.out.println(gf2);
//        System.out.println(gf1 == gf2);
//        System.out.println("===================");
        //����ʽ���ȴ�������:���������Աʱ��������ʹ�ù����������˶���
        System.out.println(GirlFriend.n);
    }
}
//ֻ����һ��Ů���ѣ�Girlfriend��ֻ��һ������
class GirlFriend{
    private String name;
    public static int n = 1;
    private static GirlFriend a = new GirlFriend("Amy");
    private GirlFriend(String name){
        System.out.println("������������");
        this.name = name;
    }
    public static GirlFriend getInstance(){
        return a;
    }
}