package homework_;
//�����ڲ���
/**
 * @author Lusion
 * @version 1.0
 */
public class Work03 {
    public static void main(String[] args) {
        Cellphone p = new Cellphone();
        //�����ڲ���ֱ�Ӵ��β���ɷ�����д
        p.testWork(new Calculate() {
            @Override
            public int work(int n1, int n2) {
                return n1+n2;
            }
        },1,2);
        p.testWork(new Calculate() {
            @Override
            public int work(int n1, int n2) {
                return n1*n2;
            }
        },1,2);
    }

}
interface Calculate{
    int work(int n1,int n2);
}
class Cellphone{
    //����work����:ͨ������/���ε������Ա
    public void testWork(Calculate c,int n1,int n2){
        double result = c.work(n1,n2);//��̬����������
        System.out.println("result="+result);
    }
}