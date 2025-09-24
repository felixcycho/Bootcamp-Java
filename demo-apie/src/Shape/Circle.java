import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape1 {
  private double radius;

  public Circle(double radius, String color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return this.radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override               // 有 abstract method, 就需要寫 @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .setScale(2, RoundingMode.HALF_UP)
    .doubleValue();
  }

  // Method Signature = method name + parameters
  // for Override, rule = method signature + return type
  @Override
  public boolean equals(Object obj) {
    // Step 1: Check if address are same
    if (this == obj) {
      return true;
    }
    // Step 2: if obj is not a Circle Object, return false.
    // ! instanceOf = asking if obj is an object of Circle
    if (!(obj instanceof Circle)) {
      return false;
    }
    // Step 3: Because obj MUST be a circle object, this becomes non-risky.
    Circle otherCircle = (Circle) obj;
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return Objects.equals(super.toString(), this.toString());
    return Objects.equals(super.getColor(), otherCircle.getColor()) //
        && Objects.equals(this.radius, otherCircle.getRadius());
        
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return super.getColor().equals(otherCircle.getColor())  //
    //     && this.radius == otherCircle.getRadius();
  }
    
  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.radius, super.getColor());
  }

  // if lack of the following @Override, printout 會變亂碼.
  @Override
  public String toString() {
    return "Circle (" //
      + "color = " + super.getColor()    //
      + ", radius = " + this.radius    //
      + ")";
   }
  

  
}
