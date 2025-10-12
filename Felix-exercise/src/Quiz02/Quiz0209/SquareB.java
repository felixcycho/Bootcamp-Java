import java.math.BigDecimal;

public class SquareB {
  private BigDecimal length;

  public BigDecimal area() {
    return this.length.multiply(this.length);
  }

  public void setLength(BigDecimal length) {        // Compile error, should be (double length)
    this.length = length;
  }

  public static void main(String[] args) {
    SquareB s9 = new SquareB();
    s9.setLength(5.0);                              // Compile error, 
     // The method setLength(BigDecimal) in the type SquareA is not applicable for the arguments (double).
    System.out.println(s9.area());
  }
}
