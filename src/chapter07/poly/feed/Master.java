package chapter07.poly.feed;

public class Master {
    private String name;
    public Master(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    //给狗(子类)喂骨头(子类)
//    public void feed(Dog dog,Bone bone){
//        System.out.println(name+"给"+dog.getName()+"喂"+bone.getName());
//    }
//    //给猫(子类)喂鱼(子类)
//    public void feed(Cat cat,Fish fish){
//        System.out.println(name+"给"+cat.getName()+"喂"+fish.getName());
//    }
    //多态机制统一管理:给动物(父类)喂食物(父类)
    //形参(父类)=编译类型,实参(子类)=运行类型
    public void feed(Animals animal,Food food){
        System.out.println(name+"给"+animal.getName()+"喂"+food.getName());
    }
}



