public class DemoRuntimeException2 {
  public static void main(String[] args) {

    // ! avoidable exception (i.e. bug)
    // 1. NPE (NullPointerException)
    String s = null;
    try {
      System.out.println(s.length());              // java.lang.NullPointerException
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }

    // 2. ArrayIndexOutOfBoundsException
    int[] arr = new int[3];
    try {
      System.out.println(arr[3]);       // java.lang.ArrayIndexOutOfBoundsException
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }

    // 3. ArithmeticException
    double average = 0;
    // int average = 10 / count;          // 除零指令, 一定要放在 try 入面
    try {
      int count = 0;
      int total = 100;
      average = total / count;
      System.out.println(average);        // java.lang.ArithmeticException: / by zero
    } catch (ArithmeticException e) {
      average = -1;
    }
    int count2 = 0;
    int total2 = 100;
    double average2 = 0;
    if (count2 != 0) {
      average2 = total2 / count2;
    } else {
      average2 = -1;
    }
    System.out.println(average2);
    
    int count3 = 0;
    int total3 = 100;
    try {
      double average3 = total3 / count3;
      System.out.println(average3);
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }

    // 4. StringIndexOutOfBoundsException
    String ss = "hello";
    try {
      System.out.println(ss.charAt(5));   // java.lang.StringIndexOutOfBoundsException
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }

    // ! Unavoidable exception
    // 5. Method throw exception
    String input = null;
    try {
      getLength(input);    // java.lang.IllegalArgumentException
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }
    // ! Solution for method caller: 
    // i. try-catch IllegalArgumentException
    // ii. if input != null

    // 6. Type Conversion (i.e. String to Integer)
    String number = "3!";
    try {
      System.out.println(Integer.valueOf(number));      // java.lang.NumberFormatException
    } catch (RuntimeException e) {
      System.out.println("The returned exception is well received.");
      System.out.println("The root cause is " + e.getMessage());
    }
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
