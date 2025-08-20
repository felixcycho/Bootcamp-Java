package src.Shape;

import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  @Override               // 有 abstract method, 就需要寫 @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  
}
