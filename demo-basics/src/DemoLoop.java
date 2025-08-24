public class DemoLoop {
  public static void main(String[] args) {
    
    // if-else (program flow)
    // programming should be able to run by multiple times
    // int x = 2;
    // x = x * 2;
        // x = x * 2;
            // x = x * 2;
                // x = x * 2;
                    // x = x * 2;
                        // x = x * 2;
                            // x = x * 2;
                                // x = x * 2;
                                    // x = x * 2;
                                        // x = x * 2;
    // System.out.println(x);

    // Loop (Programming tool)
    // for (initializer; condition to continue; modifier);
    // i must be equal to 0, not 1.
    // Condition to continue should be expressed as <, not <=.
    int x1 = 2;
    int n1 = 10;
    for (int i = 0; i < n1; i++) {
      System.out.println(x1);
      x1 = x1 * 2;
    }

    int n2 = 3;
    for (int i = 0; i < n2; i++) {
      System.out.println("abc");
    }
    // Step 1:  int i = 0;
    // Step 2:  i < 3 ?  (Yes. i = 0)
    // Step 3:  print abc
    // Step 4:  i++ (means i = i + 1)
    // Step 5:  i < 3 ?  (Yes. i = 1)
    // Step 6:  print abc
    // Step 7:  i++
    // Step 8:  i < 3 ?  (Yes. i = 2)
    // Step 9:  print abc
    // Step 10: i++
    // Step 11: i < 3 ?  (No. i = 3)
    // ! Conclusion:  The above loop executed 11 lines of code.
    
    // 1. Use for loop to print 1 3 5 7 9.
    for (int i = 0; i < 10; i++) {    // 0 - 9
      if (i % 2 == 1) {
        System.out.println(i);
      }
    }
    
    // 2. 2^10 by for loop
    int base = 2;
    int result = base;
    for (int i = 0; i < 9; i++) {
      result *= base;
    }
    System.out.println(result);

    // 3. Ranged from 1 to 100, print the numbers which can be divided by 3 and 10.
    for (int i = 0; i < 101; i++) {    // 0 - 100
      if ((i % 3 == 0) && (i % 10 == 0)) {
        System.out.println(i);
      }
    }

    // 4. Given a String,
    // 4a) Check if this String contains 'l' character (by for loop)
    // 4b) Count the number of 'l'
    String s1 = "halo";
    char targetCh = 'l';
    // ! i -> index
    // boolean isFound = false;
    
    int counter = 0;
    for (int i = 0; i < s1.length(); i++) {    // length
      // if + charAt()
       if (s1.charAt(i) == targetCh) {
         // isFound = true;
         counter++;
         }
    }
    // if (isFound) {    
    // if (isFound) defaults isFound is true
    if (counter > 0) {
      System.out.println(targetCh + " is found, count = " + counter + ".");
    } else {
      System.out.println(targetCh + " is not found.");
    }

    // Searching pattern
    String s2 = "hello";
    String targetString = "ll";

    boolean isMatched = true;
    boolean isEverMatched = false;
    for (int i = 0; i < s2.length() - targetString.length() + 1; i++) {
    isMatched = true;
      for (int j = 0; j < targetString.length(); j++) {
        if (s2.charAt(i + j) != targetString.charAt(j)) {
          isMatched = false;
        }
      }
      if (isMatched) {
        isEverMatched = true;
      }
    }
    if (isEverMatched) {
      System.err.println("Pattern " + targetString + " is found.");
    } else {
      System.err.println("Pattern " + targetString + " is not found.");
    }

    // Contains 屬於 methods 其中一種, 開箱即用
    // Contains 用於 check whether s2 contains targetString or not.
    System.out.println(s2.contains(targetString));    // true
    // In this case, s2, "hello", contains value of targetString "ll", thus true.

    System.out.println("abc".contains("ab"));    // true
    // In this case, "abc" contains "ab", thus true.

    System.out.println("abc".contains("abc"));    // true
    System.out.println("abc".contains("abcd"));    // false

    for (int i = 0; i < 10; i++) {
      int i1 = i + 1;
      System.out.println(i1);
    }

    // print 2, 4, 6, 8, 10
    for (int i = 0; i < 10; i++) {
      int i1 = i + 1;
      if (i1 % 2 == 0) {
         System.out.println(i1);
      }
    }

    for (int i = 1; i < 11; i++) {
      if (i % 2 != 0) {
        continue;    // continue means go to next iteration -> i++
                     // if odd, go to next iteration directly -> i++
                     // if even, go to system.out.println, then continue the loop.
      }
      System.out.println(i);
    }
    // continue
    // 1000 lines of a code
    // For example, only prohibit the access to server on a certain date (ie. Christmas) in a year.
    // For example, when computing days of attendance, HR should exclude the days of 8 Signal or black rainstorm.
    // continue is useful.

    // break -> searching, exit earlier
    // Search the name containing J character
    String name = "John";
    char charTarget = 'J';
    boolean isFound = false;
    for (int i = 0; i < name.length(); i++) {
      System.out.println("Test flow: " + i);
      if (name.charAt(i) == charTarget) {
      isFound = true;
      break;    // exit the loop.
      }
      // break is common to be used in searching.
      // But, if counting, break cannot be used.
      // break is faster than continue.
    }
    System.out.println(isFound);    // true
    



  }
}
