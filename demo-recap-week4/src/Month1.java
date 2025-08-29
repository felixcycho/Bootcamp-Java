public class Month1 {
  // private static final Month1 OCTOBER = new Month1(10);
  private int value;

  private Month1(int value) {
    this.value = value;
  }

  // public static Month1 of(int month) {
  // return new Month1(10);
  // }

  public static Month1 October() {
    return new Month1(10);
  }

  public static Month1 March() {
    return new Month1(3);
  }

  public String toString() {
    if (this.value == 3) {
      return "MARCH";
    } else if (this.value == 10) {
      return "OCTOBER";
    } /// .....
    return "";
  }

  public static void main(String[] args) {
    Month1 month = Month1.October();
    System.out.println(month); // "OCTOBER"
    Month1 month2 = Month1.March();
    System.out.println(month2); // "MARCH"

    // ! Difference between Month1.class and Month enum
    // Month1.class is able to create more than 1 October Object.
  }
}
