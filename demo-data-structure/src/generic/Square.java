package generic;

public class Square extends Shape {
    private int length;

  public Square(int length) {
    this.length = length;
  }
  
  public int getLength() {
    return this.getLength();
  }

  @Override
  public double area() {
    return this.length * this.length;       // int * int => int (but may be upgraded to double)
  }

  
}
