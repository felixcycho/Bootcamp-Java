import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // 17 types

    int[] arr = new int[2];
    arr[0] = 2;
    arr[1] = 3;

    int[] arr2 = new int[] {2, 3};
    // 2D array

    for (int x : arr2) {
      if (x % 2 == 1) {
        System.out.println(x + " is odd.");
      }
    }

    String[] urls = new String[] {"www.apple.com", "www.orange.com"};
    for (String url : urls) {
      if (url.contains(".com")) {
        System.out.println(url);
      }
    }

    double[] heights = new double[] {171.5, 182.3, 45.3};
    BigDecimal total = BigDecimal.ZERO;
    for (double h : heights) {
      total = total.add(BigDecimal.valueOf(h));
    }
    System.out.println(total.doubleValue());

    // ! Pass by reference
    double[] backup = heights;
    backup[0] = 180;
    System.out.println(heights[0]);

    Person p1 = new Person("John");
    Person p2 = p1; // pass reference
    p2.addPocket();
    p2.saveMoney(100);
    System.out.println(p1.getMoney()); // 100

    // ! 17 Types -> Pass by value
    Double d1 = new Double(10.3);
    Double d2 = d1; // ! pass value

    d2 = new Double(10.4);
    System.out.println(d1); // 10.3, no change

    // How to backup a Array
    double[] anotherHeights = Arrays.copyOf(heights, heights.length);
    anotherHeights[0] = 190.0;
    System.out.println(heights[0]); // 180.0

    // LocalDate
    LocalDate birthDate = LocalDate.of(1988, Month.OCTOBER, 3);
    // isBefore isAfter ()
    System.out
        .println(birthDate.isBefore(LocalDate.of(1988, Month.OCTOBER, 3))); // false

    // ! equals() -> LocalDate Author Override -> check YYYY MM DD

    // getYear, getDay, getMonth
    System.out.println(birthDate.getDayOfWeek()); // MONDAY

    // Month.class ?
    Month month = Month.MARCH;
    System.out.println(month.getValue());

  }
}
