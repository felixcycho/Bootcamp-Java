public class SmallPig2a {
  // instance method
  public int normalMethod(int n) {
    int[] arr = new int[] {1, 3, 5, 7, 9, 11, 13};
    // Iterating over an array
    int total = 0;
    for (int i = 0; i < n; i++) {
      total += arr[i];
    }
    return total;
  }

  public static void main(String[] args) {
    SmallPig2a smallPig2a = new SmallPig2a();
    System.out.println(smallPig2a.normalMethod(4));       // 16
  }
}
