package chapter07.poly.feed;

public class Animals {
    private String name;
    public Animals(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animals{
    public Dog(String name) {
        super(name);
    }
}
class Cat extends Animals{
    public Cat(String name) {
        super(name);
    }
}