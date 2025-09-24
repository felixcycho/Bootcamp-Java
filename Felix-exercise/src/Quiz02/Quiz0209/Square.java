import java.math.BigDecimal;

public class Square {
  private BigDecimal length;

  public BigDecimal area() {
    return this.length.multiply(this.length);
  }

  public void setLength(BigDecimal length) {        // Compile, should be (double length)
    this.length = length;
  }

  public static void main(String[] args) {
    Square s9 = new Square();
    s9.setLength(5.0);
    System.out.println(s9.area());
  }
}
