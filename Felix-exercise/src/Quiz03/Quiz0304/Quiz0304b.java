enum ColorB {
    RED(1), YELLOW(2), BLACK(3);

    int value;

    // Constructor
    ColorB(int i) {
        this.value = i;
    }

    // Static method to get the count of enum constants
    public static int getCounter() {
        return ColorB.values().length;
    }
}

public class Quiz0304b {
  public static void main(String[] args) {
    System.out.println(ColorB.getCounter());        // 3
  }

}
