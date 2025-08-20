public class DemoOperator_ClassObject {
  public static void main(String[] args) {
    int x = 3;
    x++;
    System.out.println(x);    // 4

    ++x;
    System.out.println(x);    // 5

    int a = 3;
    int result = ++a * 3;     // 4 * 3
    // Step 1: a become 4.
    // Step 2: 4 * 3
    // Step 3: assign 12 into result

    int b = 3;
    int result2 = b++ * 3;    // 3 * 3
    // Step 1: 3 * 3
    // Step 2: assign 9 into result
    // Step 3: b++ => b = 4

    System.out.println(result);    // 12
    System.out.println(result2);   // 9
    System.out.println(a);         // 4
    System.out.println(b);         // 4

    int c = 3;
    int result3 = c * 3;
    c++;
    System.out.println(result3);    // 9

    int u = 7;
    int result4 = u++ * 2 + ++u;
    System.out.println(u);          // 7 + 1 + 1 = 9
    // Step 1: u => 7 + 1 => 8
    // Step 2: u => 8 + 1 => 9
    System.out.println(result4);    // 23
    // Step 1: u * 2 => 7 * 2 => 14 
    // Step 2: u++, become 8
    // Step 3: ++u, become 9
    // Step 4: result4 => 14 + 9 => 23

    int v = 7;
    int result5 = ++v * 2 + v++;
    System.out.println(v);           // 7 + 1 + 1 => 9
    System.out.println(result5);     // (7 + 1) * 2 + 8 => 24
    

  }
}