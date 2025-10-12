enum Color {
    RED(1), YELLOW(2), BLACK(3);

    int value;

    // Constructor
    Color(int i) {
        this.value = i;
    }

    // Static method to get the count of enum constants
    public static int getCounter() {
        return Color.values().length;  
    }
}

public class Quiz0304d {
  public static void main(String[] args) {
    try {
      System.out.println(Color.getCounter());  // java.lang.Error
    } catch (NoSuchMethodError e) {
      System.out.println("No such method.");   // No such method.
    }
    
  }
}
