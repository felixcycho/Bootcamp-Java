// ! Unchecked Exception --> Compile time --> allows exist
// ! Checked Exception --> Compile time --> handle / fix

public class DemoCheckedException {
  public static void main(String[] args) {
    try {
    System.out.println(total(new int[0]));        // 0
    total(null);                                 // java.lang.NullPointerException
    // } catch (InvalidParameterException e) {    // red underline, so at compile time, author 已經需要處理.

    // }
    
    } catch (IllegalArgumentException e) {

    }
  }

  // RuntimeException (IllegalArgumentException):
  // 1. method caller can ignore RuntimeException (not to fix by try-catch).
    // method caller 可以 fix, 可以 not to fix.
  // 2. method author no need to add Exception into method signature.
    // it means method author no need to handle/fix RuntimeException.
      // 當 at runtime 爆鑊之際, method caller may fix by try-catch, or let the problem go.

  // Exception (InvalidParameterException):
  // 1. method caller has to handle/fix by try-catch, at compile time.
  // 2. method author to add Exception into method signature.
  public static int total(int[] arr) {
    if (arr == null)
      throw new IllegalArgumentException("Array is null.");       // ! RuntimeException (unchecked exception)
    int total = 0;
    for (int x : arr) {
      total += x;
    }
    return total;
  }

  public static int total2(int[] arr) throws InvalidParameterException {
    if (arr == null)
      throw new InvalidParameterException("Array is null.");
    int total = 0;
    for (int x : arr) {
      total += x;
    }
    return total;
  }
}
