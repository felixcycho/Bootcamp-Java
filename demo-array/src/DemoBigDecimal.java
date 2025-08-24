import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    double result = 0.1 + 0.2;
    System.out.println(result);    // 0.30000000000004
    if(result == 3.0) {
      System.out.println("Result = 3.0");
    } else {
      System.out.println("Result != 3.0");
    }

    // Solution: BigDecimal
    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = new BigDecimal("0.2");
    BigDecimal bd3 = bd1.add(bd2);
    // Once if red bottom-line was appeared under "BigDecimal",
    // please remember to add "import java.math.BigDecimal" on the 1st line.
    System.out.println(bd3.doubleValue());    // 0.3

    // + add()
    BigDecimal bd4 = BigDecimal.valueOf(0.1);
    BigDecimal bd5 = BigDecimal.valueOf(0.2);
    BigDecimal bd6 = bd4.add(bd5);
    System.out.println(bd6.doubleValue());    // 0.3

    // - subtract()
    System.out.println(0.3 - 0.1);    // 0.199999999999999....
    System.out.println(BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue());    // 0.2
    System.out.println(bd4.subtract(bd5).doubleValue());    // -0.1

    // * multiply()
    System.out.println(0.1 * 0.2);    // 0.02000000.......
    System.out.println(bd4.multiply(bd5).doubleValue());    // 0.02

    // / divide(), non-terminating decimal, rounding
    System.out.println(0.3 / 0.1);    // 2.9999..........
    System.out.println(BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(0.1)));    // 3

    // 10 / 3
    // HALF_UP --> 0.5 or above, round up  四捨五入
    // HALF_DOWN --> 0.5 or below, round down
    System.out.println(BigDecimal.valueOf(10).divide(BigDecimal.valueOf(3), 2, RoundingMode.HALF_UP));    // 3.33
    
    double d10 = 10.0 / 3.0;
    System.out.println(d10);              // 3.33333333............5
    BigDecimal bd10 = BigDecimal.valueOf(10);
    BigDecimal bd11 = BigDecimal.valueOf(3);
    BigDecimal bd12 = bd10.divide(bd11, 2, RoundingMode.HALF_UP);

    System.out.println(bd12);             // 3.33
    




    





  }
}
