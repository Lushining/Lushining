/**
 * @author Lusion
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 800;
        if (!(age >= 18 && age <= 120)){
            throw new AgeException("������Ҫ��18-120��");
        }
        System.out.println("������������Χ��");
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
