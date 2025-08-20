package src.Shape;

import java.math.BigDecimal;

public class Square extends Shape{
  private double length;

  public Square(double length, String color) {
    super(color);
    this.length = length;
  }

  public double getLength() {
    return this.length;
  }
  
  @Override        // 有 abstract method, 就需要寫 @Override
  public double area() {
    return BigDecimal.valueOf(this.length)
          .multiply(BigDecimal.valueOf(this.length))
          .doubleValue();
  }

  
  
  
}
