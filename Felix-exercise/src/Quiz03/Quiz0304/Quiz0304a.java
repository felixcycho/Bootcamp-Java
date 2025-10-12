enum ColorA {
  RED(1), YELLOW(2), BLACK(3);

  static int counter = 0; // Counter to track number of instances
  int value;

  // Constructor
  ColorA(int i) {
    this.value = i;
    counter++;
  }

  // Static block to ensure counter is updated after all enums are initialized
  static {
    counter = values().length; // Set counter based on number of constants
  }
}

public class Quiz0304a {
  public static void main(String[] args) {
    System.out.println(ColorA.counter); // Compile error:
      // Cannot refer to the static enum field ColorA.counter within an initializer
  }
}
