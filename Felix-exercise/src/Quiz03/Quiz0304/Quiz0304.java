enum Color {
  RED(1), YELLOW(2), BLACK(3);

  static int counter = 0;       // !!!
  int value;

  // Constructor goes first or static variable?
  Color(int i) {
    this.value = i;
    counter++;
  }
}

public class Quiz0304 {
  public static void main(String[] args) {
    System.out.println(Color.counter);
      // Compile error, 
        // cannot refer to the static enum field Color.counter within an initializer
  }
}
