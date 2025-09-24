import java.math.BigDecimal;

public class Square extends Shape {
  private double length;

  public Square(double length) {
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.length) //
        .multiply(BigDecimal.valueOf(this.length)) //
        .doubleValue();
  }
}
