/**
 * @author Lusion
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 800;
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("年龄需要在18-120岁");
        }
        System.out.println("年龄在正常范围内");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
