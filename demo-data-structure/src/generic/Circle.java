package generic;

public class Circle extends Shape {
  private int radius;

  public Circle(int radius) {
    this.radius = radius;
  }
  
  public int getRadius() {
    return this.getRadius();
  }

  @Override
  public double area() {
    return this.radius * this.radius * 3.14;
  }

}
