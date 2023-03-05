package static_;

public class StaticMethod {
    public static void main(String[] args) {
        Stu amy = new Stu("Amy");
        Stu bob = new Stu("Bob");
        amy.payFare(2000);//=staticexcise.Stu/bob.payFare
        Stu.showFare();//=amy/bob.showFare()
    }
}

class Stu{
    private String name;
    private static int fare=0;
    public Stu(String name) {
        this.name = name;
    }
    public static void payFare(int fare){
        Stu.fare += fare; //staticexcise.Stu.fare相当于this指向当前对象的作用
    }
    public static void showFare(){
        System.out.println("累计学费"+Stu.fare);
    }
}