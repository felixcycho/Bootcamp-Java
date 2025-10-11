enum ColorE {
    RED(1), YELLOW(2), BLACK(3);

    int value;

    // Constructor
    ColorE(int i) {
        this.value = i;
    }

    // Static method to get the count of enum constants
    public static int getCounter() {
        return ColorE.values().length;  
    }
}

public class Quiz0304e {
  public static void main(String[] args) {
    System.out.println(ColorE.getCounter());  // 3
  }
}
