package enum_;

/**
 * @author Lusion
 * @version 1.0
 */
public class ClassTest {
    public static void main(String[] args) {
        Week[] values = Week.values();
        for(Week week : values){
            System.out.println(week);
        }
    }
}
enum Week{
    MONDAY("����һ"),TUESDAY("���ڶ�"),WEDNESDAY("������"),
    THURSDAY("������"),FRIDAY("������"),SATURDAY("������"),SUNDAY("������");
    private String name;
    private Week(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
