
import java.util.Arrays;

public class DemoLoop {
  public static void main(String[] args) {

    // John, Peter, Sally
    String[] names = new String[] {"John", "Peter", "Sally"};
    // for loop print
    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);    // John, Peter, Sally (verticle)
    }

    String Name1 = "Felix";
    String Name2 = "Vincent";
    String Name3 = "Nobody";
    String[] names1 = new String[] {Name1, Name2, Name3};
    System.out.println(Arrays.toString(names1));
    for (int i = 0; i < names1.length; i++) {
      System.out.println(names1[i]);    // Felix, Vincent, Nobody (verticle)
    }
    // For-each loop
    // ! Syntax: for (variable name : array name)
    for(String name : names1) {
      System.out.println(name);    // Felix, Vincent, Nobody (verticle)
    }
    
    // char[] a b c i j k
    char[] chs = new char[] {'a', 'b', 'c', 'i', 'j', 'k'};
    // for-each loop
    for (char ch : chs) {
      System.out.println(ch);    // a, b, c, i, j, k (verticle)
    }

    // 1. New String method: toCharArray()
    // ! char[] chs1 = "hello";    invalid
    char[] chs1 = "hello".toCharArray();
    for (char ch : chs1) {
      System.out.println(ch);    // h, e, l, l, o (verticle)
    }

    // hello --> olleh
    // i--
    String str = "hello";
    String newStr = "";
    for (int i = str.length() - 1; i >= 0; i--) {    // 4 3 2 1 0
      // newStr = newStr + str.charAt(i);
      newStr += str.charAt(i);
    }
    System.out.println(newStr);    // olleh

    // 2. while loop
    // In common, i, j, k, are used for looping variables.
    // ! int i;    Don't use 
    int n = 3;
    int total = 0;
    while (n > 0) {
      total += n;
      n--;
    }
    System.out.println(total);    // 6
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
      System.out.println(total);    // 10

    // 3. Find Max. / Min.
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
    System.out.println(max);      // 400
    System.out.println(min);      // -50
    System.out.println(sum);      // 675
    System.out.println(average);  // 112.5

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
    for (int i = 0; i < array2.length - 1; i++) {
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
    System.out.println(Arrays.toString(array3));    // [-9, 4, -50, 100, 230, 400]

    // ! 3. Sorting Asc
    // Repeating moving max value to the tail.
    // [x, x, x, x, x, 400]          // i = 0
    // [x, x, x, x, 230, 400]        // i = 1
    // [x, x, x, 100, 230, 400]      // i = 2
    // [x, x, 4, 100, 230, 400]      // i = 3
    // [-50, -9, 4, 100, 230, 400]   // i = 4
    int[] array4 = new int[] {4, -9, 100, -50, 400, 230};
    for (int i = 0; i < array4.length; i++) {    // i-th of time to repeat moving max
      for (int j = 0; j < array4.length - i -1; j++) {    // j-th index for moving max value
        if (array4[j] > array4[j + 1]) {
          backup = array4[j];
          array4[j] = array4[j + 1];
          array4[j + 1] = backup;
        }
      }
    }
    System.out.println(Arrays.toString(array4));    // [-50, -9, 4, 100, 230, 400]

    // 5. Put all odd numbers into another array.
    // [-9]
    int[] array5 = new int[] {50, 9, 4, 100, 230, 400};
    int oddLength = 0;
    for (int x : array5) {
      if (x % 2 == 1) {
        oddLength++;
      }
    }
    int[] oddArray5 = new int[oddLength];
    System.out.println(oddLength);    // 1
    int idx = 0;
    for (int x : array5) {
      if (x % 2 == 1) {
        oddArray5[idx] = x;
        idx++;
      }
    }
    System.out.println(Arrays.toString(oddArray5));    // [9]

    // Find the character appeared most of times in a given string.
    // "hello" --> '1'
    // "abc" --> Not a test case
    String s = "hello";
    int targetIdx = -1;
    int maxCount = 0;
    for (int i = 0; i < s.length(); i++) {
      int countCh = 0;
      for (int j = 0; j < s.length(); j++) {
        if (s.charAt(i) == s.charAt(j)) {
          countCh++;
        }
      }
      if (countCh > maxCount) {
        maxCount = countCh;
        targetIdx = i;
      }
    }
    System.out.println(s.charAt(targetIdx));    // l
    // the above loop can only be applicable for small database.
    // Otherwise, e.g. 1_000_000 * 1_000_000, would be broken down.

    // Approach 2:
    int[] countCh = new int[26];
    for (int i = 0; i < s.length(); i++) {
      countCh[s.charAt(i) - 'a']++;           // very useful, must be well practised
      // or countCh[s.charAt(i) - 97]++;      is also OK
    }
    int maxCountCh = countCh[0];
    int chIdx = -1;
    for (int i = 0; i < countCh.length; i++) {
      if (countCh [i] > maxCountCh) {
        maxCountCh = countCh[i];
        chIdx = i;
      }
    }
    char chResult = (char) (chIdx + 'a');
    // or char chResult = (char) (chIdx + 97);     is also OK
    System.out.println(chResult);    // l

    // Given 2 strings, assume they are with same length
    String str1 = "abcd";
    String str2 = "pqrs";
    // apbqcrds
    String str3 = "";
    for (int i = 0; i < str1.length(); i++) {
      // String + char => String
      // char + char => int
      // String + int => String
      str3 = str3 + str1.charAt(i) + str2.charAt(i);         // apbqcrds
      // str3 += str1.charAt(i) + str2.charAt(i);            // 209211213215
      // str3 = str3 + (str1.charAt(i) + str2.charAt(i));    // ap209209bq211211cr213213ds215215
    }
    System.out.println(str3);

    int x = 5;
    do {      // 當強調無論如何都要做一次 while-loop 時適用
      System.out.println(x);    // 5, 4, 3, 2, 1 (verticle)
      x--;
    } while (x > 0);

    x = 4;
    while (x < 10) {
      if (x % 2 == 1) {
        System.out.println(x);    // 5, 7, 9 (verticle)
      }
      x++;
    }
    
    int h = 0;
    while (h < 6) {
      if (h > 3) {
        //break;
      }
      System.out.println(h);    // 0, 1, 2, 3 (verticle);
      h++;
    };
  }
}

