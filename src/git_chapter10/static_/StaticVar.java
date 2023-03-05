package static_;

public class StaticVar {
    public static void main(String[] args) {
        Child amy = new Child("Amy");
        amy.join();
        Child bob = new Child("Bob");
        bob.join();
        System.out.println("游戏人数："+Child.count);
        System.out.println("游戏人数："+amy.count);
        System.out.println("游戏人数："+bob.count);
    }
}
class Child{
    //static类变量：本类所有对象共享变量(共享储存空间)
    public static int count;
    private String name;
    public Child(String name) {
        this.name = name;
    }
    public void join(){
        System.out.println(name+"加入了游戏");
        count++;
    }
}

//
/*JVM内存分析：
1.加载类信息：生成class文件，末尾储存类变量
  *无需创建对象，就可以通过类名访问
2.创建对象：栈变量->堆空间地址->方法区常量池(amy)
                         ->独立堆空间(count)
 */

