import java.util.Arrays;

public class DemoArray1 {
  public static void main(String[] args) {
    // Problem: Store / Read a series of same type of data
    int x = 3;
    int y = 7;
    int a = 10;

    // ages [8, 1, 10, 50]
    // Data structure - read/write data in a location (array)

    // Step 1:  Create an array
    int[] array = new int[4];
    // Step 2:  Before so, please decide the length of an integer.
    // Step 3:  Place nambers into the array.
    // [0] --> index, starting from 0, length - 1 is the last index
    array[0] = 8;
    array[1] = 1;
    array[10] = 10;
    array[50] = 50;

    System.out.println(array.length);    // 4

    // Replace 100 into the second position of the array
    // Step 3:  Modify element in array
    array[1] = 100;
    // Step 4:  Print all elements in the array.
    System.out.println(array);    // [I@6d06d69c (Object Reference)]
    System.out.println(Arrays.toString(array));    // [8, 100, 10, 50]
    // P.S. Once the above line "Arrays" is input, click "Enter".
    // P.S. Then, the sentence "import java.util.Arrays;" is input.
    
    // double array, length 6
    double[] array2 = new double [6];
    array2[0] = 3.3;
    array2[1] = 3.4;
    array2[2] = 100.9;
    array2[3] = 99.9;
    array2[4] = 1000.9;
    array2[5] = -999.9999;
    System.out.println(Arrays.toString(array2));

    // String array, names, length 5
    String[] array3 = new String[5];
    array3[0] = "John";
    array3[1] = "Vincent";
    array3[2] = "Lucas";
    array3[3] = "Leo";
    array3[4] = "Jennie";
    System.out.println(Arrays.toString(array3));

    // Wrong code
    // array3[-1] = "Peter"

    System.out.println(array3[4]);    // Jennie
    // Print 



  }
}
