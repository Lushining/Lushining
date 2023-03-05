package big_;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Lusion
 * @version 1.0
 */
//new BigInteger/Decimal("")：大整型/高精度浮点型
/*普通方法(通过对象调用)：加减乘除
  1.add
  2.subtract
  3.multiply
  4.divide：Decimal异常->参数指定分母精度.ROUND_CEILING->保留分子精度
 */
public class Big {
    public static void main(String[] args) {
        System.out.println("=====BigInteger=====");
        BigInteger i = new BigInteger("222222222222222222222");
        System.out.println(i.add(i));
        System.out.println(i.subtract(i));
        System.out.println(i.multiply(i));
        System.out.println(i.divide(i));
        System.out.println("=====BigDecimal=====");
        BigDecimal d1 = new BigDecimal("1.111111111111111111111111");
        BigDecimal d2 = new BigDecimal("3");
        System.out.println(d1.divide((d2),BigDecimal.ROUND_CEILING));

        //divide异常->在参数中指定精度
    }
}
