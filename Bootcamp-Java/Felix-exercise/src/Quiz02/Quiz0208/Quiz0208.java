public class Quiz0208 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder("abc");
    // boolean bool8 = s.append("def").startsWith("def");     // Compile error
    // System.out.println(bool8);
    String string8 = s.append("def").toString();
    boolean bool8 = string8.startsWith("def");
    System.out.println(bool8);                             // false
    bool8 = string8.startsWith("abc");
    System.out.println(bool8);                             // true
  }
}
