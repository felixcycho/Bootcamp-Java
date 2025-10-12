public class Square {
  private double length;

  public double area() {
    return this.length * this.length;
  }

  public void setLength(double length) {      
    this.length = length;
  }

  public static void main(String[] args) {
    Square s9 = new Square();
    s9.setLength(5.0);                         
    System.out.println(s9.area());             // 25.0
  }
}