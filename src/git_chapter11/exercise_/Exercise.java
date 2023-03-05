package exercise_;
/**
 * @author Lusion
 * @version 1.0
 */
//ö�ٶ�����switch���ƥ��
public class Exercise {
    public static void main(String[] args) {
        Color red = Color.RED;
        red.show();
        switch (red){
            case RED:
                System.out.println("ƥ�䵽��ɫ");
                break;
            case BLUE:
                System.out.println("ƥ�䵽��ɫ");
                break;
            default:
                System.out.println("δ�ҵ���Ӧֵ");
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

