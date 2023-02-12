package service;
import house.House;
public class Service {
/*房屋列表：
1.新增变量：定义数组保存对象
2.创建构造器：决定数组长度
3.list()：公共方法以返回列表
 */
    private House[] houses;
    public Service(int size){
        houses = new House[size];}
    public House[] list(){
        return houses;}

/*房屋添加：
   1.是否可以添加(record)
   2.自动赋予编号(idNum)
 */
    private int record = 0;    //记录已有房屋数
    private int idNum = 0;     //记录当前房屋id
    public void add(House newHouse){
        if (record == houses.length ){
            System.out.println("很抱歉，房源已满不能再添加");}
        houses[record++]=newHouse;  //先添加再自增
        System.out.println("恭喜你，成功添加一个新房源");
        newHouse.setId(++idNum);}    //先自增再输入
/*删除房屋
1.定位对象：
  ①是否存在：delId == houses[i].getI->模型层方法
  ②过滤结果(index)：-1(return false)
2.删除对象：
  ①覆盖更新：i=delId,i<record-1
  ②末位置空：houses[record-1]=null
  ③更新房屋数目：record--
 */
    public boolean delete(int delId){
        int index = -1;
        for (int i = 0; i < record; i++) {
            if (delId == houses[i].getId()){
                index = i;
            }
        }
        if(index == -1){
            System.out.println("很抱歉，您要删除的房屋不存在");
            return false;
        }
        for (int i = index; i < record - 1; i++) {    //i<record空指针异常
            houses[i] = houses[i+1];
        }
        houses[--record] = null;
        return true;
    }
/*查找房屋
1.房屋是否存在：返回对象/null(错误提醒)
 */
    public House search(int searchId){
        for (int i = 0; i < record; i++) {
            if (searchId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
/*修改信息
1.对象是否存在：返回对象/null
  (调用search())
 */
}





