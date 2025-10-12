import java.math.BigDecimal;

public class SquareC {
  private BigDecimal length;

  public BigDecimal area() {
    return this.length.multiply(this.length);
  }

  public void setLength(double length) {    
    this.length = length;       // Compile error: cannot convert from double to BigDecimal
  }

  public static void main(String[] args) {
    SquareC s9 = new SquareC();
    s9.setLength(5.0);
    System.out.println(s9.area());
  }
}
