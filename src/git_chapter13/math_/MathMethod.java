package math_;
/**
 * @author Lusion
 * @version 1.0
 */
//获取2-7之间的随机整数
/*1.取整数：强制转换(int)Math.random()
  2.[2,7)：random*5+2
*/
public class MathMethod {
    public static void main(String[] args) {

        for (int j = 0; j < 3; j++) {
            System.out.println((int) (Math.random() * 5 + 2));
        }
    }
}
//Math类常用静态方法
//1.abs绝对值 ; round四舍五入
//2.pow(a,b)幂方：a^b ; sqrt开方
//3.ceil向上取整 ; floor向下取整
//4.max/min
//5.random[0,1)随机小数
