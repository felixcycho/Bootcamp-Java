import java.math.BigDecimal;
import java.util.Arrays;

public class LoopExercise {
  public static void main(String[] args) {
    // 1. Print 6 times hello
    // Use: for loop
    for (int i = 0; i < 6; i++) {
      System.out.println("hello");
    }
    
    // 2. Expected output: "0,1,2,3,4"
    // Use: for loop
    int[] Array1to4 = new int[5];

    Array1to4[0] = 0;

    for (int i = 0; i < Array1to4.length - 1; i++) {
      Array1to4[i + 1] = Array1to4[i] + 1;
    }
      System.out.println(Arrays.toString(Array1to4));

    // 3. Print even numbers between 2 and 20
    // Use: for loop + if
    int[] EvenNums = new int [10];

    for (int i = 0; i < EvenNums.length; i++) {
      EvenNums[i] = (i + 1) * 2;
    }
    System.out.println(Arrays.toString(EvenNums));

    // 4. Print the numbers between 1 and 100, which can be divided by 3 or 5
    // Use: for loop + if
    int[] Array1to100 = new int[100];
    
    for (int i = 0; i < Array1to100.length; i++) {
      Array1to100 [i] = i + 1;
    }

    for (int intArray1to100 : Array1to100) {
      if ((intArray1to100 < (Array1to100.length + 1)) && (intArray1to100 % 3 == 0 || intArray1to100 % 5 == 0)) {
        System.out.print(intArray1to100 + " ");
      }
    } 
    System.out.println("");

    // 5. Sum up the numbers between 0 and 15 and print it
    // Use: for loop
    int sumQ5 = 0;
    for (int i = 0; i < 16; i++) {
      sumQ5 += i;
    }
    System.out.println(sumQ5);

    // 6. sum up all odd numbers betwen 0 - 10
    // Sum up all even numbers betwen 0 - 10
    // Find the product of evenSum and oddSum
    // Use: for loop + if
    int evenSum = 0;
    int oddSum = 0;
    
    for (int i = 0; i <= 10; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }
    System.out.println(evenSum);
    System.out.println(oddSum);

    // 7. Check if 'd' exists in the string.
    // print "d is found."
    // otherwise, print "d is not found."
    String str7 = "ijkabcpodi";
    char chr7 = 'd';

    int charTarget7 = 0;
    for (int i = 0; i <= str7.length(); i++) {
      if (i == str7.indexOf(chr7)) {
        charTarget7 = str7.indexOf(chr7);
        System.out.println("The index of the last character of " + chr7 + " is found.");
        break;
      } else if (i == str7.length()) {
        System.out.println("Not found.");
      }
    }

    // 8. Check if the string s8b is a substring of s8a
    // print "s8b is a substring."
    // otherwise, print "s8b is not a substring."
    // Use: for loop + if + substring method
    String s8a = "abcba";
    String s8b = "cba";
    boolean s8ab = false;

    s8ab = s8a.contains(s8b);
    if (s8ab == true) {
      System.out.println(s8b + " is a substring of " + s8a + ".");
    } else {
      System.out.println(s8b + " is not a substring of " + s8a + ".");
    }

    // 9. Count the number of char value in the given String s9
    // print "count=2"
    // Use: for loop + if
    String s9 = "pampers";
    char c9 = 'p';

    int counter9 = 0;
    for (int i = 0; i < s9.length(); i++) {
      if (s9.charAt(i) == c9) {
        counter9 ++;
      }
    }
    if (counter9 != 0) {
      System.out.println("count = " + counter9);
    } else {
      System.out.println("Not found.");
    }

    // 10. Replace all char value 'x' in the given String array by 'k'
    // Print arr10: ["akc", "kkk", "k", "kbk", "mkk"]
    // Use: for loop + replace method
    String[] arr10 = new String[] {"akc", "xxx", "x", "xbx", "mkx"};

    for (int i = 0; i < arr10.length; i++) {
      arr10[i] = arr10[i].replace('x', 'k');
    }
    System.out.println(Arrays.toString(arr10));
    

    // 11. Count the number of Uppercase char value in the given string s11
    // Print "count uppercase=4"
    // Use: for loop + if
    String s11 = "kLKloOOu";

    int count11 = 0;

    for (char chr11 : s11.toCharArray()) {
      if (Character.isUpperCase(chr11)) {
        count11 ++;
      }
    }
    System.out.println("count uppercase = " + count11);

    // 12. Print the following pattern of * value
    // *****
    // *****
    // *****
    int row12 = 3;
    int column12 = 5;

    for (int i = 0; i < row12; i++) {
      for (int j = 0; j < column12; j++) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // 13. Given a string value s13, each of the char value has its score.
    // Calculate the total score
    // Use: switch + for loop

    // l -> 1 score
    // r -> 3 score
    // d -> 2 score
    // u -> 4 score
    // for other character, -1 score
    String s13 = "lrlaudbucp";

    int totalScore = 0;
    for (int i = 0; i < s13.length(); i++) {
      char chr13 = s13.charAt(i);

      if (chr13 == 'l') {
        totalScore += 1;
      } else if (chr13 == 'r') {
        totalScore += 3;
      } else if (chr13 == 'd') {
        totalScore += 2;
      } else if (chr13 == 'u') {
        totalScore += 4;
      } else {
        totalScore -= 1;
      }
    }
    System.out.println("Total score is: " + totalScore);
    
    // 14. Assign the long values of 1, 4, 9, -4 to the given array arr14
    long[] arr14 = new long[4];

    arr14[0] = 1L;
    arr14[1] = 4L;
    arr14[2] = 9L;
    arr14[3] = -4L;

    System.out.println(Arrays.toString(arr14));


    // 15. Find the max value and min value in arr14
    // Use One Loop + if
    long maxArr14 = arr14[0];
    long minArr14 = arr14[0];

    for (int i = 0; i < arr14.length; i++) {
      if (arr14[i] > maxArr14) {
        maxArr14 = arr14[i];
      } else if (arr14[i] < minArr14) {
        minArr14 = arr14[i];
      }
    }
    System.out.println("The maximum is " + maxArr14);
    System.out.println("The minimum is " + minArr14);
    
    // 16. Declare a float value (arr16) array with value 0.2, 0.3, 0.6
    float[] arr16 = new float[3];

    arr16[0] = 0.2f;
    arr16[1] = 0.3f;
    arr16[2] = 0.6f;

    for (float fArr16 : arr16) {
      System.out.print(fArr16 + " ");
    } 
    System.out.println();
    System.out.println(Arrays.toString(arr16));

    System.out.print("[");
    for (int i = 0; i < arr16.length; i++) {
      System.out.print(arr16[i]);
      if (i < arr16.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");

    // 17. Add value 0.1 to each of value in array arr16
    // Print: [0.3, 0.4, 0.7]
    // Use: BigDecimal
    BigDecimal toAddArr16 = new BigDecimal("0.1");
    BigDecimal[] arr17 = new BigDecimal[3];

    for (int i = 0; i < arr17.length; i++) {
      arr17[i] = new BigDecimal(Float.toString(arr16[i])).add(toAddArr16);
    }
    System.out.println(Arrays.toString(arr17));


    // 18. Count the number of target strings in the String[]
    String[] arr18 = new String[] {"Steve", "Tommy", "Katie", "Tommy", "Lydia"};
    String target = "Tommy";
    // Print "count name=2"
    int count18 = 0;

    for (String nameArr18 : arr18) {
      if (nameArr18.equals(target)) {
        count18++;
      }
    }
    System.out.println("Count name = " + count18);

    // 19. swap the max digit and min digit
    // Assumption: each digit value appear once in the String
    // Print: "49280"
    String s19 = "40289";

    char maxDigit19 = '0';
    char minDigit19 = '9';
    int maxIndex19 = -1;
    int minIndex19 = -1;

    for (int i = 0; i < s19.length(); i++) {
      char currentDigit19 = s19.charAt(i);
      if (currentDigit19 > maxDigit19) {
        maxDigit19 = currentDigit19;
        maxIndex19 = i;
      }
      if (currentDigit19 < minDigit19) {
        minDigit19 = currentDigit19;
        minIndex19 = i;
      }
    }

    char[] charArray19 = s19.toCharArray();
    char temp19 = charArray19[maxIndex19];
    charArray19[maxIndex19] = charArray19[minIndex19];
    charArray19[minIndex19] = temp19;

    String swapString19 = new String(charArray19);
    System.out.println(swapString19);

    // 20. Find the longest String in the String array
    // Print "longest=programming"
    String[] arr20 = new String[] {"python", "array", "programming", "java", "bootcamp"};
    
    String longest = "";

    for (String str20 : arr20) {
      if (str20.length() > longest.length()) {
        longest = str20;
      }
    }
    System.out.println("Longest is " + longest);
  }
}