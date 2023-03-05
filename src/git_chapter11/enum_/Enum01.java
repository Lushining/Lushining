package enum_;

/**
 * @author Lusion
 * @version 1.0
 */
public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        Season2 spring2 = Season2.SPRING2;
        //1.enum.name()���ض�����/δ��д��toString()
        System.out.println(spring2.name());
        //2.ordinary���ض������
        System.out.println(spring2.ordinal());
        //3.values()���ر���ö���б������
        Season2[] values = Season2.values();
        for(Season2 season : values){
            System.out.println(season);
        }
        //4.valueOf()���ַ���(���ж�����)ת����ö�ٶ���
        Season2 spring = Season2.valueOf("SPRING2");
        System.out.println(spring);
        //5.compareTo()���Ƚ�����ö�ٶ�����
        System.out.println(Season2.SPRING2.compareTo(Season2.Summer2));
    }
}
class Season{
    private String name;
    private String description;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    private Season(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "enum_.Season{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
    public static final Season SPRING = new Season("����","��ů");
    public static final Season SUMMER = new Season("����","����");
    public static final Season AUTUMN = new Season("����","��ˬ");
    public static final Season WINTER = new Season("����","����");

}
enum Season2{
    SPRING2("����","��ů"),Summer2("����","����");
    private String name;
    private String description;

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    private Season2(String name, String description) {
        this.name = name;
        this.description = description;
    }
    @Override
    public String toString() {
        return "enum_.Season2{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
