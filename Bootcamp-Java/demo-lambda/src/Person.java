// public class Person {
public record Person (int age, String name) {
  public static final int x = 24;

  public static int getX() {
    return x + 10;
  }
  
  // private int age;
  // private String name;

  // ! With
  // all args consturctor
  // getter
  // toString
  // equals
  // hashCode

  // ! Without
  // setter
  // empty constructor
  
  // constructor
  // getter, setter ...
    // setter 主要用於 game.

  public static void main(String[] args) {
    Person p1 = new Person(3, "John");            // all argument constructor
    System.out.println(p1);                       // toString
    System.out.println(p1.age());                 // getter
    System.out.println(p1.name());                // getter

    // no setter in record
    
    Person p2 = new Person(3, "John");
    System.out.println(p1.equals(p2));            // true, equals()
    System.out.println(p1.hashCode());            // 2314632
    System.out.println(p2.hashCode());            // 2314632




  }

}
