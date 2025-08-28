package src.enum1;
// Examples of enum:
// 1. Gender (Male / Female)
// 2. 香港 18 區
// 3. Choice of occupation (職業)

// Conditions of enum:
// 1. Stable and static, not dynamic (often changed)
// 2. definite number of objects (有限數)
// 3. sequenced (有先後次序)
public class DemoEnum {
  public static void main(String[] args) {
    Book b1 = new Book(1, Color.RED);
    Book b2 = new Book(1, Color.BLUE);
    System.out.println(b1.getColor());
    System.out.println(b2.getColor());

    b2.setColor(Color.YELLOW);
    System.out.println(b2.getColor());

    // equals(), hashCode, toString

    // 8 primitives and enum, should use comparison operator (i.e. ==)
    // In this case, Color.YELLOW is an address. b1.getColor() is also an address, pointing to Color.YELLOW.
    // Thus, "==" verifies whether both addresses are equal.
    // checking address (We have ONLY one Color.RED, one Color.BLUE, one Color.YELLOW in memory.)
    if (b1.getColor() == Color.YELLOW) {
      System.out.println("It is yellow.");
    } else {
      System.out.println("It is not yellow.");
    }

    OrderStatus o1 = OrderStatus.PREPARING;
    System.out.println(o1.getValue());         // 2
    System.out.println(o1);                    // PREPARING
    System.out.println(o1.next());             // DELIVERING
    System.out.println(o1.next().next());      // DELIVERED

    OrderStatus o2 = OrderStatus.PAID;
    System.out.println(o2);                    // PAID
    o2.cancel();
    System.out.println(o2);                    // PAID
    System.out.println(o2.cancel());           // CANCELLED

    OrderStatus o3 = OrderStatus.DELIVERING;
    System.out.println(o3);                    // DELIVERING
    o3.cancel();                               // The order has been processing. Cancellation is prohibited.
    System.out.println(o3.getValue());         // 3
    


  }
}
