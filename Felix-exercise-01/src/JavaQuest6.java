public class JavaQuest6 {
  /**
   * Expected output:
   * 0 1 1 2 3 5 8 13 21 ... 
   * 
   */
  public static void main(String[] args) {
    int first = 0, second = 1;
    // for loop to print first 15 numbers in Fibonacci Sequence

    System.out.print(first + " " + second + " ");

    for (int i = 0; i < 13; i++) {
      int next = first + second;
      System.out.print(next + " ");
      first = second;
      second = next;
    }
  }
}
