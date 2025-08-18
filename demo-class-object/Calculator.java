public class Calculator {
  private int x;
  private int y;

  // Constructor
  public Calculator(int x, int y) {
    this.x = x;
    this.y = y;
  }

  // Getter, instance method
  public int getX() {
    return this.x;
  }
  
  // Getter, instance method
  public int getY() {
    return this.y;
  }
  
  // Getter, instance method
  public int sum() {
    return this.x + this.y;
  }
  
  // Static method
  public static int sum(int x, int y) {
    return x + y;
  }
  public static void main(String[] args) {
    System.out.println(new Calculator(10, 7).sum());    // 17, use Class to call static method
    System.out.println(Calculator.sum(10, 7));          // 17, use Class to call static method
  }
}
