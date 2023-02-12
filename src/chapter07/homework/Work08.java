package chapter07.homework;
//1.��߸����ԣ���ͬ�����뷽��->���࣬����->���࣬������ͬ->��д
//2.��̬����
//3.��̬����
public class Work08 {
    public static void main(String[] args) {
        //1.������д
        Teacher08 t = new Teacher08("�ŷ�", '��', 30, 5);
        Student s = new Student("С��", '��', 15, "00023102");
        t.say();
        s.say();
        //2.��̬���飺������룬��������/����
        Person08[] persons = new Person08[4];
        persons[0] = new Student("Amy", 'Ů', 15, "00023100");
        persons[1] = new Student("Bob", '��', 14, "00023101");
        persons[2] = new Teacher08("Cindy", 'Ů', 35, 10);
        persons[3] = new Teacher08("Dobby", 'Ů', 45, 20);
        System.out.println("======����������======");
        Work08 work08 = new Work08();
        work08.sort(persons);
        for(int i = 0;i < persons.length;i++){
            System.out.println(persons[i]); //�Զ�����toString����
        }
        System.out.println("======test�����������======");
        //3.��̬����:�βθ��࣬ʵ�����ࣻ
        for(int i = 0;i < persons.length;i++){
            System.out.println(work08.test(persons[i]));
        }

    }
        //ð����������Ӵ�С
    public void sort(Person08[] persons){
        for(int i = 0;i < persons.length - 1;i++){
            for(int j = 0;j < persons.length - 1 - i;j++){
                if(persons[j].getAge() < persons[j+1].getAge()){
                    Person08 temp = null;
                    temp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = temp;
                }
            }
        }
    }

    //������д/��������ת��
    public String test(Person08 p){
        if(p instanceof Student){
            return ((Student) p).study();
        }else if (p instanceof Teacher08){
            return ((Teacher08) p).teach();
        }else{
            return "do nothing";
        }
    }

}
class Person08{
    private String name;
    private char sex;
    private int age;
    public Person08(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public char getSex() {
        return sex;
    }
    public String play(){
        return name+"����";
    }
    public void say(){
        System.out.println("������"+name);
        System.out.println("����"+age);
        System.out.println("�Ա�"+sex);
    }

    @Override
    public String toString() {
        return "Person08{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

}
class Student extends Person08{
    private String atu_id;
    public Student(String name, char sex, int age, String atu_id) {
        super(name, sex, age);
        this.atu_id = atu_id;
    }
    public String study(){
        return getName()+"��ŵ��ú�ѧϰ";
    }
    @Override
    public String play() {
        return super.play()+"����";
    }

    @Override
    public void say() {
        System.out.println("ѧ����Ϣ���£�");
        super.say();
        System.out.println("ѧ�ţ�"+atu_id+"\n"+this.study()+"\n"+this.play());
    }

    @Override
    public String toString() {
        return "Student{" +
                "atu_id='" + atu_id + '\'' +
                '}'+super.toString();
    }

}
class Teacher08 extends Person08{
    private int work_age;
    public Teacher08(String name, char sex, int age, int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }
    public String teach(){
        return getName()+"��ŵ�������ѧ";
    }

    @Override
    public String play() {
        return super.play()+"����";
    }
    public void say() {
        System.out.println("��ʦ��Ϣ���£�");
        super.say();
        System.out.println("���䣺"+work_age+"\n"+this.teach()+"\n"+this.play());
    }

    @Override
    public String toString() {
        return "Teacher08{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
