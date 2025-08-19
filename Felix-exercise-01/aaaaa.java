import java.math.BigDecimal;
import java.math.RoundingMode;

public class aaaaa {
  public static void main(String[] args) {
    

    // Question 1:
    int price = 150;
    int quantity = 10;
    double discount = 0.9;

    BigDecimal totalAmount = new BigDecimal(price * quantity * discount);

    System.out.println(totalAmount.setScale(2, RoundingMode.HALF_EVEN));
    System.out.println(totalAmount.getClass().getName());

    // Question 2:
    byte hoursOfDay = 24;
    byte DaysOfWeek = 7;
    byte hoursOfWeek = (byte) (hoursOfDay * DaysOfWeek);
    
    System.out.println(hoursOfWeek);
    

    

    // Question 8:





    // Question 9.
    int a9 = 7;

    while (a9 < 10) {
      switch (a9) {
        case 8:
          System.out.print("0");
        case 9:
          System.out.print("2");
      }
      a9++;
    }
    System.out.println("");



    // Question 10.
    int g10 = 3;
    System.out.println(++g10 * 8);
    System.out.println(g10++ * 8);




  }
}
