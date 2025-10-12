import java.math.BigDecimal;
import java.math.RoundingMode;

public class SquareAAA {
  private Double length;

  public Double area() {
    return BigDecimal.valueOf(this.length).multiply(BigDecimal.valueOf(this.length))
      .setScale(2, RoundingMode.HALF_UP).doubleValue();
  }

  public void setLength(Double length) {      
    this.length = length;
  }

  public static void main(String[] args) {
    SquareAAA s9 = new SquareAAA();
    s9.setLength(5.00);                         
    System.out.println(s9.area());        // 25.0 (due to data loss)
    System.out.printf("%.2f%n", s9.area().doubleValue());      // 25.00
  }
}
