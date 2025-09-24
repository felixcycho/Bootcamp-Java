/**
 * Example Output
 * Second Max = 230
 */
public class JavaQuest8 {
  // Write a loop to find the second max number.
  public static void main(String[] args) {
    int[] testCase1 = new int[] { -10, 5, 100, 240, 230, 80 }; // Second Max = 230
    int[] testCase2 = new int[] { -10, 5, 100, 120, 240, 200 }; // Second Max = 200
    int[] testCase3 = new int[] { -10, 5, 120, -100, 100, 240 }; // Second Max = 120
    int[] testCase4 = new int[] { -10, 5, 100, 240, 240, 80 }; // Second Max = 240
    int[] testCase5 = new int[] { -2_147_483_648, -2_147_483_648, -2_147_483_648, -2_147_483_648, -2_147_483_648, -2_147_483_647 };

    System.out.println("Second Max = " + findSecondMax(testCase1));
    System.out.println("Second Max = " + findSecondMax(testCase2));
    System.out.println("Second Max = " + findSecondMax(testCase3));
    System.out.println("Second Max = " + findSecondMax(testCase4));
    System.out.println("Second Max = " + findSecondMax(testCase5));
  }
    // Your program should be able to handle all the above test case.
  public static int findSecondMax(int[] arr) {
    int max = Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;
    // code here ...
    for (int number : arr) {
      if (number >= max) {
        secondMax = max;
          max = number;
      } else if (number >= secondMax && number < max) {
         secondMax = number;
        }
    }  

    // first, find the max number.
    // for (int number : arr) {
    //  if (number >= max) {
    //    max = number;
    //  } 
    // }
    // Now, find the second max number by ignoring the max value.
    // for (int number : arr) {
    //  if (number > secondMax && number < max) {
    //    secondMax = number;
    //  }
    // }
    // If secondMax is still Integer.MIN_VALUE, it means that there was no second max found.
    return secondMax == Integer.MIN_VALUE ? -2_147_483_648 : secondMax;    // return -1 if no second max
  }
}