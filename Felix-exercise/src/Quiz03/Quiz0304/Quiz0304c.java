enum ColorC {
    RED(1), YELLOW(2), BLACK(3);

    int value;

    // Constructor
    ColorC(int i) {
        this.value = i;
    }

    // Static method to get the count of enum constants
    public static int getCounter() {
      try{
        return ColorC.values().length;
      } catch (NoSuchMethodError e) {
        return 0;
      }
    }
}

public class Quiz0304c {
    public static void main(String[] args) {
      try {
        System.out.println(ColorC.getCounter());       // 3
      } catch (NoSuchMethodError e) {
        System.out.println("No such method.");
      }
    }
}