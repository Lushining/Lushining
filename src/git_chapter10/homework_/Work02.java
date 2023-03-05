package homework_;
//abstract
/**
 * @author Lusion
 * @version 1.0
 */
public class Work02 {
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.shout();
        dog.shout();

    }
}
abstract class Animal{
     public abstract void shout();
}
class Cat extends Animal{
    @Override
    public void shout() {
        System.out.println("Ã¨»áß÷ß÷½Ð");
    }
}
class Dog extends Animal{
    @Override
    public void shout() {
        System.out.println("¹·»áÍôÍô½Ð");
    }
}

