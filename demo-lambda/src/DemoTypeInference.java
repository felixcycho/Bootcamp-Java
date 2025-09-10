import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class DemoTypeInference {
  // ! can't do
  // private var age;

  // ! can't do
  // public static var getLength(String x) {
  //   return x.length();
  // }

  // ! can't do
  // public static int getLength(var x) {
  //   return x.length();
  //  }

  public static void main(String[] args) {
    int x = 3;
    var y = 4;      
    // Java 不容許寫 var.
    // Java is Strong & Static
    // ! Static --> compile time --> confirm variable type.       !!!!!!! most important sentence.

    // y = "hello";          // invalid, cannot convert String to int

    Map<String, Integer> map = new HashMap<>();
    map.put("John", 18);
    map.put("Mary", 23);
    for (Map.Entry<String, Integer> entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    for (var entry : map.entrySet()) {
      System.out.println(entry.getKey() + "," + entry.getValue());
    }

    var bird = new Bird();
    var arr = new int[] {1, 2, 3};
    // var n;                               // invalid, because 需要確定 type of variable

    // var sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1;         // invalid
      // Lambda 背後原義, 需要確定 interface (confirm with interface)
    Comparator<Integer> sortByDesc = (i1, i2) -> i1 > i2 ? -1 : 1;
    // java 默認, -1 go first, 1 go last
    





  }
}
