package chapter07;
//test1:
/*执行:C c = new C() ; 输出:A B有 C有 C无
class A{
    A(){sout("A");}
}
class B{
    B(){sout("B无");}
    B(String name){sout("B有")} //默认super()调用父类A无参构造器
}
class C{
    C(){this("hi")sout("C无");} //this跳转构造器,再继续执行
    C(String name){super("ha");sout("C有")}//率先父类B的指定构造器
}
 */

//test2:
/*
1.Computer父类 : 属性(CPU 内存memory 硬盘disk),方法getDetails返回详细信息
2.PC子类 : 特有属性brand
3.NotePad子类 : 特有属性color
4.main方法 : 分别创建子类对象并赋值,使用方法打印信息
 */
public class ExtendTest {
    public static void main(String[] args) {
        //super()自动调用父类的无参构造器
        PC pc = new PC("Windows");
        pc.setCpu("a1");
        pc.setMemory(128);
        pc.setDisk(256);
        System.out.println("====PC信息如下====");
        System.out.print(pc.getDetails()+"\tbrand="+pc.brand);
        System.out.println();
        //super(参数)调用指定的父类构造器
        NotePad notePad = new NotePad("b1",512,1034,"经典");
        System.out.println("====NotePad信息如下====");
        notePad.info();
    }
}
class Computer{
    private String cpu;
    private int memory;
    private int disk;

    public Computer() {}
    public Computer(String cpu, int memory, int disk) {
        this.cpu = cpu;
        this.memory = memory;
        this.disk = disk;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setDisk(int disk) {
        this.disk = disk;
    }
    public String getCpu() {
        return cpu;
    }
    public int getMemory() {
        return memory;
    }
    public int getDisk() {
        return disk;
    }
    public String getDetails(){
        return "cpu="+cpu+"\tmemory="+memory+"\tdisk="+disk;
    }
}
class PC extends Computer{
    public String brand;
    public PC(String brand){
        this.brand = brand;
    }
}
class NotePad extends Computer {
    private String color;
    public String getColor() {
        return color;
    }
    public NotePad(String cpu, int memory, int disk, String color) {
        super(cpu, memory, disk);
        this.color = color;
    }
    //直接访问本类私有属性,通过父类的公有方法访问其私有属性
    public void info(){
        System.out.println(getDetails()+"\tcolor="+color);
    }
}

//父类设置构造器覆盖无参
//子类先自定义属性,直接快捷创建构造器(自动调用父类的三个参数与新增参数)
