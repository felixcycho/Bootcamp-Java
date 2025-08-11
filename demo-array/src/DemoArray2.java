import java.util.Arrays;

// String.length()    // need to add blanket
// Array.length    // no need to add blanket
// Array can only use one chain method. This is length.
// String can use great deal methods, not only length.

public class DemoArray2 {
    public static void main(String[] args) {
   // loop array
   long[] array = new long[4];
   // ! array[0] --> long variable
   array[0] = 10;    // upcast / promotion (int to long)
   array[1] = 100L;
   array[2] = -9;
   array[3] = 0;

   for (int i = 0; i < array.length; i++) {
    System.out.println(array[i]);
   }

   for (int i = 0; i < array.length;  i++) {
     array[i] = array[i] + 1;    
     // ! long value + int value --> long value
     // put long value into long variable
   }
   System.out.println(Arrays.toString(array));    // [11, 101, -8, 1]
   // Once entering the word "Arrays.", there may be a outline appearing,
   // then I should choose the first one "Arrays"
   // Since then, a sentence "import java.util.Arrays" should be appeared on line 1.
   // + 1 to all elements by loop

   // 11 + 101 => 112
   // 101 + -8 => 93
   // -8 + 1 => -7
   // 1
   long[] array2 = new long[4];

   for (int i = 0; i < array.length; i++) {
      if (i == array.length -1) {
        array2[i] = array[i];
      } else {
        array2[i] = array[i] + array[i + 1];
        }
   }
   System.out.println(Arrays.toString(array2));

   // String[]
   String[] names = new String[3];
   names[0] = "Peter";
   names[1] = "Jennie";
   names[2] = "Lucas";
   // how many names contain 'e'?

   int counter = 0;
   for (int i = 0; i < names.length; i++) {
    if (names[i].contains("e")) {
       counter++;
    }
   }
   System.out.println(counter);

   // Put String's length into another array
   int[] nameLengths = new int[names.length];
   for (int i = 0; i < names.length; i++) {
    nameLengths[i] = names[i].length();
   }
   System.out.println(Arrays.toString(nameLengths));

   // String --> boolean
   // lelel
   // lellel
   // aeleb
   // aelleb
   // ""
   String word = "lellel";    
   // lelel --> true, lellel --> true, peter --> false
   boolean isPalindrome = true;    // check if not true, then immediately exit. Thus, define true.
   for (int i = 0; i < word.length(); i++) {    // 6 / 2 = 3 (0/1/2), 5 / 2 = 2 (0/1)
      if (word.charAt(i) == word.charAt(word.length() - 1 - i)) {
        isPalindrome = true;      // should ensure all if conditions are true.
        break;    // if not true, 不對稱, then immediately break.
      }
    }
   System.out.println("isPalindrome = " + isPalindrome);

   // declare array
   // if some numbers may not have been known, and should be blanket and declare later.
   int [] ages = new int[3];
   ages [0] = 31;
   ages [1] = 9;
   ages [2] = 4;
   System.out.println(Arrays.toString(ages));

   int[] ages2 = new int[] {31, 9, 4};    // given you had known all the numbers at the beginning.
   System.out.println(Arrays.toString(ages2));












  }
}
