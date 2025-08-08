public class DemoHelloworld {
  public static void main(String[] args) {
    System.out.println("hello world. welcome to bootcamp.");
    System.out.println("I'm Vincent");

    // Comment / Notes 你好
    // You can drop notes here.
    // Java Machine ignores lines starting with //

    // Data Type (int)
    int x = 3;
    int y = 7;
    double radius = 3.4; // double is to store decimal numbers

    System.out.println(x); // 3
    System.out.println(y); // 7
    System.out.println(radius); // 3.4
    
    int a = 10;
    System.out.println(a); // 10

    // ! We cannot re-declare data type for same variable
    // int a = 17;

    // ! We can re-assign the value directly.
    a = 17;
    System.out.println(a); // 17

    // Declaration
    int b;
    // Assignment
    b = 9;
  }
}