package chapter07.poly.parameter;

public class PolyParameter {
    //参数多态:形参父类实参子类->一个方法调用不同的子类方法
    //动态绑定机制:调用方法绑定运行机制
    public static void main(String[] args) {
        Worker w1 = new Worker("Amy", 3500);
        Manager m1 = new Manager("Bob", 5000, 55000);
        PolyParameter p = new PolyParameter();
        //通过实参重写方法(动态绑定机制)
        p.showEmpAnnual(w1);
        p.showEmpAnnual(m1);
        //通过实参调用子类特有方法
        p.testWork(w1);
        p.testWork(m1);
    }
        public void showEmpAnnual(Employee e){
        System.out.println("该员工的年薪为:"+e.getAnnual());
    }
    public void testWork(Employee e){
        if(e instanceof Worker){
            ((Worker) e).work();
        }else if(e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
