package static_;

public class CodeBlock {
    public static void main(String[] args) {
        //1.��������Ϣʱ���ã�
        //1.1��������ʱ����
        Movie m1 = new Movie("������");
        System.out.println("====================");
        //1.2�����������ʱ�ȼ��ظ���
        new Director("������",60,"����ı");
        System.out.println("====================");
        //1.3ͨ���������ʾ�̬��Ա
        //2.static������������Ϣʱִֻ��һ�Σ�
        //3.��ͨ����鴴������ʱ���޴���������������Ա�޹�
        System.out.println(Cat.age);
        System.out.println("====================");
        System.out.println(Cat.age);
        System.out.println("====================");
        //4.��������ʱ�ĵ���˳�򣺾�̬�����->��ͨ�����->������
        A a = new A();
        System.out.println("====================");
        //6.�����������ĵ���˳��:��̬(��->��)->����(��ͨ->������)->����(��ͨ->������)
        BB bb = new BB();

    }
}
class Movie{
    private String name;
    private double price;
    {
        System.out.println("Movie��ͨ�����");
    }
    public Movie(String name) {
        System.out.println("staticexcise.Movie(name)������");
        this.name = name;

    }
    public Movie(String name, double price) {
        System.out.println("staticexcise.Movie(name,price)������");
        this.name = name;
        this.price = price;
    }
}
class Director extends Movie{
    private String director;
    public Director(String name, double price, String director) {
        super(name, price);
        this.director = director;
        System.out.println("Director������");
    }
}
class Cat {
    public static int age=1;
    {
        System.out.println("staticexcise.Cat ��ͨ�����");
    }
    static{
        System.out.println("staticexcise.Cat ��̬�����");
    }
}
class A{
    private static int n1 = getN1();
    private int �� = getN2();
    {
        System.out.println("staticexcise.A ��ͨ�����1");
    }
    static{
        System.out.println("staticexcise.A ��̬�����1");
    }
    {
        System.out.println("staticexcise.A ��ͨ�����2");
    }
    static{
        System.out.println("staticexcise.A ��̬�����2");
    }
    public A() {
        System.out.println("staticexcise.A ������");
    }
    public int getN2(){
        System.out.println("��ͨ���Գ�ʼ��");
        return 200;
    }
    public static int getN1(){
        System.out.println("��̬���Գ�ʼ��");
        return 100;
    }
}
class AA{
    {
        System.out.println("���� ��ͨ�����");
    }
    static{
        System.out.println("���� ��̬�����");
    }

    public AA() {
        System.out.println("���� ������");
    }
}
class BB extends AA{
    {
        System.out.println("���� ��ͨ�����");
    }
    static{
        System.out.println("���� ��̬�����");
    }

    public BB() {
        System.out.println("���� ������");
    }
}