public class DemoBasicType {
  public static void main(String[] args) {
    // Primitive - int, short, byte, long, float, double, boolean, char
    byte b1 = 127;
    short s1 = b1;
    short s2 = (short) (b1 + 40000); // int -> short (overflow)

    // ASCII
    int ch = 'a'; // 97
    int ch2 = 'c'; // 99
    System.out.println(ch2 - 'a'); // 2

    float f1 = 0.45f;
    double d1 = f1; // No precison loss
    boolean isFemale = false;

    // Wrapper Class
    Integer i1 = 3; // auto-box
    Integer i2 = new Integer(3);
    Integer i3 = Integer.valueOf(3); //

    // Long l10 = Integer.valueOf(3); // Integer -> int -> long -> Long
    // Long l11 = 3; // int -> Integer -> Long
    Long l12 = 3L; // auto-box
    long l13 = 3; // promotion

    // String
    String s4 = "hello";
    String s6 = String.valueOf("hello");
    String s5 = new String("hello");

    s4.charAt(3); // l
    s4.equals("hello"); // true
    s4.equals(new String("hello")); // true
    "helloworld".replace("wo", "");

    String s7 = "Hello";
    String s8 = String.valueOf("Hello");
    s7 = s7 + "!";

    String s9 = null;
    // s9.charAt(0);
    if (s9 != null) {
      System.out.println(s9.length());
    }

    // if, switch (break)
    int age = 65;
    if (isFemale) {
      System.out.println("it is female.");
    } else {
      if (age > 60) {

      }
    }

    // and or
    if (isFemale && age > 40) {

    }

    if (isFemale || age > 40) {

    }

    if (isFemale || !isFemale && age > 40) {

    }

    // else if -> check number range
    // Best Example for Switch -> ENUM
    // switch -> Break and default
    Color color = Color.BLUE; // BLUE
    switch (color) {
      case RED:
        // ..
        break;
      case YELLOW:
        // ..
        break;
      case BLUE:
        // ..
        break;
    }
    // loop
  }

  public int calculate(boolean isFemale) {
    return isFemale ? 1 : 2;
  }

  public int calculate2(boolean isFemale, int age) {
    if (isFemale)
      return 1;
    return age > 40 ? 3 : 2;
  }
}
