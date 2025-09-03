public class DemoRuntimeException {
  public static void main(String[] args) {

    // ! avoidable exception (i.e. bug)
    // 1. NPE (NullPointerException)
    String s = null;
    // System.out.println(s.length());              // java.lang.NullPointerException

    // 2. ArrayIndexOutOfBoundsException
    int[] arr = new int[3];
    // System.out.println(arr[3]);       // java.lang.ArrayIndexOutOfBoundsException

    // 3. ArithmeticException
    int count = 0;
    // int average = 10 / count;
    // System.out.println(average);        // java.lang.ArithmeticException: / by zero

    // 4. StringIndexOutOfBoundsException
    String ss = "hello";
    // System.out.println(ss.charAt(5));   // java.lang.StringIndexOutOfBoundsException

    // ! Unavoidable exception
    // 5. Method throw exception
    String input = null;
    // getLength(input);    // java.lang.IllegalArgumentException
    // ! Solution for method caller: 
    // i. try-catch IllegalArgumentException
    // ii. if input != null

    // 6. Type Conversion (i.e. String to Integer)
    String number = "3!";
    // System.out.println(Integer.valueOf(number));      // java.lang.NumberFormatException
    // "!" is not integer.
    // ! Solution for method caller:
    // i. try-catch NumberFormatException

    // 7. Login (i.e. database)
    // username or password is wrong.   -->  java.lang.IOException

    // 8. Find a specific file name in a folder.
    // java.lang.FileNotFoundException

  }

  public static int getLength(String s) {
    if (s != null) 
      return s.length();
    throw new IllegalArgumentException("s should not be null.");
  }



}
