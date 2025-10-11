enum Color {
    RED(1), YELLOW(2), BLACK(3);

    int value;

    // Constructor
    Color(int i) {
        this.value = i;
    }

    // Static method to get the count of enum constants
    public static int getCounter() {
      try{
        return Color.values().length;
      } catch (NoSuchMethodError e) {
        return 0;
      }
    }
}

public class Quiz0304cc {
    public static void main(String[] args) {
      try {
        System.out.println(Color.getCounter());  // java.lang.NoSuchMethodError
      } catch (NoSuchMethodError e) {
        System.out.println("No such method.");   // No such method.
                                                    // conflict with enum Color in Quiz0304.java
      }
    }
}