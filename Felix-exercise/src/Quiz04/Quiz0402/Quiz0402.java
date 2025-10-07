package Quiz0402;
import java.util.LinkedList;

public class Quiz0402 {
  public static void main(String[] args) {
    // Declaration & Initialization
    LinkedList<String> strings = new LinkedList<>();

    for (int i = 0; i < 4; i++) {
      if (i % 2 > 0) {            // odd
        strings.addLast("N");
      } else {
        strings.addLast("C");
      }
    }
    strings.addFirst("V");
    strings.add("T");             // addLast()
    strings.add(4, "E");          // add to 5th element
    strings.set(2, "I");          // change 3rd element
    System.out.println(strings);  // [V, C, I, C, E, N, T]
  }
}
