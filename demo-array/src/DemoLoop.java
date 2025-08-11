import java.util.Arrays;

public class DemoLoop {
  public static void main(String[] args) {

    // John, Peter, Sally
    String[] names = new String[] {"John", "Peter", "Sally"};
    // for loop print
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);
    }

    // For-each loop
    // ! Syntax: for (variable name : array name)
    for(String name : names) {
      System.out.println(name);
    }
    
    // char[] a b c i j k
    char[] chs = new char[] {'a', 'b', 'c', 'i', 'j', 'k'};
    // for-each loop
    for (char ch : chs) {
      System.out.println(ch);
    }

    // New String method: toCharArray()
    // ! char[] chs1 = "hello";    invalid
    char[] chs1 = "hello".toCharArray();
    for (char ch : chs1) {
      System.out.println(ch);
    }

    // hello --> olleh
    // i--
    String str = "hello";
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {    // 4 3 2 1 0
      // newStr = newStr + str.charAt(i);
      newStr += str.charAt(i);
    }
    System.out.println(newStr);

    // while loop
    // In common, i, j, k, are used for looping variables.
    // ! int i;    Don't use 
    int n = 3;
    int total = 0;
    while (n > 0) {
      total += n;
      n--;
    }
    // Step 1: n > 0?    Yes (n=3)
    // Step 2: total becomes 3
    // Step 3: n--
    // Step 4: n > 0?    Yes (n=2)
    // Step 5: total becomes 5
    // Step 6: n--
    // Step 7: n > 0?    Yes (n=1)
    // Step 8: total becomes 6
    // Step 9: n--
    // Step 10: n > 0?    No (n=0)  -> exit loop


    // given int 532 -> 5 + 3 + 2 => 10
    int number = 532;
    // while loop
    // 除數概念 ( / % )
    // 1st step: 532 -> 53 (2)
    // 2nd step: 53 -> 5 (3)
    // 3rd step: 5 -> 0 (5)
    // ! int total = 0;    invalid, because total has already been defined as int in above.
    total = 0;
    while (number > 0) {
      total += number % 10;
      number = number / 10;
      }
      System.out.println(total);

    // ! Find Max. / Min.
    int[] array = new int[] {4, -9, 100, -50, 400, 230};
    int max = array[0];
    int min = array[0];
    int sum = 0;
    double average = 0.0;
    for (int x : array) {
       if (x > max) {
        max = x;
       }
    }
    for (int x : array) {
      if (x < min) {
        min = x;
      }
    }
    for (int x : array) {
      sum += x;
    }

    for (int x : array) {
      // average = sum / array.length    // int / int --> int  => 112
      average = sum / (double) array.length;    // int / dobule --> doubke  => 112.5
      // average = (double) sum / array.length;    // double / int --> double  => 112.5
      // average = (double) (sum / array.length);    // double (int) --> double  => ! 112.0
    }
    // The aboves only applicable if no need to adjust the integers in array.
    // Otherwise, other for-loop should be used.
    System.out.println(max);
    System.out.println(min);
    System.out.println(sum);
    System.out.println(average);

    // swap
    int a = 10;
    int b = 20;
    // exchange their value
    int backup = a;
    a = b;
    b = backup;

    System.out.println(a);    // 20
    System.out.println(b);    // 10

    // Move the head element to the tail.
    // [-9, 100, -50, 400, 230, 4]
    int[] array2 = new int[] {4, -9, 100, -50, 400, 230};
    // to change the integers of an array, the following for-loop should be used.
    for (int i = 0; i < array2.length; i++) {
      // swap
      backup = array2[i];
      array2[i] = array2[i + 1];
      array2[i + 1] = backup;
    }
    System.out.println(Arrays.toString(array2));    // [-9, 100, -50, 400, 230, 4]
    // Once input this sentence, "import java.util.Arrays;" is appeared on line 1.

    // 2. Move Max value to the tail.
    // [x, x, x, x, x, 400]
    int[] array3 = new int[] {4, -9, 100, -50, 400, 230};
    for (int i = 0; i < array3.length - 1; i++) {
      if (array3[i] > array3[i + 1]) {
        backup = array3[i];
        array3[i] = array3[i + 1];
        array3[i + 1] = backup;
      }
    }
    System.out.println(Arrays.toString(array3));

    // ! 3. Sorting Asc
    // Repeating moving max value to the tail.
    // [x, x, x, x, x, 400]
    // [x, x, x, x, 230, 400]
    // [x, x, x, 100, 230, 400]
    // [x, x, 4, 100, 230, 400]
    // [-50, -9, 4, 100, 230, 400]
    int[] array4 = new int[] {4, -9, 100, -50, 400, 230};
    for (int i = 0; i < array4.length - 1; i++) {    // Number of time to repeat moving max
      
      for () {    // 

      }
    }

  }
}
