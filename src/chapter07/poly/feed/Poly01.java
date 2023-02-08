package chapter07.poly.feed;

public class Poly01 {
    public static void main(String[] args) {
    Master tom = new Master("tom");
    Dog dog = new Dog("大黄");
    Bone bone = new Bone("鸡腿骨");
    tom.feed(dog,bone);//animal=dog,food=bone
    Master amy = new Master("amy");
    Dog cat = new Dog("小花");
    Bone fish = new Bone("黄花鱼");
    tom.feed(cat,fish);

    }
}
