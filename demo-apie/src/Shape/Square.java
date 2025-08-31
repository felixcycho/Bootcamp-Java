package src.Shape;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

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
    // Step 2: if obj is not a Square Object, return false.
    // ! instanceOf = asking if obj is an object of Square
    if (!(obj instanceof Square)) {
      return false;
    }
    // Step 3: Because obj MUST be a square object, this becomes non-risky.
    Square otherSquare = (Square) obj;
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return Objects.equals(super.toString(), this.toString());
    return Objects.equals(super.getColor(), otherSquare.getColor()) //
        && Objects.equals(this.length, otherSquare.getLength());
        
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return super.getColor().equals(otherSquare.getColor())  //
    //     && this.length == otherSquare.getLength();
  }
    
  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.length, super.getColor());
  }

  // if lack of the following @Override, printout 會變亂碼.
  @Override
  public String toString() {
    return "Square (" //
      + "color = " + super.getColor()    //
      + ", length = " + this.length    //
      + ")";
   }
  
  

  public static void main(String[] args) {
    
  }
  
  
  
}
