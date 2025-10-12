import java.math.BigDecimal;

public class SquareA {
  private double length;

  public double area() {
    return this.length.multiply(this.length);
  }

  public void setLength(double length) {      
    this.length = length;
  }

  public static void main(String[] args) {
    SquareA s9 = new SquareA();
    s9.setLength(5.0);                         
    System.out.println(s9.area());      // java.lang.Error: Unresolved compilation problem: 
      //  Cannot invoke multiply(double) on the primitive type double
  }
}
