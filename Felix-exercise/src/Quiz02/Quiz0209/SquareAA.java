import java.math.BigDecimal;

public class SquareAA {
  private Double length;

  public Double area() {
    return this.length.multiply(this.length);
  }

  public void setLength(Double length) {      
    this.length = length;
  }

  public static void main(String[] args) {
    SquareAA s9 = new SquareAA();
    s9.setLength(5.0);                         
    System.out.println(s9.area());        //java.lang.Error: Unresolved compilation problem: 
        // The method multiply(Double) is undefined for the type Double
  }
}
