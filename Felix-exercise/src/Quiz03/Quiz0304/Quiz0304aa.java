enum ColorAA {
  RED(1), YELLOW(2), BLACK(3);

  static int counter;

  // Static block to initialize the counter
  static {
    counter = 0;
  }

  int value;
  
  ColorAA(int i) {
    this.value = i;
    counter++;
  }
}

public class Quiz0304aa {
  public static void main(String[] args) {
    System.out.println(ColorAA.counter);
    // Compile error: 
      // cannot refer to the static enum field Color.counter within an initializer
  }
}