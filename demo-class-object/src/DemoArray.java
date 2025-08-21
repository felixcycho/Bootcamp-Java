import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    String[] arr = new String[] {"John", "Peter", "Lucas"};
    String[] newArr = Arrays.copyOf(arr, arr.length);
    System.out.println(Arrays.toString(arr));
    System.out.println(Arrays.toString(newArr));

    // Sorting
    int[] ages = new int[] {65, 40, 18, 35, 70};
    Arrays.sort(ages); 
    System.out.println(Arrays.toString(ages));    // [18, 35, 40, 65, 70]

    // Types: 8 primitives + String + 8 Wrapper Classes
    


  }
}
