import java.util.Arrays;

public class DemoPassByValue {
  public static void main(String[] args) {
    // ! 1. Pass by Value (8 primitives + 8 Wrapper Classes + String)
    // ! String 一定 pass by value.
    // Object p1 則不受影響, 仍然指著 "hello" 的 address.
    String p1 = "hello";
    String p2 = "john";
    System.out.println(compareStringLength(p1, p2));    // 1
    // Line 6 just pass the COPY OF VALUE, NOT COPY OF ADDRESS.
    System.out.println(p1);         // hello

    // ! 2. Pass by Reference (Array, all other Custom Classes)
    // Array 地址不變, 然而裡面的 values (objects) 則改變.
    int[] ages = new int[] {17, 3, 80, 2};
    sort(ages);
    System.out.println(Arrays.toString(ages));     // [2, 3, 17, 80]
  }

  public static void sort(int[] arr) {
    // Why don't we return the arr?
    Arrays.sort(arr);
  }

  public static int compareStringLength(String s1, String s2) {
      s1 = s1 + "!!!";
      if (s1.length() > s2.length()) {
        return 1;
      } else if (s1.length() < s2.length()) {
        return -1;
      } else {
        return 0;
      }
  } 




}

