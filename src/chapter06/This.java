package chapter06;
public class This {
//thisʹ��ϸ��:ֻ������ķ�����ʹ��
//1.���ʱ�����������������ֲ�������this.<> == ����;�������ͽ�����
//2.��Ա������this.<>();
//3.��������this()  #����Ϊ��һ����䣬��ֻ���ڹ�������ʹ��
    public static void main(String[] args) {
        T t = new T(18,"a");
        System.out.println("�ͽ��������£�" + t.name + " " + t.age);//�������ԣ�δ���������޸�

        T t1 = new T();//�����޲ι�����
        t1.info1();
        System.out.println("info1������Ϣ���£�"  + t1.name);//���Ա��޸�

        T t2 = new T();
        t2.f2();
    }
}
class T{
    String name = "person";
    int age = 100;
    public T(int age,String name){
        name = name;  //�ֲ�����=�ֲ����������Բ���
        age = age;
        System.out.println("�Զ���info���£�"+name + " " + age);//�ͽ����������ʵ��
        System.out.println("����info���£�" +this.name+" "+this.age);//��������
    }
    public void info1(){
        //������ֲ��������������ͽ�����ԭ��
        name = "dog";  // �޸�����
        System.out.println("info1������Ϣ���£�"+name);
        name = "cat";
        System.out.println("info2������Ϣ���£�"+name);
    }
    public void f1(){
        System.out.println("f1()����");
    }
    public void f2(){
        System.out.println("f2()����");
        //2.���ó�Ա���������ñ����f1()
        f1();
        this.f1();
    }
    public T(){
        this("amy",6);
        System.out.println("�޲ι�����");
    }
    public T(String name,int age){
        System.out.println("���ι�����");
    }
}

//this��ϰ�⣺
//����Info�࣬����gender,height����
//�ṩcompare�������ж��Ƿ����;�Ա������ͬ�򷵻�true
class ThisTest{
    public static void main(String[] args){
        Info info1 = new Info('Ů',175);
        boolean res = info1.compare('Ů',173);
        System.out.println("������Ϣ�Ƿ�һ�£�"+res);
    }
}
class Info{
    char gender;
    double height;
    public Info(char gender,double height){
        this.gender = gender;
        this.height = height;
    }
    public boolean compare(char gender,double height) {
        if (this.gender == gender & this.height == height) {
            return true;
        } else {
            return false;
        }
    }
}
/*public boolean compare(Info i){
    return this.gender.equals(i.gender) && this.height == i.height
  //new i1/i2��i1.compare(i2);
*/


