package chapter07.homework;

public class Work06 {
    public static void main(String[] args) {
        LabelPoint a = new LabelPoint("a",1, 1);
    }
}
class Point{
    private double x;
    private double y;
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
}
class LabelPoint extends Point{
    private String label;
    public LabelPoint( String label,double x, double y) {
        super(x, y);
        this.label = label;
    }
}
