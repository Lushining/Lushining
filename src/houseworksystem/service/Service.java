package service;
import house.House;
public class Service {
/*�����б�
1.�����������������鱣�����
2.�������������������鳤��
3.list()�����������Է����б�
 */
    private House[] houses;
    public Service(int size){
        houses = new House[size];}
    public House[] list(){
        return houses;}

/*������ӣ�
   1.�Ƿ�������(record)
   2.�Զ�������(idNum)
 */
    private int record = 0;    //��¼���з�����
    private int idNum = 0;     //��¼��ǰ����id
    public void add(House newHouse){
        if (record == houses.length ){
            System.out.println("�ܱ�Ǹ����Դ�������������");}
        houses[record++]=newHouse;  //�����������
        System.out.println("��ϲ�㣬�ɹ����һ���·�Դ");
        newHouse.setId(++idNum);}    //������������
/*ɾ������
1.��λ����
  ���Ƿ���ڣ�delId == houses[i].getI->ģ�Ͳ㷽��
  �ڹ��˽��(index)��-1(return false)
2.ɾ������
  �ٸ��Ǹ��£�i=delId,i<record-1
  ��ĩλ�ÿգ�houses[record-1]=null
  �۸��·�����Ŀ��record--
 */
    public boolean delete(int delId){
        int index = -1;
        for (int i = 0; i < record; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("�ܱ�Ǹ����Ҫɾ���ķ��ݲ�����");
            return false;
        }
        for (int i = index; i < record - 1; i++) {    //i<record��ָ���쳣
            houses[i] = houses[i+1];
        }
        houses[--record] = null;
        return true;
    }
/*���ҷ���
1.�����Ƿ���ڣ����ض���/null(��������)
 */
    public House search(int searchId){
        for (int i = 0; i < record; i++) {
            if (searchId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
/*�޸���Ϣ
1.�����Ƿ���ڣ����ض���/null
  (����search())
 */
}





