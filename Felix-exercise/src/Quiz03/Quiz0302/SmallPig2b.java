class SmallPig2b {
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
    System.out.println(SmallPig2b.normalMethod(4));       // java.lang.Error: Unresolved compilation problem: 
      // Cannot make a static (class) reference to the non-static method normalMethod(int) from the type SmallPig2b
  }
}
