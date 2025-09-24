public class DemoRecursion {
  public static void main(String[] args) {
    
    System.out.println(sum(7, 4));    // 11
    // 1 + 2 + 3 + 4 + ... + 20
    System.out.println(sum(20));      // 210
    // 當然, 亦可以用 for-loop 做.
    // But, for-loop 有損耗 variables, 而上述方法則只需 sum call 自己.
    System.out.println(product(10));    // 3840
  }

  
  public static int sum(int value) {
    // ! exit criteria
    if (value == 1)
      return 1;
    // ! call itself with pattern
    return value + sum(value - 1);
    // 10 + sum(9)
    // 9 + sum(8)
    // ...
    // 2 + sum(1)
  }

  public static int sum(int x, int y) {
    return x + y;
  }
  
  // n = 10
  // 10 * 8 * 6 * 4 * 2
  public static int product(int x) {
    return x % 2 == 1 ? product2(x - 1) : product2(x);
  }

  public static int product2(int x) {
    if (x <= 2) 
      return 2;
    return x * product2(x - 2);
  }



}
