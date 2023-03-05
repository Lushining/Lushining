package enum_;

/**
 * @author Lusion
 * @version 1.0
 */
public class Enum01 {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN);
        Season2 spring2 = Season2.SPRING2;
        //1.enum.name()返回对象名/未重写的toString()
        System.out.println(spring2.name());
        //2.ordinary返回对象次序
        System.out.println(spring2.ordinal());
        //3.values()返回保存枚举列表的数组
        Season2[] values = Season2.values();
        for(Season2 season : values){
            System.out.println(season);
        }
        //4.valueOf()将字符串(已有对象名)转换成枚举对象
        Season2 spring = Season2.valueOf("SPRING2");
        System.out.println(spring);
        //5.compareTo()：比较两个枚举对象编号
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
    public static final Season SPRING = new Season("春天","温暖");
    public static final Season SUMMER = new Season("夏天","炎热");
    public static final Season AUTUMN = new Season("秋天","凉爽");
    public static final Season WINTER = new Season("冬天","寒冷");

}
enum Season2{
    SPRING2("春天","温暖"),Summer2("夏天","炎热");
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
