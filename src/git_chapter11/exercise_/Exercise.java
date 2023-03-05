package exercise_;
/**
 * @author Lusion
 * @version 1.0
 */
//枚举对象在switch语句匹配
public class Exercise {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
        switch (red){
            case RED:
                System.out.println("匹配到红色");
                break;
            case BLUE:
                System.out.println("匹配到蓝色");
                break;
            default:
                System.out.println("未找到相应值");
                break;
        }
    }
}
enum Color implements ColorShow{
    RED(255,0,0),BLUE(0,0,255),BLACK(0,0,0),
    YELLOW(255,255,0),GREEN(0,255,0);
    private int redValue;
    private int greenValue;
    private int blueValue;
    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }
    @Override
    public void show() {
        System.out.println("red="+redValue+",green="+greenValue
        +",blue="+blueValue);
    }
}

