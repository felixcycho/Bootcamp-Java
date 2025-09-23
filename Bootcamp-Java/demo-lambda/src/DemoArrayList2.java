import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DemoArrayList2 {
  public static void main(String[] args) {
    // given elements in ArrayList
    List<String> names = Arrays.asList("John", "Mary", "Susan");       // creating new ArrayList Objects
    System.out.println(names);                // [John, Mary, Susan]

    List<String> names2 = List.of("John", "Mary", "Susan");            // List.of, starting from Java 9
    System.out.println(names2);               // [John, Mary, Susan]

    List<String> names3 
      = new ArrayList<>(Arrays.asList("John", "Mary", "Susan"));     // 真正的 ArrayList, 有齊所有 ArrayList 功能
    System.out.println(names3);               // [John, Mary, Susan]

    // names.add("Lucas");                    //  java.lang.UnsupportedOperationException
    // names2.add("Lucas");                   //  java.lang.UnsupportedOperationException
    names3.add("Lucas");
    System.out.println(names3);               // [John, Mary, Susan, Lucas]
    names3.remove(3);
    System.out.println(names3);               // [John, Mary, Susan]

    System.out.println(names.get(0));         // John
    System.out.println(names2.get(0));        // John
    System.out.println(names3.get(0));        // John

    names.set(0, "Felix");
    System.out.println(names);                // [Felix, Mary, Susan]
    // names2.set(0, "Felix");                // List.of() cannot modify element.
    names3.set(0, "Felix");              
    System.out.println(names3);               // [Felix, Mary, Susan]

    // ! Array.asList() vs. List.of()
      // Similarities
        // 1. add & remove are not allowed
      // Differences
        // 1. Arrays.asList() --> able to modify element (i.e. set()), but List.of() cannot)

  }
    
  // ! Solution
    // array --> ArrayList (i.e. Arrays.asList(arr)) 
      // (將 array 轉化成 ArrayList 的方法)
  public List<Integer> findOddNumbers(Integer[] arr) {
    // Arrays.asList + Stream
    return 
      Arrays.asList(arr).stream()
      .filter(e -> e % 2 == 1)
      .collect(Collectors.toList());
    }

}
