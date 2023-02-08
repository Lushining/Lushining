package chapter07.poly.feed;

public class Food {
    private String name;
    public Food(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
class Bone extends Food{
    public Bone(String name) {
        super(name);
    }
}
class Fish extends Food{
    public Fish(String name) {
        super(name);
    }
}

