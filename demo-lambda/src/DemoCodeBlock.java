public class DemoCodeBlock {
  private static int x = 3;
  private static int y = 10;
  private int age;
  private String name;

  public DemoCodeBlock(int age, String name) {
    System.out.println("Constructor ...");
    this.age = age;
    if (name != null) {
      this.name = name;
    }

  }

  // ! Step 1
    // ! Logic being executed before main method
      // static 屬環境變量
  static {
    System.out.println("Static Block ...");
    x++;
  }

  // ! For every object creation, but always execute before constuctor
  {
    System.out.println("Instance Block ...");
    this.name = "Lucas";
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    System.out.println("Starting the program ...");
    DemoCodeBlock cb1 = new DemoCodeBlock(20, "Steven");
    DemoCodeBlock cb2 = new DemoCodeBlock(20, "Mary");
    DemoCodeBlock cb3 = new DemoCodeBlock(20, null);
    System.out.println(cb1.getName());
    System.out.println(cb2.getName());
    System.out.println(cb3.getName());
    
    System.out.println("x = " + x);   // 4

  }
}
