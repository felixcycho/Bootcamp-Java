import java.util.Arrays;

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
   System.out.println(Arrays.toString(array));    // [11, 101, -0, 1]
   // Once entering the word "Arrays.", there may be a outline appearing,
   // then I should choose the first one "Arrays"
   // Since then, a sentence "import java.util.Arrays" should be appeared on line 1.
   // + 1 to all elements by loop

   // 11 + 101 => 112
   // 101 + -8 => 93
   // -8 + 1 => -7
   // 1
   long[] array2 = new long[4];
  }
}
