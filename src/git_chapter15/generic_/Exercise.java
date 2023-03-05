package generic_;
import java.util.ArrayList;
import java.util.Comparator;
/**
 * @author Lusion
 * @version 1.0
 */
//1.�����������󲢷���ArrayList<>����
//2.ʹ��ArrayList.sort��������comparator<>
/*����֤����
  ����֤name
  ����֤birthday��
    a.�����ڲ�����д������year-month-day
    b.MyDate��birthdayMinus()����������int
    c.MyDate��ʵ��comparable�ӿ�<MyDate>
 */
public class Exercise {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Bob",5000,new MyDate(2000,1,1)));
        employees.add(new Employee("Amy",5000,new MyDate(2000,1,2)));
        employees.add(new Employee("Amy",5000,new MyDate(2000,1,1)));
        System.out.println("======Ա����Ϣ======");
        System.out.println(employees);
        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                //1.��֤����������Employee����
                if (!(o1 instanceof Employee && o2 instanceof Employee)){
                    System.out.println("���Ͳ���ȷ�޷���������");
                    return 0;
                }
                //2.�Ƚ�name��compareTo()--���(0)/��С(!0)
                int i = o1.getName().compareTo(o2.getName());
                if (i != 0 ){
                    return i;   //o1-o2
                }
                //3.1�����ڲ���Ƚ�birthday��year-month-day
//                int year = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                if (year != 0){
//                    return year;
//                }
//                int month = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                if (month != 0){
//                    return month;
//                }int day = o1.getBirthday().getDay() - o2.getBirthday().getDay();
//                if (day != 0){
//                    return day;
//                }
//                //3.2���д�����Ƚ�birthday
//                return new MyDate().birthdayMinus(o1,o2);
                //3.3��ʵ��compare�ӿڱȽ�birthday
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });
        System.out.println("======������======");
        System.out.println(employees);
    }

}
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public double getSal() {return sal;}
    public void setSal(double sal) {this.sal = sal;}
    public MyDate getBirthday() {return birthday;}
    public void setBirthday(MyDate birthday) {this.birthday = birthday;}

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
    @Override
    public String toString() {
        return "\nEmployee{" + "name=" + name +
                ", sal=" + sal + ", birthday=" + birthday +
                '}';
    }
}
class MyDate implements Comparable<MyDate>{
    private int month;
    private int day;
    private int year;
    public int getMonth() {return month;}
    public void setMonth(int month) {this.month = month;}
    public int getDay() {return day;}
    public void setDay(int day) {this.day = day;}
    public int getYear() {return year;}
    public void setYear(int year) {this.year = year;}
    public MyDate( int year,int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public MyDate() {}
    @Override
    public String toString() {
        return year+"-"+month+"-"+day;
    }
    //    public int birthdayMinus(Employee e1,Employee e2){
//        int year = e1.getBirthday().getYear() - e2.getBirthday().getYear();
//        if (year != 0){
//            return year;
//        }
//        int month = e1.getBirthday().getMonth() - e2.getBirthday().getMonth();
//        if (month != 0){
//            return month;
//        }int day = e1.getBirthday().getDay() - e2.getBirthday().getDay();
//        if (day != 0){
//            return day;
//        }
//        return 0;
//    }
    @Override
    public int compareTo(MyDate o) {        //o1.compareTo(o2);
        int yearMinus = year - o.getYear();
        if (yearMinus != 0){
            return yearMinus;
        }
        int monthMinus = month - o.getMonth();
        if (monthMinus != 0){
            return monthMinus;
        }int dayMinus = day - o.getDay();
        if (dayMinus != 0){
            return dayMinus;
        }
        return 0;
    }

}
